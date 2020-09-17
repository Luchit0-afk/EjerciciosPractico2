/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

/**
 *
 * @author Luciano
 * Testear toString y hacer las funciones que faltan
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cad = sc.nextLine();
        Pila<Character> pila = new PilaEncadenada<>();
        for(char c : cad.toCharArray()){
        	pila.apilar(c);
        }
        pila.show();
        pila.desapilar();
        pila.show();
        pila.vaciar();
        pila.show();

    }
    
}
