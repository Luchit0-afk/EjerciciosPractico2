/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacircular;

/**
 *
 * @author Luciano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista<Integer> lista = new ListaCircularEncadenada<>();
        for(int i = 0 ; i < 10 ; i++){
            lista.ins(i, i);
        }
        lista.show();


        //Lista<Integer> lista = new ListaEncadenada<>();
        //for(int i = 0 ; i < 10 ; i++){
        //    lista.ins(i, i);                
        //}
        //lista.show();
        //lista.del(9);
        //lista.show();
    }
    
}
