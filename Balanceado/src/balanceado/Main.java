/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanceado;

/**
 *
 * @author Luciano
 */

import static balanceado.balanceado.balanceado;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una formula");
        String formula = sc.nextLine();
        boolean balan = balanceado(formula);
        if(balan){
            System.out.println("La formula esta balanceada.");
        }
        else{
            System.out.println("La formula no esta balanceada.");
        }
    }
    
}
