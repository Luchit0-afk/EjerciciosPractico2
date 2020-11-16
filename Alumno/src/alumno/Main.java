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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno Luciano = new AlumnoDeSecundario("Luciano", "Palacio");
        Alumno Luciano2 = new AlumnoDeSecundario("Luciano", "Palacio");
        Alumno Sofia = new AlumnoDeSecundario("Sofia", "Urquiza",8);
        float[] notasDeSanchez = new float[20];
        for(int i = 0 ; i < 10;i++){
            notasDeSanchez[i] = (float) (Math.random()*10+0);
        }  
        AlumnoDeSecundarioDesaprobado Sanchez = new AlumnoDeSecundarioDesaprobado("Thomas", "Sanchez",notasDeSanchez,5);
        //System.out.println(Luciano.equals(Luciano2));
        //System.out.println(Luciano.equals(Sofia));
        //System.out.println(Luciano.nombre());
        float[] notasDeLuciano = new float[20];
        for(int i = 0 ; i < 10;i++){
            notasDeLuciano[i] = (float) (Math.random()*10+0);
        }
        float[] notasDeSofia = new float[20];
        for(int i = 0 ; i < 10;i++){
            notasDeSofia[i] = (float) (Math.random()*10+0);
        }
        //Luciano.cargarNota(4);
        //Luciano.cargarNota(5);
        Luciano.cargarNotas(notasDeLuciano, 10);
        System.out.println(Luciano.toString());
        Sofia.cargarNotas(notasDeSofia, 10);
        System.out.println(Sofia.toString());
        System.out.println("Sofia: ");
        System.out.println("Menor Nota: " + Sofia.menorNota());
        System.out.println("Mejor nota: " + Sofia.mejorNota());
        System.out.println("Promedio: " + Sofia.promedio());
        System.out.println("Luciano: ");
        System.out.println("Menor Nota: " + Luciano.menorNota());
        System.out.println("Mejor Nota: " + Luciano.mejorNota());
        System.out.println("Promedio: " + Luciano.promedio());
        System.out.println("Luciano: ");
        System.out.println("Menor Nota: " + Sanchez.menorNota());
        System.out.println("Mejor Nota: " + Sanchez.mejorNota());
        System.out.println("Promedio: " + Sanchez.promedio());
        System.out.println("Cantidad de materias desaprobadas: " + Sanchez.cantMateriasDesaprobadas());
        System.out.println("Repite? ");
        if(Sanchez.repitente()){
            System.out.println("Repite ");
        }
        else{
            System.out.println("No repite ");
        }
    }
    
}
