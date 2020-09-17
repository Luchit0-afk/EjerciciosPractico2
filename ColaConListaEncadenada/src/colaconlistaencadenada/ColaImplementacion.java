/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaconlistaencadenada;

import java.util.Collection;

/**
 *
 * @author Luciano
 */
public class ColaImplementacion<T> implements ColaInterface<T> {

	private Nodo<T> raiz;
	private Nodo<T> ult;
	private int cant;

	public ColaImplementacion(){
		raiz = null;
		ult = null;
		cant = 0;
	}

	public ColaImplementacion(Collection<T> elems){
		this();
		if(elems == null){
			throw new IllegalArgumentException("La coleccion esta vacia.");
		}
		else{
			for(T e : elems){
			encolar(e);
			}
		}
	}

	public boolean is_empty(){
		return (cant == 0);
	}

	public void empty(){
		raiz = null;
		ult = null;
		cant = 0;
	}

	public void encolar(T elem){
		if(this.is_empty()){
			Nodo nuevoNodo = new Nodo(elem);
			raiz = nuevoNodo;
			ult = nuevoNodo;
			cant++;
		}
		else{
			Nodo nuevoNodo = new Nodo(elem,null);
			ult.siguiente(nuevoNodo);
			ult = nuevoNodo;
			cant++;
		}
	}

	public void desencolar(){
		if(this.is_empty()){
			throw new IllegalStateException("La lista esta vacia.");
		}
		else{
			raiz = raiz.siguiente();
			cant--;
		}
	}

	public T obtener(){
		if(this.is_empty()){
			throw new IllegalStateException("La lista esta vacia.");
		}
		else{
			return raiz.elem();
		}
	}

	public int length(){
		return cant;
	}

    public void show(){
    	Nodo show = raiz;
    	System.out.print("[");
    	while(show != null){
    		System.out.print(" " + show.elem() + " ");
    		show = show.siguiente();
    	}
    	System.out.println("]");
    }
}
