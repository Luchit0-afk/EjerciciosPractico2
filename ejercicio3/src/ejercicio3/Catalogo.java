/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Luciano
 */
public class Catalogo {     
    private Libro[] libros;
    private int nroLibros;
    private final int DEFAULT_MAX = 50;

    //Constructor
    public Catalogo() {
        libros = new Libro[DEFAULT_MAX];
        nroLibros = 0;
    }
    //Constructor
    public Catalogo(int max) {
        libros = new Libro[max];
        nroLibros = 0;
    }

    // Si el catalogo no esta lleno inserta el libro al final del arreglo 
    public boolean agregarLibro(Libro l) {
    	if(this.nroLibros < DEFAULT_MAX){
            for(int i = DEFAULT_MAX - this.nroLibros; i < DEFAULT_MAX ; i++){
                libro[i-1].asignarTitulo(libro[i].obtenerTitulo);
                libro[i-1].asignarAutor(libro[i].obtenerAutor);
                libro[i-1].asignarNroPag(libro[i].obtenerNroPag);
            }
            libros[DEFAULT_MAX-1].asignarTitulo(l.obtenerTitulo());
            libros[DEFAULT_MAX-1].asignarAutor(l.obtenerAutor());
            libros[DEFAULT_MAX-1].asignarNroPag(l.obtenerNroPag()); 
        }
        return false;
    }

    // Si hay un libro con titulo t en el catalogo lo retorna, sino devuelve null.
    public Libro buscarPorTitulo(String t) {
        for(int i = 0;i < nroLibros ; i++){
            if(libro.[i].obtenerTitulo() == t.obtenerTitulo()){
                return libro.[i];
            }
        }
        return null;
    }

    public void mostrar() {
        for (int i = 0; i<nroLibros; i++) 
            System.out.println("Libro " + i + ": " + libros[i].toString());
    }


}
