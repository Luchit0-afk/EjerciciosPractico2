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
        l.add(0,1);
        l.add(1,2);
        l.add(2,3);
        l.add(3,4);
        l.del(2);
        System.out.println("El primer elemento es: " +  l.obtener(0));
        //boolean bool = l.is_empy();
        //System.out.println(bool);
        l.show();
        System.out.println("La longitud es: " + l.length());
        //Lista l3 = new Lista(251);
    }
    
}
