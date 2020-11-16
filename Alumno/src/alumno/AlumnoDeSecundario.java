/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import java.util.Arrays;

/**
 *
 * @author Luciano
 */
public class AlumnoDeSecundario implements Alumno{
    
    private String nombre;
    private String apellido;
    protected float[] notas;
    protected int cant = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    //Anda bien
    /**
     * Crea un nuevo alumno sin notas
     * @param nombre nombre del alumno 
     * @param apellido apellido del alumno
     */
    public AlumnoDeSecundario(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        notas = new float[200];
    }
    
    //Anda bien
    /**
     * Crea un nuevo alumno con una sola nota
     * @param nombre nombre del alumno 
     * @param apellido apellido del alumno
     * @param nota nota a cargar
     */
    public AlumnoDeSecundario(String nombre, String apellido,float nota){
        this.nombre = nombre;
        this.apellido = apellido;
        notas = new float[200];
        notas[0] = nota;
        cant++;
    }
    
    //Anda bien
    /**
     * Crea un nuevo alumno con notas cargadas
     * @param nombre nombre del alumno
     * @param apellido apellido del alumno
     * @param notas notas a cargar
     * @param cant cantidad de notas a cargar
     */
    public AlumnoDeSecundario(String nombre, String apellido,float[] notas,int cant){
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = new float[200];
        System.arraycopy(notas, 0, this.notas, 0, cant);
        this.cant = cant;
    }
    
    //Anda bien
    @Override
    public String nombre() {
        return (nombre + " " + apellido);
    }
    
    
    @Override
    public float mejorNota() {
        float mejorNota = notas[0];
        for(int i = 1;i < cant;i++){
            if(mejorNota < notas[i]){
                mejorNota = notas[i];
            }
        }
        return mejorNota;
    }

    @Override
    public float menorNota() {
        float menorNota = notas[0];
        for(int i = 1;i < cant;i++){
            if(menorNota > notas[i]){
                menorNota = notas[i];
            }
        }
        return menorNota;
    }

    @Override
    public float promedio() {
        float prom = 0;
        for(int i = 0;i < cant;i++){
            prom = prom + notas[i];
        }
        return (prom/cant);
    }
    
    //Cheto
    @Override
    public void cargarNota(float nota) {
        this.notas[cant] = nota;
        cant++;
    }
    
    //Anda piola
    @Override
    public void cargarNotas(float[] notas,int cant) {
        int cantAux = this.cant;
        for(int i = 0;i < cant;i++){
            this.notas[cantAux] = notas[i];
            cantAux++;
        }
        this.cant = this.cant + cant;
    }
    
    //Chetarda
    @Override
    public String toString(){
        return "Nombre y apellido: " + nombre + " " + apellido + " Notas: " + this.notas();
    }
    
    //Cheto
    private String notas(){
        String res = "[";
        res = res + String.valueOf(notas[0]);
        float nota;
        for(int i = 1 ; i < cant;i++){
            nota = notas[i];
            res = res + " , " + String.valueOf(nota);
        }
        res = res + "]";
        return res;
    }
    
    //Anda bien
    @Override
    public boolean equals(Object other){
        if(other == this) return true;
        if(other == null) return false;
        if(other.getClass() != this.getClass()) return false;
        return (this.getNombre().equals(((AlumnoDeSecundario)other).getNombre())) && 
                (this.getApellido().equals(((AlumnoDeSecundario)other).getApellido())) &&
                (Arrays.equals(this.getNotas(), ((AlumnoDeSecundario)other).getNotas()));
    }
}
