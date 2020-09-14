package pila;

/**
* Esta clase representa una pila de objetos <b>last in first out (LIFO)</b> donde el último elemento insertado es el primero que se accede.
* Las operaciones ofrecidas por cualquier implementación de esta clase son:
* <p>
* <ul>
*   <li> tope : accede al tope de una pila no vacía sin modificar a la misma</li>
*   <li> apilar : apila un nuevo elemento en la pila y retorna si la operación fue exitosa</li>
*   <li> desapilar : desapila y retona el elemento en el tope de una pila no vacía</li>
*   <li> vaciar : elimina todos los elementos de la pila dejándola vacía</li>
*   <li> elementos : retorna la cantidad de elementos presentes en la pila</li>
*   <li> vacia : permite consultar si la pila está vacía</li>
* </ul>
*/
public interface Pila<T> {

	/**
	* Retorna el tope de la pila, si ésta no es vacía.
	* @return tope de la pila
	* @throws IllegalStateException si la pila está vacía
	* @see #esVacia()
	*/
	public T tope();

	/**
	* Permite evaluar si la pila no tiene elementos.
	* @return {@code true} sii la pila no tiene elementos
	*/
	public boolean esVacia();

	/**
	* Apila un elemento en el tope de la pila.
	* @param elem el elemento a apilar
	* @return {@code true} sii el elemento pudo ser apilado
	*/
	public boolean apilar(T elem);

	/**
	* Desapila el tope de la pila, y retorna el elemento desapilado, si ésta no es vacía.
	* @return tope de la pila
	* @throws IllegalStateException si la pila está vacía
	* @see #esVacia()
	*/
	public T desapilar();
	
	/**
	* @return cantidad de elementos en la pila.
	*/
	public int elementos();

	/**
	* Remueve todos los elementos en la pila.
	*/
	public void vaciar();

	/**
	* Invariante de clase.
	* @return {@code true} sii la pila satisface su invariante de clase
	*/
	public boolean repOK();

	@Override
	public String toString();

	@Override
	public boolean equals(Object other);

}
