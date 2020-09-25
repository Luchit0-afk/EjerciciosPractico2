package ejercicio13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import lista.Lista;
import lista.ListaEncadenada;

public class LeerCadenas {
	
	public static void main(String [] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            imprimirUso();
			ListaEncadenada<String> lista = new ListaEncadenada<>();
            boolean cond = true;
			while (cond) {
				System.out.println("Ingrese un producto: ");
				String input = reader.readLine();
				if (input.equals("exit")) {
					System.out.println("Finalizado!");
					cond = false;
				}
				else{
					lista.ins(input,lista.getCant());
				}
			}
			System.out.println("Lista de compras: ");
			while(lista.esVacia() == false){
				System.out.println(lista.toString());
				lista.del(0);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public static void imprimirUso(){
		System.out.println("---Uso de lista de compras---");
		System.out.println("Ingrese los productos uno por uno.");
		System.out.println("Para finalizar ingrese -exit- sin los guiones");
		System.out.println("Al finalizar, los productos seran impresos.");
	}
}
