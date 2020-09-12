
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
public class IndiceFueraDeRango extends Exception{

    public IndiceFueraDeRango() {
    	System.out.println("Indice fuera de rango");
    }

    public IndiceFueraDeRango(String message) {
        super(message);
    }
    
}