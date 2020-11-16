/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abb;

import arbol.ArbolBinario;
import static arbol.ArbolBinarioEncadenado.arbol;
import static arbol.ArbolBinarioEncadenado.hoja;
import arbol.NodoBinario;
import static arbol.NodoBinario.nuevaHoja;

/**
 *
 * @author Luciano
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ABBencadenado<Integer> arbolVacio = new ABBencadenado();
        /*
        arbolVacio.insertar(20);
        arbolVacio.insertar(10);
        arbolVacio.insertar(30);
        arbolVacio.insertar(5);
        arbolVacio.insertar(1);
        arbolVacio.insertar(7);
        arbolVacio.insertar(15);
        arbolVacio.insertar(17);
        arbolVacio.insertar(12);
        arbolVacio.insertar(25);
        arbolVacio.insertar(35);
        arbolVacio.insertar(21);
        arbolVacio.insertar(27);
        arbolVacio.insertar(31);
        arbolVacio.insertar(37);
        arbolVacio.insertar(37);
        */
        arbolVacio.insertar(2);
        arbolVacio.insertar(3);
        arbolVacio.insertar(1);
        arbolVacio.insertar(0);
        arbolVacio.insertar(4);
        System.out.println(arbolVacio.toString());
        System.out.println(arbolVacio.repOK());
        boolean repOK = arbolVacio.repOK();
        Integer[] array = new Integer[200];
        array[0] = 1;
        array[1] = 6;
        array[2] = 9;
        array[3] = 2;
        array = arbolVacio.treeSort(array,4);
        //arbolVacio.eliminar(2);
        for(int i = 0 ; i < 4 ; i++){
            System.out.print(array[i] + " ");
        }
        //System.out.println(arbolVacio.repOK());
    }
    
}
