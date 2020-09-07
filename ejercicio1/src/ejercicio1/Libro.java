/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Luciano
 */
public class Libro {
        
    private String titulo;
    private String autor;
    private int nroPag;

    public Libro() {
        titulo = null;
        autor = null;
        nroPag = 0;
    }

    public Libro(String t, String a, int p) {
        titulo = t;
        autor = a;
        nroPag = p;
    }

    public String obtenerTitulo() {
        return titulo;
    }

    public void asignarTitulo(String t) {
        titulo = t;
    }

    public String obtenerAutor() {
        return autor;
    }

    public void asignarAutor(String a) {
        autor = a;
    }

    public int obtenerNroPag() {
        return nroPag;
    }

    public void asignarNroPag(int n) {
        nroPag = n;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + nroPag;
    }

}
