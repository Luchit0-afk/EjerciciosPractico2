/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Luciano
 */
public class Pila {
    private int pila[];
    private int cant;
    private final int max = 250;

    public Pila(){
    	pila = new int[250];
    	cant = 0;
    }

    //Asumo que el int pasado es menor a 250
    public Pila(int m){
    	pila = new int[m];
    	cant = 0;
    }

    public boolean is_empy(){
    	return cant == 0;
    }

    public void ins(int n){
    	if(cant != 0){
      		for(int i = cant; i> 0;i--){
    			pila[i] = pila[i - 1];
    		}
    	}
    	pila[0] = n;
    	cant++;
    }

    public void del(){
    	for(int i = 0; i < cant - 1;i++){
    		pila[i] = pila[i+1];
    	}
    	cant--;
    }

    public int tope(){
    	return pila[0];
    }

    public int maxCant(){
    	return cant;
    }

    public void show(){
    	System.out.print("[");
    	for(int i = 0; i < cant ; i++){
    		System.out.print(" " + pila[i] + " ");
    	}
    	System.out.println("]");
    }

    public void reverse(){
    	System.out.print("[");
    	for(int i = cant; i > 0; i--){
			System.out.print(" " + pila[i] + " ");
    	}
    	System.out.println("]");
    }
}
