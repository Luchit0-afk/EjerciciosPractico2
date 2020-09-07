/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3b;

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
    	if(nroLibros < DEFAULT_MAX){
            //System.out.println(DEFAULT_MAX - nroLibros);
            for(int i = DEFAULT_MAX - nroLibros; i < DEFAULT_MAX ; i++){
                libros[i - 1] = new Libro();
                libros[i - 1].asignarTitulo(libros[i].obtenerTitulo());
                libros[i - 1].asignarAutor(libros[i].obtenerAutor());
                libros[i - 1].asignarNroPag(libros[i].obtenerNroPag());
            }
            //System.out.println(DEFAULT_MAX - 1);
            libros[DEFAULT_MAX - 1] = new Libro();
            libros[DEFAULT_MAX - 1].asignarTitulo(l.obtenerTitulo());
            libros[DEFAULT_MAX - 1].asignarAutor(l.obtenerAutor());
            libros[DEFAULT_MAX - 1].asignarNroPag(l.obtenerNroPag());
            nroLibros++;
        }
        return false;
    }

    // Si hay un libro con titulo t en el catalogo lo retorna, sino devuelve null.
    public Libro buscarPorTitulo(String t) {
        for(int i = 0;i < nroLibros ; i++){
            if((libros[i].obtenerTitulo().equals(t))) {
                return libros[i];
            }
        }
        return null;
    }

    public void mostrar() {
        for (int i = DEFAULT_MAX; i > DEFAULT_MAX - nroLibros; i--) 
            System.out.println("Libro " + i + ": " + libros[i - 1].toString());
    }

}
