/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author Luciano
 */
public class Racional {
    
    private long nume;
    private long deno;

    //Constructor
    public Racional(){
        nume = 0;
        deno = 1;
    }

    //Constructor
    public Racional(long n, long d){
        if(d <= 0){
            System.out.println("Denominador invalido, ingrese un numero positivo.");
            throw new IllegalArgumentException("Illegal argument");
        }
        else{
            nume = n;
            deno = d;
        }
    }

    //Observador 
    public long getNume(){
        return nume;
    }

    //Observador
    public long getDeno(){
        return deno;
    }

    //Cambiador
    public void setNume(long n){
        nume = n;
    }

    //Cambiador
    public void setDeno(long d){
        if(d <= 0){
            System.out.println("El denominador ingresado es invalido.");
            throw new IllegalArgumentException("Illegal argument");
        }
        else{
            deno = d;
        }
    }

    //Cambiador
    public void setNumeyDeno(long n, long d){
        if(d <= 0){
            System.out.println("Denominador invalido, ingrese un denominador positivo.");
            throw new IllegalArgumentException("Illegal argument");
        }
        else{
            nume = n;
            deno = d;
        }
    }

    //Metodo auxiliar(maximo comun divisor)
    public long mcd(long n1, long n2){
        long mcd = 0;
        long a = Math.max(n1,n2);
        long b = Math.min(n1,n2);
        do{
            mcd = b;
            b = a%b;
            a = mcd;
        }while (b!=0);
        return mcd;
    }

    //Metodo auxiliar(Minimo comun divisor)
    public long mcm(long n1,long n2){
        long mcm = 0;
        long a = Math.max(n1,n2);
        long b = Math.min(n1,n2);
        mcm = (a/mcd(a,b))*b;
        return mcm;
    }

    //Suma de racionales
    public Racional sumar(Racional n){
        long denoAux;
        denoAux = deno;
        deno = mcm(deno,n.getDeno());
        nume = (deno / denoAux)*nume + (deno / (n.getDeno()))*(n.getNume());
        return this;
    }

    //Resta de racionales
    public Racional restar(Racional n){
        long denoAux = deno;
        deno = mcm(deno,n.getDeno());
        nume = (deno / denoAux)*nume - (deno / (n.getDeno()))*(n.getNume());
        return this;
    }

    //toString
    @Override
    public String toString(){
        return this.nume + "/" + this.deno;
    }

    //equals
    @Override
    public boolean equals(Object other){
        if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        return (this.getNume() == ((Racional)other).getNume() &&
               this.getDeno() == ((Racional)other).getDeno());

    }

}

