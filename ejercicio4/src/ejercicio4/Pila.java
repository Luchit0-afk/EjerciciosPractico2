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
    private int max = 2;

    public Pila(){
    	pila = new int[max];
    	cant = 0;
    }

    //Asumo que el int pasado es menor a 250
    public Pila(int m){
        if(m > max){
            System.out.println("Tirar excepcion");
        }
        else{
            pila = new int[m];
            cant = 0;
        }

    }

    public boolean is_empy(){
    	return cant == 0;
    }

    public Pila is_full(){
        int aMax = max;
        max = aMax + ((0.5)* aMax);
        System.out.println(max);
        Pila pilaAux = new Pila(max);
        System.out.println("Se ha excedido el numero maximo del arreglo. Estamos aumentando este numero.");
        for(int i = 0; i < aMax - 1; i++){
             pilaAux.ins(pila.tope());
             pila.del();
         }
        System.out.println("El nuevo maximo es de: " + max);
        return this;
    }

    public void ins(int n){
        if(cant == max){
            pila.is_full();
        }
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
