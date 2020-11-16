/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import static arbol.ArbolBinario.Orden.*;
import static arbol.ArbolBinarioEncadenado.*;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Luciano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario<Integer> arbolV = arbolVacio();
        //ArbolBinario<Integer> hojaE = hoja(3);
        //ArbolBinario<Integer> arbol = arbol(1, hoja, hoja);
        //System.out.println("Cantidad de elementos de Arbol vacio: " + arbolV.elementos());
        //System.out.println("Cantidad de elementos de Arbol : " + arbol.elementos());
        //System.out.println("Altura de arbol vacio: " + arbolV.altura());
        //System.out.println("Altura de Arbol : " + arbol.altura());
        
        //creamos el siguiente arbol
        //
        //
        //
        // 			          (1)
        //		          (2)	   (3)
        //	           (4)  (5) (6)   (7)	
        //
        //
        //	
        ArbolBinario<Integer> hoja6 = hoja(6);
        ArbolBinario<Integer> hoja7 = hoja(7);
        ArbolBinario<Integer> hoja5 = hoja(5);
        ArbolBinario<Integer> hoja4 = hoja(4);
        ArbolBinario<Integer> subArbolDe = arbol(3,hoja6,hoja7);
        ArbolBinario<Integer> subArbolIz = arbol(2,hoja4,hoja5);
        ArbolBinario<Integer> arbolD = arbol(1,subArbolIz,subArbolDe);
        ArbolBinario<Integer> arbolI = arbol(2,subArbolDe,subArbolIz);
        ArbolBinario<Integer> arbol = arbol(3,arbolI,arbolD);
        /*
        subArbolIz = arbol.subArbolIzquierdo();
        List<Integer> iz = new LinkedList<>();
        iz = subArbolIz.aLista();
        System.out.println("Parte izquierda: " + iz.toString());
        System.out.println("Cantidad de elementos del arbol: " + arbol.elementos());
        System.out.println("Altura de Arbol : " + arbol.altura());
        List<Integer> list = new LinkedList<>();
        list = arbol.aLista();
        List<Integer> show = new LinkedList<>();
        show = list;
        System.out.println(show.toString());
        */
    }
    
}
