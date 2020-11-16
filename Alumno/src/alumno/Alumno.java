/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

/**
 *
 * @author Luciano
 */
public interface Alumno {
    
    /**
     * Devuelve el nombre y apellido del alumno
     * @return el nombre y apellido del alumno
     */
    public String nombre();
    
    /**
     * Dada una nota, la carga al registro del estudiante
     * @param nota a cargar 
     */
    public void cargarNota(float nota);
    
    /**
     * Dada unas notas en forma de arreglo, las cargas al registro del estudiante
     * @param notas arreglo de notas a cargar en el registro
     * @param cant cantidad de notas a cargar
     */
    public void cargarNotas(float[] notas,int cant);
    
    /**
     * 
     * @return la mejor nota del alumno 
     */
    public float mejorNota();
    
    /**
     * 
     * @return la menor nota del alumno 
     */
    public float menorNota();
    
    /**
     * 
     * @return el promedio del alumno 
     */
    public float promedio();
    
    
}
