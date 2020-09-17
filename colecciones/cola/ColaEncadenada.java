package colecciones.cola;

import colecciones.nodos.Nodo;
import java.util.Collection;

/**
* Implementación basada en nodos simplemente encadenados de la interfaz {@code Cola}.
* @see colecciones.cola.Cola
*/
public class ColaEncadenada<T> implements Cola<T> {

	/**
	* Referencia al primer elemento a desencolar
	*/
	private Nodo<T> primero = null;
	/**
	* Referencia al último elemento encolado
	*/
	private Nodo<T> ultimo = null;
	/**
	* Cantidad de elementos en la cola
	*/
	private int elementos = 0;

	/**
	* Construye una cola vacía.
	*/
	public ColaEncadenada() {}

	/**
	* Construye una cola a partir de elementos en una colección.
	* Los elementos en la colección se encolan de izquierda a derecha
	* @param elems los elementos a agregar a la cola
	*/
	public ColaEncadenada(Collection<T> elems) {
		if (elems == null)
			throw new IllegalArgumentException("elems es null");
		for (T e : elems) {
			encolar(e);		
		}
	}

	@Override
	public boolean esVacia() {
		return elementos;
	}

	@Override
	public int elementos() {
		return elementos;
	}

	@Override
	public boolean encolar(T elem) {
		if(this.is_empty()){
			Nodo<T> nuevoNodo = new Nodo<T>(elem);
			primero = nuevoNodo;
			ultimo = nuevoNodo;
			elementos++;
		}
		else{
			Nodo nuevoNodo = new Nodo(elem,null);
			ultimo.siguiente(nuevoNodo);
			ultimo = nuevoNodo;
			elementos++;
		}		
	}

	@Override
	public T desencolar() {
		if(this.esVacia()){
			throw new IllegalStateException("La lista esta vacia.");
		}
		else{
			primero = primero.siguiente();
			elementos--;
		}
	}

	@Override
	public T primero() {
		if(this.esVacia()) throw new IllegalStateException("La lista esta vacia.");
		else{
			primero.elem();
		}	
	}

	@Override
	public void vaciar() {
		primero = ultimo = null;	
	}

	@Override
	public boolean repOK() {
		throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");	
	}

	@Override
	public String toString() {
		throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");	
	}

	@Override
	public boolean equals(Object other) {
		throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");	
	}

	//AUXILIAR BORRAR
	public void show(){
		Nodo<T> show = primero;
		while(show != null){
			System.out.print(show.elem());
		}
		System.out.println();
	}

}
