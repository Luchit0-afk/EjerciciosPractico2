/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abb;

import arbol.ArbolBinario;

/**
 *
 * @author Luciano
 * Interface 
 */

public interface ABB<T extends Comparable<? super T>> extends ArbolBinario<T>{
    
    /**
    * Buscar un elemento dentro de un arbol
    * @param <T> tipo de los nodos del arbol, debe ser comparable 
   	* @param elem elemento a buscar
   	* @return true si el elemento 
    */
    public ABB<T> buscar(T elem);

    /**
    * Insertar un elemento en un arbol
    * Si el elemento existe, el arbol queda queda como esta. 
    * @param elem elemento a insertar
    * @return el arbol con el elemento insertado
    */
    public ABB<T> insertar(T elem);

    /**
    * Elimina un elemento de un arbol
    * @param elem elemento a eliminar
    */
    public void eliminar(T elem);
}
