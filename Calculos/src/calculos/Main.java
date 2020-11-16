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

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumberNegative {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Calculos cal = new Calculos();
        System.out.println(cal.factorial(num));
    }
    
}
