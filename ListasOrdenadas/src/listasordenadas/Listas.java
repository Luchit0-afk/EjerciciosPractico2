/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasordenadas;


import lista.Lista;
import lista.ListaEncadenada;

/**
 *
 * @author Luciano
 */


public interface Listas<T> {
    
    /**
    * Dado un elemento y una lista, ingreso el elemento a la lista
    * @return lista ordenada con el nuevo elemento
    **/
    public Lista ins(T elem, Lista l);

    /**
    * Dadas dos listas, retorna la union de ellas de forma ordenada
	* @return lista ordenada con la union de l1 y l2
    **/
    public Lista union(Lista l1 , Lista l2);

    /**
    * Dado un elemento y una lista, retorna si el elemento pertenece a la lista
    * @return si el elemento pertence a la lista
    **/
    public Boolean per(T elem , Lista l);

    /**
    * Dadas dos listas, retorna la intercion de ellas
    * @return lista ordenada con la interseccion de l1 y l2
    **/
    public Lista inter(Lista l1, Lista l2);

}
