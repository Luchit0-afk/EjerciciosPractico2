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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IndiceFueraDeRango, VectDifTam {
        Vector vector = new Vector();
        for(int i = 0; i < 3 ; i++){
        	int index = (int) Math.floor(Math.random()*3+1);
        	vector.add(i,index);
        }
        vector.show();
        Vector vector2 = new Vector();
        for(int i = 0; i < 3 ; i++){
        	int index2 = (int) Math.floor(Math.random()*3+1);
        	vector2.add(i,index2);
        }
        vector2.show();
        //vector2.mult(2);
        //vector2.show();
        System.out.println("El producto punto es: " + vector2.multV(vector));
        //vector.resta(vector2);
        //vector.show();
        //vector2.suma(vector);
        //System.out.println("La suma es: ");
        //vector2.show();
        
    }
    
}
