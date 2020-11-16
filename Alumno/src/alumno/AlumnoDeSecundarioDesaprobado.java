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
public class AlumnoDeSecundarioDesaprobado extends AlumnoDeSecundario implements Alumno{
    
    public AlumnoDeSecundarioDesaprobado(String nombre, String apellido, float nota) {
        super(nombre, apellido, nota);
    }
    
    public AlumnoDeSecundarioDesaprobado(String nombre, String apellido, float[] notas,int cant) {
        super(nombre, apellido, notas,cant);
    }
    
    public boolean repitente(){
        return (this.promedio() < 6);
    }
    
    public int cantMateriasDesaprobadas(){
        int des = 0;
        for(int i = 0; i < cant;i++){
            if(this.notas[i] < 6){
                des++;
            }
        }
        return des;
    }
}
