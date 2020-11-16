/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

/**
 *
 * @author Luciano
 */
public class emptyArray extends Exception{
    
    public emptyArray() {
    	System.out.println("Arreglo vacio");
    }

    public emptyArray(String message) {
        super(message);
    }
    
}
