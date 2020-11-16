/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
* Clase auxiliar para árboles binarios implementados con nodos encadenados.
*/
public class NodoBinario<T> {

   protected T valor;
   protected NodoBinario<T> izquierdo;
   protected NodoBinario<T> derecho;
   
   public static <E> NodoBinario<E> nuevaHoja(E valor) {
      return new NodoBinario<>(valor, null, null);
   }
   
   public static <E> NodoBinario<E> conIzquierdo(E valor, NodoBinario<E> izquierdo) {
      return new NodoBinario<>(valor, izquierdo, null);
   }
   
   public static <E> NodoBinario<E> conDerecho(E valor, NodoBinario<E> derecho) {
      return new NodoBinario<>(valor, null, derecho);
   }
   
   public NodoBinario(T valor, NodoBinario<T> izquierdo, NodoBinario<T> derecho) {
      this.valor = valor;
      this.izquierdo = izquierdo;
      this.derecho = derecho;
   }
   
   public T valor() {
      return valor;
   }
   
   public void valor(T nuevoValor) {
      valor = nuevoValor;
   }
   
   public NodoBinario<T> izquierdo() {
      return izquierdo;
   }
   
   public void izquierdo(NodoBinario<T> nuevoIzquierdo) {
      izquierdo = nuevoIzquierdo;
   }
   
   public NodoBinario<T> derecho() {
      return derecho;
   }
   
   public void derecho(NodoBinario<T> nuevoDerecho) {
      derecho = nuevoDerecho;
   }
  
   public void vaciar(){
       valor = null;
       derecho = null;
       izquierdo = null;
   }
}
