/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abb;

import arbol.ArbolBinario;
import arbol.ArbolBinarioEncadenado;
import arbol.NodoBinario;
import static arbol.ArbolBinarioEncadenado.hoja;
import static arbol.NodoBinario.nuevaHoja;

/**
 *
 * @author Luciano
 * @param <T>
 */
public class ABBencadenado<T extends Comparable<? super T>> extends ArbolBinarioEncadenado<T> implements ABB<T> {
   
    public ABBencadenado(T raiz, arbol.NodoBinario<T> subArbolIzquierdo, arbol.NodoBinario<T> subArbolDerecho) {
        super(raiz, subArbolIzquierdo, subArbolDerecho);
    }
    
    public ABBencadenado() {
        super(null, null, null);
    }
    
    public ABBencadenado(T raiz) {
        super(raiz, null, null);
    }
    
    
    /*
    @Override
    public ABB<T> buscar(T elem) {
        ABB<T> abb = null;
        if(raiz == null) return new ABBencadenado<>();
        if(raiz.valor().compareTo(elem) == 0) return this;
        if(raiz.valor().compareTo(elem) > 0){
            //ABBencadenado der = (ABBencadenado) this.subArbolDerecho();
            //return der.buscar(elem);
            if(this.subArbolDerecho() == null){
                return new ABBencadenado<T>();
            }
            else{
                return this.subArbolDerecho().buscar(elem);
            }
        }
        else{
            if(this.subArbolIzquierdo() == null){
                return new ABBencadenado<T>();           
            }
            else{
                return this.subArbolDerecho().buscar(elem);
            }
        }
    }
    */
    public ABB<T> buscar(T elem) {
        ABB<T> abb = null;
        if(!this.esVacio()){
            if(raiz.valor() == elem){
                return this;
            }
            else{
                if(raiz.valor().compareTo(elem) > 0){
                    abb = this.subArbolIzquierdo().buscar(elem);
                }
                else{
                    abb = this.subArbolDerecho().buscar(elem);
                }
            }
        }
        return abb;
    }
    
    @Override
    public ABBencadenado<T> insertar(T elem) {
        if(this.esVacio()){
            this.raiz = new NodoBinario<T>(elem, null, null);
        }
        if(raiz.valor().compareTo(elem) < 0){
            if(this.subArbolDerecho() == null){
                NodoBinario<T> hoja = NodoBinario.nuevaHoja(elem);
                this.raiz.derecho(hoja);
            }
            else{
                subArbolDerecho(this.subArbolDerecho().insertar(elem));
            }
        }
        else if(raiz.valor().compareTo(elem) > 0){
            if(this.subArbolIzquierdo() == null){
                NodoBinario<T> hoja = NodoBinario.nuevaHoja(elem);
                this.raiz.izquierdo(hoja);
            }
            else{
                subArbolIzquierdo(this.subArbolIzquierdo().insertar(elem));
            }
        }

        return this;
    }

   @Override
   public void eliminar(T elem){
       raiz = borrarNodo(elem, raiz);
   } 
   
   /**
    * Metodo auxiliar que elimina un nodo y lo remplaza por el maximo de su parte izquierda
    * @param elem elemento a eliminar
    * @param raiz arbol donde se eliminara un nodo
    * @return el arbol pasado en raiz pero sin el nodo elem y en su lugar el maximo de su parte izquierda.
    * Si no encuentra elem deja el arbol como esta
    */
   private NodoBinario<T> borrarNodo(T elem, NodoBinario<T> raiz){
       if(raiz == null || raiz.valor() == null){
           return raiz;
       }
       if(raiz.valor().compareTo(elem) < 0){
           raiz.derecho(borrarNodo(elem,raiz.derecho()));
       }
       else{
           if(raiz.valor().compareTo(elem) > 0){
               raiz.izquierdo(borrarNodo(elem,raiz.izquierdo()));
           }
           else{
               if(raiz.izquierdo() == null){
                   return raiz.derecho();
               }
               if(raiz.derecho() == null){
                   return raiz.izquierdo();
               }
               NodoBinario<T> nodoMaxIzq = buscarMax(raiz.izquierdo());
               raiz.valor(nodoMaxIzq.valor());
               raiz.izquierdo(borrarNodo(raiz.valor(),raiz.izquierdo()));
           }
       }
       return raiz;
   }
   
   
   /**
    * Busca el maximo valor en raiz
    * @param raiz raiz del arbol a buscar
    * @return el maximo de raiz
    */
   private NodoBinario<T> buscarMax(NodoBinario<T> raiz){
       if(raiz == null || raiz.valor() == null){
           throw new IllegalArgumentException("No se puedo buscar maximo en null");
       }
       if(raiz.derecho() != null){
           return buscarMax(raiz.derecho());
       }
       return raiz;
   }
   
    /**
     * @return el subArbolDerecho del arbol 
     */
   @Override
   public ABBencadenado<T> subArbolDerecho() {
      if(raiz.derecho() == null){
         return null;
      }
      else{
         return new ABBencadenado(raiz.derecho().valor() , raiz.derecho().izquierdo() , raiz.derecho().derecho());
      }

   }
   /**
    * @return el subArbolIzquierdo del arbol 
    */
   @Override
    public ABBencadenado<T> subArbolIzquierdo() {
      if(raiz.izquierdo() == null){
         return null;
      }
      else{
         return new ABBencadenado(raiz.izquierdo().valor() , raiz.izquierdo().izquierdo() , raiz.izquierdo().derecho());
       }
    }
    
    /**
     * Le asigna al nodo derecho la raiz del parametro
     * @param nuevoArbol arbol a colocar a la derecha
     */
    private void subArbolDerecho(ABBencadenado<T> nuevoArbol){
        raiz.derecho(nuevoArbol.raiz);
    }
    /**
     * Le asigna al nodo izquierdo la raiz del parametro
     * @param nuevoArbol arbol a colocar a la izquierdo
     */
    private void subArbolIzquierdo(ABBencadenado<T> nuevoArbol){
        raiz.izquierdo(nuevoArbol.raiz);
    }
    /**
     * Evalua si un arbol es una hoja
     * @return true sii el arbol es una hoja
     */
    private boolean esHoja(){
        return (this.subArbolDerecho() == null && this.subArbolIzquierdo() == null);
    }
    
    @Override
    public boolean repOK(){
        if(this.esHoja()){
            return true;
        }
        if(raiz.derecho() == null && raiz.izquierdo() != null){
           return this.subArbolIzquierdo().repOK();
        }
        if(raiz.derecho() != null && raiz.izquierdo() == null){
           return this.subArbolDerecho().repOK();
        }
        if(raiz.derecho() != null && raiz.izquierdo() != null){
            if(raiz.valor().compareTo(raiz.derecho().valor()) < 0 && raiz.valor().compareTo(raiz.izquierdo().valor()) > 0){
                return this.subArbolDerecho().repOK() && this.subArbolIzquierdo().repOK();
            }
            else{
                return false;
            }
        }
        return false;
    }
    
    public T[] treeSort(T[] array, int cant){
        ABBencadenado<T> abb = new ABBencadenado<>(); 
        for (int i = 0; i < cant;i++) {
            abb.insertar(array[i]);
        }
        NodoBinario<T> max;
        int i = 0;
        while(!abb.esVacio()){
            max = abb.buscarMax(abb.raiz);
            array[i] = max.valor();
            i++;
            abb.eliminar(max.valor());
        }
        return array;
    }
    
}
