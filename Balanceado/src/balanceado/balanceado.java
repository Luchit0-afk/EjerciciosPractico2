/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanceado;

import Pila.Pila;
import Pila.PilaEncadenada;

/**
 *
 * @author Luciano
 */
public class balanceado {
    
    //private final Character Paren = ')';
    //private final char Corche = ']';
    
    public static boolean balanceado(String formula){
        Pila<Character> pila = new PilaEncadenada();
        for(char c : formula.toCharArray()){
            if(c == '('){
                pila.apilar(')');
            }
            if(c == '['){
                pila.apilar(']');
            }
            if(c == '{'){
                pila.apilar('}');
            }
            
        }
        for(int i = 0 ; i < formula.length() ; i ++){
            if(formula.charAt(i) == ')' || formula.charAt(i) == ']' || formula.charAt(i) == '}'){
                if(pila.esVacia()){
                    return false;
                }
                else{
                    if(formula.charAt(i) == pila.tope()){
                        pila.desapilar();
                    }
                    else{
                        return false;
                    } 
                }    
            }
        }
        return pila.esVacia();
        
    }
}

















