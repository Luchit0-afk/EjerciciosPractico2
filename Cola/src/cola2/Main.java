/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola2;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cad = sc.nextLine();
        Cola<Character> cola = new ColaEncadenada<>();
        for(char c : cad.toCharArray()){
            cola.encolar(c);
        }
        cola.show();
        cola.desencolar();
        cola.show();
    }
    
}
