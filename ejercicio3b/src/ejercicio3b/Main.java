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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro l1 = new Libro("The Lord of the Rings", "J. R. R. Tolkien", 1000);
        Libro l2 = new Libro("Harry Potter", "J. K. Rowling", 600);
        Libro l3 = new Libro("Harry Potter 2", "J. K. Rowling",600);
        Libro l4 = new Libro("Sinceramente","Cristina Kirchner",1000);
        Catalogo c1 = new Catalogo();
        c1.agregarLibro(l1);
        c1.agregarLibro(l2);
        c1.agregarLibro(l3);
        c1.agregarLibro(l4);
        System.out.println("Catalogo 1:");
        c1.mostrar();


    }
    
}
