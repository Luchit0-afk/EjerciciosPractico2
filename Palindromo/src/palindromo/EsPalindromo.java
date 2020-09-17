/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;


import Pila.Pila;
import Pila.PilaEncadenada;
import cola2.Cola;
import cola2.ColaEncadenada;
import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class EsPalindromo {
    
    /**
     * @param args the command line arguments
     */
    public static boolean EsPalindromo(String palin) {
        if(palin == null) throw new IllegalArgumentException ("null input");
        if(palin.length() < 2) return true;
        Cola<Character> cola = new ColaEncadenada<>();
        Pila<Character> pila = new PilaEncadenada<>();
        String parteIzq = palin.substring(0, (int) (palin.length() / 2));
        String parteDer = palin.substring((int) Math.ceil((float) palin.length() / (float) 2), palin.length());
        for(char c : parteIzq.toCharArray()){
            cola.encolar(c);
        }
        for(char c : parteDer.toCharArray()){
            pila.apilar(c);
        }
        for(int i = 0 ; i < pila.elementos() ; i++){
            if(pila.tope() != cola.primero()){
                return false;
            }
            else{
                pila.desapilar();
                cola.desencolar();
            }
        }
        return (pila.esVacia() && cola.esVacia());
    }
    
}
