/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

/**
 *
 * @author Luciano
 */
public class Calculos {
    private int n = 0;
    
    public Calculos(){}
    
    public Calculos(int n){
        this.n = n;
    }
    
    public int factorial(int n)throws NumberNegative{
        
        
        try{
            if(n == 0 || n == 1){
                return 1; 
            }
            else{
                return n*factorial(n-1);
            } 
        }
        catch(Exception NumberNegative){
            System.out.println(NumberNegative);
        }
        return 0;
    }
}


public static void main(String[] args)  {
    try{
           FileInputStream archivo = new FileInputStream("MiArchivo.dat");
    } 
    catch (FileNotFoundException ex) {
            System.out.println("Error al abrir el archivo: " + ex.getMessage());
    }
}
