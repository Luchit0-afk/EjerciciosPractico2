/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaconlistaencadenada;

/**
 *
 * @author Luciano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaInterface<Integer> cola = new ColaImplementacion<>();
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        cola.encolar(4);
        cola.encolar(5);
        cola.encolar(6);
        cola.desencolar();
        cola.desencolar();
        cola.show();
    }
    
}
