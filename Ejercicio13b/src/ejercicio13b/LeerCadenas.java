package ejercicio13b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import lista.Lista;
import lista.ListaEncadenada;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class LeerCadenas {
	
	public static void main(String [] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            imprimirUso();
			Lista<Map<Integer, String>> lista = new ListaEncadenada<>();
            Map<Integer,String> res = new HashMap();
            boolean cond = true;
			while (cond) {
				System.out.println("Ingrese un producto: ");
				String input = reader.readLine();
				if (input.equals("exit")) {
					System.out.println("Finalizado!");
					cond = false;
				}
				else{
                    System.out.println("Ingrese la cantidad que desea comprar: ");
                    String input2 = reader.readLine();
                    res.put(Integer.parseInt(input2),input);
                    lista.ins(res,lista.cant());
				}
			}
			System.out.println("Lista de compras: ");
            for (Entry<Integer, String> resultado : res.entrySet()) {
				Integer c = resultado.getKey();
                String p = resultado.getValue();
				System.out.print("-" + c + " ");
                System.out.println(p);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public static void imprimirUso(){
		System.out.println("---Uso de lista de compras---");
		System.out.println("Ingrese los productos uno por uno");
		System.out.println("y luego la cantidad que desea comprar.");
		System.out.println("Para finalizar ingrese -exit- sin los guiones");
		System.out.println("Al finalizar, los productos seran impresos.");
	}
}
