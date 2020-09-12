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
    private int max;

    public Pila(){
        max = 2;
    	pila = new int[max];
    	cant = 0;
    }

    //Asumo que el int pasado es menor a 250
    public Pila(int m){
            pila = new int[m];
            cant = 0;
            max = m;
            //System.out.println(this.max);
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

    public void ins(int n){
        if(cant == max){
            this.is_full();
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

    public Pila is_full(){
        int aCant = this.cant;
        Pila pilaAux = new Pila(max*2);
        //System.out.println("Se ha excedido el numero maximo del arreglo. Estamos aumentando este numero.");
        for(int i = 0; i < this.cant - 1; i++){
            pilaAux.ins(this.tope());
            this.del();
            //pilaAux.show();
        }
        //this.show();
        max = max*2;
        pilaAux.setCant(aCant);
        //pilaAux.show();
        //pilaAux.reverse();
        //pilaAux.show();
        return pilaAux;
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
