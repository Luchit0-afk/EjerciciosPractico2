/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadlistaconarreglos;

/**
 *
 * @author Luciano
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws tadlistaconarreglos.IndiceFueraDeRango
     */
    public static void main(String[] args) throws IndiceFueraDeRango {
        Lista l = new Lista();
        for(int i = 0;i < 20 ; i++){
            l.add(i,i);
        }
        Lista l2 = new Lista();
        l2.add(0,1);
        l2.add(1,5);
        l2.add(2,8);
        l2.add(3,9);
        l2.agregar(l);
        l2.show();
    }
    
}
