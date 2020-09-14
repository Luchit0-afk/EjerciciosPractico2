/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author Luciano
 */
public class Vector {
    private int vector[];
    private int cant;
    private final int max = 250;
   
    public Vector(){
        vector = new int[max];
        cant = 0;
    }     
                
    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
         this.cant = cant;
    }
        
    public boolean is_empy(){
        return (cant == 0);
    }

    public void vaciar(){
        cant = 0;
    }

    public void add(int index,int item) throws IndiceFueraDeRango{
        if(index > cant || index < 0){
            throw new IndiceFueraDeRango();
        }
                else{
                    if(index == cant){
                        vector[index] = item;
                        cant++;
                    }
                    else{
                        for(int i = cant; i > 0; i--){
                            vector[i] = vector[i - 1];
                        }
                    vector[index] = item;
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
            vector[i] = vector[i+1];
          }
          cant--;
      }
    }

    public int obtener(int index) throws IndiceFueraDeRango{
        if(index > cant || index < 0){
            throw new IndiceFueraDeRango();
        }
        else{
            return vector[index];
        }
    }

    public void show(){
        System.out.print("[");
        for(int i = 0 ; i < cant;i++){
            System.out.print(vector[i] + "| ");
        }
        System.out.println("]");
    }

    public Vector suma(Vector v)throws VectDifTam, IndiceFueraDeRango{
        if(this.cant != v.getCant()) throw new VectDifTam();
        else{
            for(int i = 0 ; i < this.cant ; i++){
                vector[i] = (vector[i] + v.obtener(i));
            }
            return this;
        }
    }

    public Vector resta(Vector v)throws VectDifTam, IndiceFueraDeRango{
        if(this.cant != v.getCant()) throw new VectDifTam();
        else{
            for(int i = 0 ; i < this.cant ; i++){
                vector[i] = (vector[i] - v.obtener(i));
            }
            return this;
        }
    }

    public Vector mult(int n)throws IndiceFueraDeRango{
            for(int i = 0; i < this.cant ; i++){
                vector[i] = (vector[i] * n);
            }
            return this;
    }       
    
    public int multV(Vector v)throws VectDifTam, IndiceFueraDeRango{
        if(this.cant != v.getCant()) throw new VectDifTam();
        else{
            int res = 0;
            for(int i = 0; i < this.cant ; i++){
                res = res + (vector[i] * v.obtener(i));
            }
            return res;
        }
    } 
}
