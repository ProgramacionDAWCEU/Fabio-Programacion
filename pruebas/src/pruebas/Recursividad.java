package pruebas;

import java.util.ArrayList;
import java.util.List;

public class Recursividad {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Integer x = 0;
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		//imprimir(lista);
		//imprimir2(lista,x);
		System.out.println(sumar(lista,x));
		
	}
	
//	public static void imprimir(List<Integer> lista) {
//		if(lista.isEmpty()) {
//			return;
//		}
//		System.out.println(lista.get(0));
//		lista.remove(0);
//		imprimir(lista);
//	}
	
	public static void imprimir2(List<Integer> lista, Integer x) {
		if(lista.size()>=x+1) {
			System.out.println(lista.get(x));
			imprimir2(lista, x+1);
		}
		
	}
	
	public static Integer sumar(List<Integer> lista, Integer x) {
		if(lista.size() == x) {
			return 0;
		}
		return lista.get(x) + sumar(lista, x+1);
	}
}
