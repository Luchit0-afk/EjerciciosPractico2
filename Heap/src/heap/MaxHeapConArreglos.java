/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Luciano
 * @param <P>
 * @param <T>
 */
public class MaxHeapConArreglos<T extends Comparable<? super T>> implements Heap<T> {
    
    private static final int MAX_VALOR = 400;
    
    private T[] heap;
    private int cant;
    
    //Funciona mal, no se puede castear asi
    public MaxHeapConArreglos(){
        heap = (T[]) new Object[MAX_VALOR];
        cant = 0;
    }
    
    //Funciona bien
    public MaxHeapConArreglos(T[] array, int cant){
        cant = 0;
        for(int i = 0 ; i < cant ; i++){
            this.insertar(array[i]);
        }
        this.cant = cant;
        //heap = array.clone();
        //this.cant = cant;
    }
    
    public boolean esVacio(){
        return cant == 0;
    }
    
    @Override
    public boolean buscar(T[] heap, T elem) {
        /*
        if(esVacio()) throw new IllegalStateException("No se pueda buscar en heap nulo");
        else{
            if(heap[0] == elem){//si el elemento es la raiz
                return true;
            }
            else{//si no esta en la raiz
                if(cant >=1){//si tiene hijos
                    if(cant >=2){//si tiene hijo izquierdo
                        return this.buscar(elem) 
                    }
                }
                else{
                    return false;
                }
            }
        }
        */
        return true;
    }

    @Override
    public T[] insertar(T elem) {
        if(esVacio()){
            heap[0] = elem;
            cant++;
        }
        else{
            heap[cant] = elem;
            int pos = cant;
            while(!this.estaBalanceado(0)){
                heap = intercambiarPadreConHijo(heap,pos);
                pos = posDePosibleDesbalanceo(pos);
            }
            cant++;
        }
        return heap;
    }
    
    private boolean estaBalanceado(int cant){
        if(heap[2*cant + 1] == null && heap[2*cant + 2] == null){
            return true;
        }
        if(heap[2*cant + 1] != null && heap[2*cant + 2] == null){
            if(heap[cant].compareTo(heap[2*cant + 1]) > 0 || heap[cant].compareTo(heap[2*cant + 1]) == 0){
                return  estaBalanceado(2*cant+1);
            }
            else{
                return false;
            }
        }
        if(heap[2*cant + 1] == null && heap[2*cant + 2] != null){
            if((heap[cant].compareTo(heap[2*cant + 2]) > 0 || heap[cant].compareTo(heap[2*cant + 2]) == 0)){
                return  estaBalanceado(2*cant+2);
            }
            else{
                return false;
            }
        }
        if(heap[2*cant + 1] != null && heap[2*cant + 2] != null){
            if((heap[cant].compareTo(heap[2*cant + 1]) > 0 || heap[cant].compareTo(heap[2*cant + 1]) == 0) && (heap[cant].compareTo(heap[2*cant + 2]) > 0 || heap[cant].compareTo(heap[2*cant + 2]) == 0)){
                return estaBalanceado(2*cant+1) && estaBalanceado(2*cant+2);
            }
            else{
                return false;
            }
        }
        return false;
    }
    
    private T[] intercambiarPadreConHijo(T[] heap,int cant){
        //es hijo derecho
        int posPadre;
        if(cant % 2 == 0){    
            posPadre = (cant - 2) / 2;
        }
        //es hijo izquierdo
        else{                   
            posPadre = (cant - 1) / 2;
        }
            T valorPadre = heap[posPadre];
            heap[posPadre] = heap[cant]; 
            heap[cant] = valorPadre;
            return heap;
    }
    
    private int posDePosibleDesbalanceo(int cant){
        int posPadre;
        if(cant % 2 == 0){    
            posPadre = (cant - 2) / 2;
        }
        else{                   
            posPadre = (cant - 1) / 2;
        }
        return posPadre;
    }

    @Override
    public void eliminar() {
         if(esVacio()){
             throw new IllegalArgumentException("el árbol está vacío");
         }
         if(heap[1] == null){
             heap[0] = null;
         }
         if(heap[2] == null){
             heap[0] = heap[1];
         }
         else{
             if(heap[1].compareTo(heap[2]) > 0){ // heap[1] > heap[2]
                 heap[0] = heap[1];
                 
             }
             else{ // heap[1] >= heap[2]
                 
             }
         }
    }
    
    //Corregir y poner un recorrido preOrder
    
    /*@Override
    public String toString(){
        List<T> lista = new LinkedList<>();
        int pos = cant;
        for(int i = 0 ; i < cant ; i++){
            lista.add(heap[i]);
        }
        return lista.toString();
    }
    */
    
    public void show(){
       for(int i = 0 ; i < cant/2 ; i++){
           System.out.print(" Padre : " + heap[i] + " Hijo izquierdo : " + heap[2*i + 1] + " Hijo derecho:" + heap[2*i + 2]); 
            System.out.println(); 
       }
    }
    
    
    //private String[] listaInOrder(String[] array, int cant){//cant = 0
    //    array[cant] = listaInOrder(array,2*cant+1);
    //   
    //}

    @Override
    public T[] heapSort(T[] array, int cant) {
        //Heap<T> ord = new MaxHeapConArreglos<>(array,cant);
        //for(int i = 0 ; i < cant ;i++){
        //    array[0] = 
        return array;
        }
    //return array;
}
