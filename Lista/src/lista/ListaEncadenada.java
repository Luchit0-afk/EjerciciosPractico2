/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author Luciano
 */
public class ListaEncadenada<T> implements Lista<T> {
    
    Nodo<T> raiz = null;
    private int cant = 0;

    public Nodo<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
	public ListaEncadenada(){}

	public ListaEncadenada(T elem){
		Nodo<T> nuevoNodo = new Nodo<>(elem);
		raiz = nuevoNodo;
		cant++;
	}

    @Override
	public boolean esVacia(){
		return (cant == 0);
	}

    @Override
	public void vaciar(){
		raiz = null;
		cant = 0;
	}

    @Override
	public void ins(T elem, int index){
		if(index < 0 || index > this.cant()) throw new IllegalStateException("Posicion invalida");
		if(index == 0){
			Nodo<T> nuevoNodo = new Nodo<>(elem);
			raiz = nuevoNodo;
		}
		else{
			Nodo<T> nuevoNodo = new Nodo<>(elem);
			Nodo<T> aux = raiz;
			for(int i = 0 ; i < (index - 1); i++){
				aux = aux.siguiente();
			}
			nuevoNodo.siguiente(aux.siguiente());
			aux.siguiente(nuevoNodo);
		}
		cant++;
    }

	//preguntar a simon sobre la asignacion a null.
	@Override
	public void del(int index){
		if(index < 0 || index > (this.cant - 1) || this.esVacia()) throw new IllegalStateException("Posicion invalida.");
		if(index == 0) raiz = raiz.siguiente();
		else{
			Nodo<T> aux = raiz;
			for(int i = 0 ; i < (index - 1) ; i++){
				aux = aux.siguiente();
			}
			Nodo<T> aux2 = aux.siguiente();
			aux.siguiente(aux2.siguiente());
			//aux2.siguiente(null);
		}
		cant--;
	}

	public int cant(){
		return cant;
	}


	//Verificar
	@Override
    public String toString(){
    	return ((String) raiz.elem());
    }

	public void show(){
		Nodo<T> show = raiz;
		System.out.print("[");
		while(show != null){
			System.out.print(" " + show.elem() + " ");
			show = show.siguiente();
		}
		System.out.println("]");
	}
}
