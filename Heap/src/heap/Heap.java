/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author Luciano
 * @param <P>
 * @param <T>
 */
public interface Heap<T extends Comparable<? super T>> {
    
    /**
     * Busca un elemento dentro del heap
     * @param elem elemento a buscar
     * @return true sii el elemento esta dentro
     * T(n) pertenece a O(log n)
     */
    public boolean buscar(T[] heap, T elem);
    
    /**
     * Insertar un elemento dentro del heap
     * @param elem elemento a insertar
     * T(n) pertenece a O(log n)
     */
    public T[] insertar(T elem);
    
    /**
     * Elimina el elemento mas grande
     */
    public void eliminar();
    
    /**
     * Algoritmo de heapSort que dado un arreglo devuelve el mismo arreglo pero ordenado.
     * @param array arreglo a ordenar
     * @param cant cantidad de elementos del arreglo array
     * @return el arreglo ordenado
     */
    public T[] heapSort(T[] array,int cant);
}
