/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author Luciano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Racional r1 = new Racional();
        r1.setNume(1);
        r1.setDeno(2);
        Racional r2 = new Racional(2,3);
        System.out.println("El primer racional es: " + r1.toString());
        System.out.println("El segundo racional es: " + r2.toString());
        r1.sumar(r2);
        System.out.println("La suma es: " + r1.toString());
        r1.restar(r2);
        System.out.println("La resta es: " + r1.toString());
        Racional r3 = new Racional(3,4);
        Racional r4 = new Racional(3,4);
        System.out.println("R3 es igual a R4?" + r3.equals(r4));
        System.out.println("R3 es igual a R1?" + r3.equals(r1));
    }
    
}
