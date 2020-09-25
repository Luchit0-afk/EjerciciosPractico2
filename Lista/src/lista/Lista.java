/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author Luciano
 */
public interface Lista<T> {

	/**
	* @return si la lista esta vacia o no
	**/
	public boolean esVacia();

	/**
	* Vacia la lista
	**/
	public void vaciar();

	/**
	* Insertar un elem en la lista en la posicion index
	* @throws IllegalStateException si index no es una posicion valida.
	**/
    public void ins(T elem, int index);


    /**
    * Elimina el elemento de la lista en la posicion index.
    * @throws IlegalStateException si index no es una posicion valida.
    **/
    public void del(int index);

    /**
    * @return la cantidad de elementos
    **/
    public int cant();

    /**
    * Muestra la lista.Preferentemente borrarlo ya que no es correcto hacerlo, hacer toString.
    **/
    public void show();

    @Override
    public String toString();

}
