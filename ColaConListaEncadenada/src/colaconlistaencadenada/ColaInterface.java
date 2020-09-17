/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaconlistaencadenada;

/**
 *
 * @author Luciano
 */
public interface ColaInterface<T> {
    
    /**
    * Permite evaluar si la cola no tiene elementos.
    * @return true ssi la cola no contiene elementos
    **/
    public boolean is_empty();

    /**
    * Elimina todos los elementos de la cola
    **/
  	public void empty();

  	/**
  	* Encola un elemento al final de la cola
  	**/
  	public void encolar(T elem);

  	/**
  	* Elimina el primer elemento de la cola
  	* @throws IllegalStateException si la cola esta vacia
  	**/
  	public void desencolar();

  	/**
	* Obtiene el primer elemento de la cola
	* @return el primer elemento de la cola
	* @throws IllegalStateException si la cola esta vacia
	**/
	public T obtener();

	/**
	* Obtiene la cantidad de elementos de la cola
	* @return la cantidad de elementos de la cola
	**/
	public int length();

  /**
  * Muestra los elementos de la lista
  **/
  public void show();

}
