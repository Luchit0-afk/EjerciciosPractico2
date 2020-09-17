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
public class Pila {
    private char pila[];
    private int cant;
    private int max = 250;

    public Pila(){
    	pila = new char[max];
    	cant = 0;
    }

    //Asumo que el int pasado es menor a 250
    public Pila(int m){
            pila = new char[m];
            cant = 0;
            max = m;
    }
    
    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    public boolean is_empy(){
    	return cant == 0;
    }

    public void ins(char n){
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

    public void show(){
    	System.out.print("[");
    	for(int i = 0; i < cant ; i++){
    		System.out.print(" " + pila[i] + " ");
    	}
    	System.out.println("]");
    }
}
