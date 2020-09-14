/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadlistaconarreglos;

/**
 *
 * @author Luciano
 */

import java.util.Scanner;

public class Lista {
    private Object[] items;
    private int cant;
    private int max = 250;

    public Lista(){
    	items = new Object[max];
    	cant = 0;
    }

    public Lista(int m) throws IndiceFueraDeRango{
    	if(m > max){
    		throw new IndiceFueraDeRango();
    	}
    	else{
    		items = new Object[m];
    		cant = 0;
    	}
    }
    
    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

   	public boolean is_empy(){
   		return (cant == 0);
   	}

   	public void vaciar(){
   		cant = 0;
   	}

   	public void add(int index,Object item) throws IndiceFueraDeRango{
   		if(index > cant || index < 0){
   			throw new IndiceFueraDeRango();
   		}
                else{
                    if(index == cant){
                        items[index] = item;
                        cant++;
                    }
                    else{
                        for(int i = cant; i > 0; i--){
                            items[i] = items[i - 1];
                        }
                    items[index] = item;
                    cant++;
                    }
                }
    }

    public void del(int index) throws IndiceFueraDeRango{
      if(index > cant || index < 0){
        throw new IndiceFueraDeRango();
      }
      else{
          for(int i = index; i < cant;i++){
            items[i] = items[i+1];
          }
          cant--;
      }
    }

    public Object obtener(int index) throws IndiceFueraDeRango{
        if(index > cant || index < 0){
            throw new IndiceFueraDeRango();
        }
        else{
            return items[index];
        }
    }

    public void show(){
        System.out.print("[");
        for(int i = 0 ; i < cant;i++){
            System.out.print(items[i] + " ");
        }
        System.out.println("]");
    }

    public Lista copy(Lista l) throws IndiceFueraDeRango{
      cant = 0;
      max = l.getMax();
      for(int i = 0 ; i < l.getCant() ; i++){
        items[i] = l.obtener(i);
        cant = cant + 1;
      }
      return this;
    }

    public boolean equals(Lista l) throws IndiceFueraDeRango{
      if(this.cant != l.getCant()) return false;
      if(this.max  != l.getMax()) return false;
      for(int i = 0; i < cant ; i++){
        if(items[i] != l.obtener(i)){
          return false;
        }
      }
      return true;
    }

    public Lista copyWhitElem(Lista l){
      cant = l.getCant();
      max = l.getMax();
      return this;
    }

    //Agrega al principio
    public Lista agregar(Lista l) throws IndiceFueraDeRango{
      int o = cant;
      for(int i = 0 ; i < l.getCant() ; i++){
        items[o] = l.obtener(i);
        o++;
        cant++;
      }
      return this;
    }
}
