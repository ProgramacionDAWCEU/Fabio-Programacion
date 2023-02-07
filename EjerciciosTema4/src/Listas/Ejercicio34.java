package Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> lista = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Cadena");
			lista.add(sc.nextLine());
		}
		
		System.out.println(lista);
		
		for ( int i = 0; i < lista.size(); i++) {
			lista.set(i, lista.get(i).toUpperCase());
		}
		
		System.out.println(lista);
		
		if(lista.contains("")) {
			System.out.println("Hay alguna cadna vacia");
		}else {
			System.out.println("No hay ninguna cadena vacia");
		}
		
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			String s = it.next();
			if ( s.length() < 6) {
				it.remove();
			}
			
		}

		System.out.println(lista);
	}

}
