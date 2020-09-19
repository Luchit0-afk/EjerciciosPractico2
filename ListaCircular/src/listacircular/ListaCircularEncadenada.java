/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacircular;

/**
 *
 * @author Luciano
 */
public class ListaCircularEncadenada<T> extends ListaEncadenada<T>{

	//private Nodo<T> ult = null;
	//private int cant = 0;

	public ListaCircularEncadenada(){
		this.setRaiz(null);
		this.setCant(0);
	}

	public ListaCircularEncadenada(T elem){
		Nodo<T> nuevoNodo = new Nodo<>(elem);
		this.setRaiz(nuevoNodo);
        nuevoNodo.siguiente(raiz);
        int c = getCant();
		this.setCant(c + 1 );
	}

    @Override
    public void ins(T elem , int index){
        if(index < 0 || index > (this.getCant())) throw new IllegalStateException("Posicion invalida.");
        if(index == 0){
            Nodo<T> nuevoNodo = new Nodo<>(elem);
            this.setRaiz(nuevoNodo);
            nuevoNodo.siguiente(raiz);
            int c = getCant();
            this.setCant(c + 1 );
        }
        else{
            Nodo<T> nuevoNodo = new Nodo<>(elem);
            Nodo<T> aux = this.getRaiz();
            for(int i = 0 ; i < (index - 1) ; i++){
                aux = aux.siguiente();
            }
            nuevoNodo.siguiente(aux.siguiente());
            aux.siguiente(nuevoNodo);
        }
        int c = this.getCant();
        this.setCant(c + 1);   
    }

    @Override
    public void show(){
        Nodo<T> show = this.getRaiz();
        System.out.print("[");
        for(int i = 0 ; i < this.getCant() - 1 ; i++){
            System.out.print(" " + show.elem() + " ");
            show = show.siguiente();
        }
        System.out.println("]");
    }
        
}
