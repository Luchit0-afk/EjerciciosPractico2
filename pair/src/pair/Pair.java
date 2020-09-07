/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pair;

/**
 *
 * @author Luciano
 */
public class Pair {
    int x;
    int y;

    //Constructor
    public Pair(){
    	x = 0;
    	y = 0;
    }

    //Contructor
    public Pair(int x, int y){
    	this.x = x;
    	this.y = y;
    }

    //Observador
    public int obtenerX(){
    	return x;
    }

    //Observador 
    public int obtenerY(){
    	return y;
    }

    //Cambiador
    public void cambiarX(int x){
    	this.x = x;
    }

    //Cambiador
    public void cambiarY(int y){
    	this.y = y;
    }

    //Cambiador
    public void cambiarXY(int x, int y){
    	this.x = x;
    	this.y = y;
    }

}
