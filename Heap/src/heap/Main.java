/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author Luciano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Integer[] hola = new Integer[200];
        hola[0] = 1;
        if(hola[0] == null){
            System.out.print("hola");
        }
        */
        Integer[] array = new Integer[200];
        //array[0] = 5;
        //array[1] = 7;
        //array[2] = 8;
        //array[3] = 12;
        //array[4] = 9;
        MaxHeapConArreglos<Integer> heap = new MaxHeapConArreglos(array,0);
        int ins;
        for(int i = 0; i < 15;i++){
            ins = (int) Math.floor(Math.random()*25+0);
            heap.insertar(ins);
        }
        //System.out.println(heap.toString());
        heap.show();
        //heap.insertar(1);
        
    }
    
}
