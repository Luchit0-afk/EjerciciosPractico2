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

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Pre-condition: The values they [], and (). No more
        //System.out.println("Ingrese corchetes y paretensis.");
        Lista frase = new Lista();
        System.out.println("Ingrese una frase: ");
        String cad = sc.nextLine();
        frase.cadena(cad,cad.length());
        //frase.show();
        boolean balan = frase.balanceada(0);
       System.out.println("La frase esta balanceada? " + balan);
       
    }
    
}


 //char gender = sc.next().charAt(0);
        //char k = sc.next().charAt(0);
        //boolean f = (gender == 'k');
        //System.out.println(f);