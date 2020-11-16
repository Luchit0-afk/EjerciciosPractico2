/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

/**
 *
 * @author Luciano
 */
public class NumberNegative extends Exception{
    
    public NumberNegative() {
    	System.out.println("Indice fuera de rango");
    }

    public NumberNegative(String message) {
        super(message);
    }
}
