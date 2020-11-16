/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;


import arbol.ArbolBinario.Orden;
import java.util.List;
import java.util.LinkedList;

/**
* Una implementación de {@code ArbolBinario} mediante nodos encadenados (un nodo con referencia a un nodo izquierdo y otro derecho).
* Esta implementación provee tres métodos estáticos para construir árboles:
* <ul>
* <li>arbolVacio()                                                         : construye un nuevo árbol vacío.</li>
* <li>hoja({@code T})                                                      : construye un árbol con una raíz y sin subarboles.</li>
* <li>arbol({@code T}, {@code ArbolBinario<T>}, {@code ArbolBinario<T>})   : construye un árbol a partir de una raíz y un subarbol izquierdo y uno derecho.</li>
* </ul>
* @param <T> el tipo del valor asociado a cada nodo del árbol.
* @see NodoBinario
*/
public class ArbolBinarioEncadenado<T> implements ArbolBinario<T> {


   protected NodoBinario<T> raiz;

   /**
   * Construye un nuevo árbol vacío.
   * @param <E> el tipo del valor asociado a cada nodo del árbol.
   * @return un nuevo árbol vacío.
   */
   public static <E> ArbolBinarioEncadenado<E> arbolVacio() {
      return new ArbolBinarioEncadenado<>(null, null, null);
   }
   
   /**
   * Construye un árbol con una raíz y sin subarboles.
   * @param <E> el tipo del valor asociado a cada nodo del árbol.
   * @param valor el valor de la raíz
   * @return un nuevo árbol con solo un nodo raíz
   */
   public static <E> ArbolBinarioEncadenado<E> hoja(E valor) {
      return new ArbolBinarioEncadenado<>(valor, null, null);
   }
   
   /**
   * Construye un árbol a partir de una raíz y un subarbol izquierdo y uno derecho.
   * @param <E> el tipo del valor asociado a cada nodo del árbol.
   * @param raiz valor el valor de la raíz, no puede ser {@code null}
   * @param subArbolIzquierdo el subarbol izquierdo, puede ser {@code null}
   * @param subArbolDerecho el subarbol derecho, puede ser {@code null}
   * @return un nuevo árbol con una raíz con el valor {@code raiz} y los subarboles izquierdo y derecho correspondientes a los argumentos
   */
   public static <E> ArbolBinarioEncadenado<E> arbol(E raiz, ArbolBinario<E> subArbolIzquierdo, ArbolBinario<E> subArbolDerecho) {
      ArbolBinarioEncadenado<E> izquierdo = subArbolIzquierdo==null?null:transformarEnArbolEncadenado(subArbolIzquierdo);
      ArbolBinarioEncadenado<E> derecho = subArbolDerecho==null?null:transformarEnArbolEncadenado(subArbolDerecho);
      ArbolBinarioEncadenado<E> nuevoArbol = new ArbolBinarioEncadenado<>(raiz, izquierdo.raiz, derecho.raiz);
      return nuevoArbol;
   }
   
   /* (non-Javadoc)
   * Convierte un ArbolBinario a un ArbolBinarioEncadenado.
   */
   @SuppressWarnings("unchecked")
   private static <E> ArbolBinarioEncadenado<E> transformarEnArbolEncadenado(ArbolBinario<E> arbol) {
      if (arbol instanceof ArbolBinarioEncadenado<?>)
         return (ArbolBinarioEncadenado<E>) arbol;
      if (arbol.esVacio())
         return arbolVacio();
      if (arbol.elementos() == 1)
         return hoja(arbol.raiz());
      ArbolBinarioEncadenado<E> izquierdo = transformarEnArbolEncadenado(arbol.subArbolIzquierdo());
      ArbolBinarioEncadenado<E> derecho = transformarEnArbolEncadenado(arbol.subArbolDerecho());
      return new ArbolBinarioEncadenado<E>(arbol.raiz(), izquierdo.raiz, derecho.raiz);
   }
   
   protected ArbolBinarioEncadenado(T raiz, NodoBinario<T> subArbolIzquierdo, NodoBinario<T> subArbolDerecho) {
      if (raiz == null && (subArbolIzquierdo != null || subArbolDerecho != null))
         throw new IllegalArgumentException("raiz solo puede ser null cuando todos los argumentos son null");
      this.raiz = NodoBinario.nuevaHoja(raiz);
      this.raiz.izquierdo(subArbolIzquierdo);
      this.raiz.derecho(subArbolDerecho);
   }
   
   
   /**{@inheritDoc}*/
   @Override
   public ArbolBinario<T> unirADerecha(T raiz, ArbolBinario<T> subArbolIzquierdo) {
      if(raiz == null) throw new IllegalArgumentException("Raiz no puede ser null");
      //if(raiz == null && this.equals(subArbolIzquierdo)) throw new IllegalArgumentException("Raiz no puede ser null");
      ArbolBinario<T> nuevoArbol = arbol(raiz, subArbolIzquierdo ,this);
      return nuevoArbol;
   }
   
   /**{@inheritDoc}*/
   @Override
   public ArbolBinario<T> unirAIzquierda(T raiz, ArbolBinario<T> subArbolDerecho) {
      if(raiz == null) throw new IllegalArgumentException("Raiz no puede ser null");
      ArbolBinario<T> nuevoArbol = arbol(raiz, this ,subArbolDerecho);
      return nuevoArbol;
   }
   
   /**{@inheritDoc}*/
   @Override
   public void vaciar() {
      raiz.valor(null);
      raiz.izquierdo(null);
      raiz.derecho(null);
   }
   
   /**{@inheritDoc}*/
   @Override
   public T raiz() {
      if (esVacio())
         throw new IllegalArgumentException("el árbol está vacío");
      return raiz.valor();
   }

   /**{@inheritDoc}*/
   @Override
   public ArbolBinario<T> subArbolIzquierdo() {
      if(raiz.izquierdo() == null){
         return null;
      }
      else{
         ArbolBinario<T> nuevoArbol = new ArbolBinarioEncadenado(raiz.izquierdo().valor() , raiz.izquierdo().izquierdo() , raiz.izquierdo().derecho());
         return nuevoArbol;
      }
   }
   
   /**{@inheritDoc}*/
   @Override
   public ArbolBinario<T> subArbolDerecho() {
      if(raiz.derecho() == null){
         return null;
      }
      else{
         ArbolBinario<T> nuevoArbol = new ArbolBinarioEncadenado(raiz.derecho().valor() , raiz.derecho().izquierdo() , raiz.derecho().derecho());
         return nuevoArbol;
      }

   }
   
   //Testeada
   /**{@inheritDoc}*/
   @Override
   public int elementos() {
       if(this.esVacio()){
         return 0;
       }
       if(this.raiz.izquierdo() != null && this.raiz.derecho() == null){
           return 1 + this.subArbolIzquierdo().elementos();
       }
       if(this.raiz.izquierdo() == null && this.raiz.derecho() != null){
           return 1 + this.subArbolDerecho().elementos();
       }
       if(this.raiz.izquierdo() == null && this.raiz.derecho() == null){
           return 1;
       }
       else{
         return 1 + this.subArbolIzquierdo().elementos() + this.subArbolDerecho().elementos(); 
       }
   }
   
   /**{@inheritDoc}*/
   @Override
   public int altura() {
      if(this.esVacio()){
         return 0;
      }
      if(this.raiz.izquierdo() == null && this.raiz.derecho() == null){
         return 1;
      }
      else{
         return 1 + Math.max(this.subArbolIzquierdo().altura() , this.subArbolDerecho().altura());
      }
   }
   
   /**{@inheritDoc}*/
   @Override
   public boolean esVacio() {
      if(raiz == null ||(raiz.valor() == null && raiz.izquierdo() == null && raiz.derecho() == null)){
          return true;
      }
      else{
          return false;
      }
   }
   
   /**{@inheritDoc}*/
   @Override
   public List<T> aLista() {
      return aLista(Orden.INORDER);
   }
   
   /**{@inheritDoc}*/
   @Override
   public List<T> aLista(Orden orden) {
      List<T> elementos = new LinkedList<>();
      switch (orden) {
         case INORDER : return aListaInOrder(raiz, elementos);
         case PREORDER : return aListaPreOrder(raiz, elementos);
         case POSTORDER : return aListaPostOrder(raiz, elementos);
      }
      return elementos;
   }
   
   /* (non-Javadoc)
   * Este método toma un nodo (que puede ser null), una lista de elementos (que no puede ser null)
   * y va llenando la lista con los elementos del árbol según un recorrido in order.
   * Si bien el prefil está pensando para una implementación recursiva, puede probar con una implementación iterativa.
   */
   private List<T> aListaInOrder(NodoBinario<T> raiz, List<T> elementos) {
      if(raiz == null){
         return elementos;
      }
      if(raiz.izquierdo() != null){
         this.aListaInOrder(raiz.izquierdo(),elementos);
      }
      elementos.add(raiz.valor());
      if(raiz.derecho() != null){
         this.aListaInOrder(raiz.derecho(),elementos);
      }
      return elementos;
   }
   
   /* (non-Javadoc)
   * Este método toma un nodo (que puede ser null), una lista de elementos (que no puede ser null)
   * y va llenando la lista con los elementos del árbol según un recorrido pre order.
   * Si bien el prefil está pensando para una implementación recursiva, puede probar con una implementación iterativa.
   */
   private List<T> aListaPreOrder(NodoBinario<T> raiz, List<T> elementos) {
      if(raiz == null){
         return elementos;
      }
      elementos.add(raiz.valor());
      if(raiz.izquierdo() != null){
         this.aListaInOrder(raiz.izquierdo(),elementos);
      }
      if(raiz.derecho() != null){
         this.aListaInOrder(raiz.derecho(),elementos);
      }
      return elementos;
   }
   
   /* (non-Javadoc)
   * Este método toma un nodo (que puede ser null), una lista de elementos (que no puede ser null)
   * y va llenando la lista con los elementos del árbol según un recorrido post order.
   * Si bien el prefil está pensando para una implementación recursiva, puede probar con una implementación iterativa.
   */
   private List<T> aListaPostOrder(NodoBinario<T> raiz, List<T> elementos) {
      if(raiz == null){
         return elementos;
      }
      if(raiz.izquierdo() != null){
         this.aListaInOrder(raiz.izquierdo(),elementos);
      }
      if(raiz.derecho() != null){
         this.aListaInOrder(raiz.derecho(),elementos);
      }
      elementos.add(raiz.valor());
      return elementos;
   }
   
   /**{@inheritDoc}*/
   @Override
   public T[] aArreglo() {
      return aArreglo(Orden.INORDER);
   }
   
   /**{@inheritDoc}*/
   /**
   * Debe usarse
   */
   @Override
   public T[] aArreglo(Orden orden) {
      /**
      int cant = this.elementos();
      Object[] elementos = new Object[cant];
      List<T> elementosLista = new LinkedList<>();
      elementosLista = this.aLista();
      elementos = elementosLista.toArray();
      switch(orden){
         case INORDER : return aArregloInOrder(raiz, elementos);
         case PREORDER : return aArregloPreOrder(raiz, elementos);
         case POSTORDER : return aArregloPostOrder(raiz, elementos);
      }
      return elementos;
      */
    T[] elementos = (T[]) new Comparable[this.elementos()];
    switch (orden) {
         case INORDER : return aArregloInOrder(raiz,elementos);
         case PREORDER : return aArregloPreOrder(raiz, elementos);
         case POSTORDER : return aArregloPostOrder(raiz, elementos);
    }
    return elementos;

   }


   private T[] aArregloInOrder(NodoBinario<T> raiz, T[] elementos) {
        List<T> arbol = new LinkedList<>();
        arbol = this.aLista(Orden.INORDER);
        for(int i = 0 ; i < arbol.size() ;i++){
            elementos[i] = (T) arbol.get(i);
        }
        return elementos;
   }

   private T[] aArregloPreOrder(NodoBinario<T> raiz, Object[] elementos) {
        List<T> arbol = new LinkedList<>();
        arbol = this.aLista(Orden.PREORDER);
        for(int i = 0 ; arbol != null ;i++){
            elementos[i] = (T) arbol.get(i);
        }
        return (T[]) elementos;
   }

   private T[] aArregloPostOrder(NodoBinario<T> raiz, Object[] elementos) {
        List<T> arbol = new LinkedList<>();
        arbol = this.aLista(Orden.POSTORDER);
        for(int i = 0 ; arbol != null ;i++){
            elementos[i] = (T) arbol.get(i);
        }
        return (T[]) elementos;
   }
   
   /**{@inheritDoc}*/
   @Override
   public boolean repOK() {
      return true;
   }
   
   /**{@inheritDoc}*/
   @Override
   public String toString() {
      List<T> elementos = new LinkedList<>();
      elementos = this.aLista();
      return elementos.toString();
   }
   
   /**{@inheritDoc}*/
   @Override
   public boolean equals(Object other) {
      throw new UnsupportedOperationException("TODO: implementar");
   }

}
