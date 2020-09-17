/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaconlistaencadenada;

/**
 *
 * @author Luciano
 */
public class Nodo<T> {

	private T elem;
	private Nodo<T> siguiente;
        
        public Nodo(){
            this.siguiente = null;
        }
        
	public Nodo(T elem) {
		this(elem, null);
	}

	public Nodo(T elem, Nodo<T> siguiente) {
		this.elem = elem;
		this.siguiente = siguiente;
	}

	public T elem() {
		return elem;
	}

	public Nodo<T> siguiente() {
		return siguiente;	
	}

	public void elem(T elem) {
		this.elem = elem;	
	}

	public void siguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;	
	}

}
