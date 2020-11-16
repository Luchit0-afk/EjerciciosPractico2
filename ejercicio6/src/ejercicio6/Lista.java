/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Luciano
 */

import java.util.Scanner;

public class Lista {
    private char[] items;
    private int cant;
    private int max = 250;

    public Lista(){
    	items = new char[max];
    	cant = 0;
    }

    public Lista(int m) throws IndiceFueraDeRango{
    	if(m > max){
    		throw new IndiceFueraDeRango();
    	}
    	else{
    		items = new char[m];
    		cant = 0;
    	}
    }
   
        public void cadena(String cad, int c){
            items = cad.toCharArray();
            cant = c;
        }
    
   	public boolean is_empy(){
   		return (cant == 0);
   	}

   	public void vaciar(){
   		cant = 0;
   	}

   	public int length(){
   		return cant;
   	}
    
   	public void add(int index,char item) throws IndiceFueraDeRango{
   		if(index > cant || index < 0){
   			throw new IndiceFueraDeRango();
   		}
                else{
                    if(index == cant){
                      items[index] = item;
                    cant++;
                    }
                    else{
                        for(int i = cant; i > (cant - index); i--){
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

    public char obtener(int index) throws IndiceFueraDeRango{
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

/*    public boolean balanceada(int c){
        if(c < 0 || c >= cant){
            return true;
        }
        else{
            for(int i = c ; i < cant ; i++){
                if(items[i] == '['){
                    for(int o = i + 1  ; o < cant ; o++){
                         if(items[o] == ')'){
                            return false;
                        }
                        if(items[o] == ']'){
                            this.balanceada(o + 1);
                        }
                        if(items[o] == '('){
                            if(o + 1 == cant){
                                return false;
                            }
                            else{
                                for(int j = o + 1; j < cant ; j++){
                                    if(items[j] == ']'){
                                        return false;
                                    }
                                    if(items[j] == ')'){
                                        for(int k = j + 1 ; k < cant ; k++){
                                            if(items[k] == '('){
                                                this.balanceada(k + 1);
                                            }
                                            if(items[k] == ']'){
                                                this.balanceada(k + 1);
                                            }
                                            else{
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }

                        }
                    }
                    if(items[i] == '('){
                        for(int l = i + 1; l < cant ; i++){
                           if(items[l] == ']'){
                              return false;
                            }
                            if(items[l] == ')'){
                                this.balanceada(l + 1);
                            }
                            else{
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }                                
    }

*/

    //public boolean balanceada(){
    //    if(items[0] == ']' || items[0] == ')'){
    //        return false;
    //    }
    //    else{
    //        if(items[])
    //    }
    //}
}
