package ejercicio11;

import cola2.Cola;
import cola2.ColaEncadenada;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class LectorDeArchivos {

	/* Uso: LectorDeArchivos archivo.txt n, donde:
		- archivo.txt es el nombre de un archivo de texto valido
		- n es un entero
		*/
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la ruta del archivo: ");
		String ruta = null;
        ruta = sc.nextLine();
		System.out.print("Ingrese la cantidad de lineas que desea imprimir: ");
		int cant = 0;
        cant = sc.nextInt();
		if (ruta == null || cant <= 0) 
			System.out.println("Error en los argumentos. Invocar con LectorDeArchivos archivo.txt n");
	
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ruta));
			Cola<String> cola = new ColaEncadenada<>();
			String linea;
			while((linea = reader.readLine()) != null) {
				cola.encolar(linea);
			}
			reader.close();
			int n = (cola.elementos() - cant);
			for(int i = 0 ; i < n ; i++){
				cola.desencolar();
			}
			while(cola.esVacia() == false){
				System.out.println(cola.toString());
				cola.desencolar();
			}

		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + args[0]);
		}
	}

}
