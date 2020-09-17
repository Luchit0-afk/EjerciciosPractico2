/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;
import static palindromo.EsPalindromo.EsPalindromo;

/**
 *
 * @author Luciano
 */
public class Main {
    
    public static void main(String[] arg){
        System.out.println("Ingrese una cadena para verificar si es un palindromo.");
        Scanner sc = new Scanner(System.in);
        String palin = sc.nextLine();
        boolean palindromo = EsPalindromo(palin);
        if(palindromo == false){
            System.out.println("La cadena ingresada no es un palindromo");
        }
        else{
        	System.out.println("La cadena ingresada es un palindromo");
        }
    }
}
