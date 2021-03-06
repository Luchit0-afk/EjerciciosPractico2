package Pila;

import java.util.Collection;

/**
* Implementación basada en nodos simplemente encadenados de la interfaz {@code Pila}.
* @see colecciones.pila.Pila
*/
public class PilaEncadenada<T> implements Pila<T> {

	/**
	* Referencia al tope de la pila
	*/
	private Nodo<T> tope = null;
	/**
	* Cantidad de elementos en la pila
	*/
	private int elementos = 0;


	/**
	* Construye una pila vacía.
	*/
	public PilaEncadenada() {}

	/**
	* Construye una pila a partir de elementos en una colección.
	* Los elementos en la colección se apilan de izquierda a derecha
	* @param elems los elementos a agregar a la pila
	*/
	public PilaEncadenada(Collection<T> elems) {
		if (elems == null)
			throw new IllegalArgumentException("parametro elems es null");
		for (T e : elems) {
			apilar(e);
		}
	}

	//@Override
	public boolean apilar(T e) {
		Nodo<T> nuevoNodo = new Nodo<>(e,tope);
		tope = nuevoNodo;
		elementos++;
                return true;
	}


	//@Override
	public void vaciar() {
		tope = null;
		elementos = 0;
	}

	//@Override
	public boolean esVacia() {
		return tope == null;
	}

	//@Override
	public T tope() {
		if (esVacia())
			throw new IllegalStateException("La pila esta vacia");
		return tope.elem();
	}

	//@Override
	public T desapilar() {
		if(esVacia()) throw new IllegalStateException("La pila esta vacia");
		T r = this.tope();
                tope = tope.siguiente();
                return r;
	}

	//@Override
	public int elementos() {
		return elementos;
	}

	//@Override
	public boolean repOK() {
		throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");
		//TODO: completar
		//no debe haber ciclos
		//la cantidad de nodos accesibles desde tope debe ser igual a el valor del atributo elementos	
	}

	@Override
	public String toString() {
		return (String) (this.tope());	
	}

	@Override
	public boolean equals(Object other) {
		throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");
	//	if (this != other) return false;
	//	if (other != null) return false;
	//	if (other == this){

	//	}
	}

	//AUXILIAR,BORRAR
	public void show(){
		Nodo<T> show = tope;
		while(show != null){
			System.out.print(show.elem());
                        show = show.siguiente();
		}
		System.out.println();
                
	}

}