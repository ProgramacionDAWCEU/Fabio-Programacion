package Ejercicio58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<>();
		Diccionario dc = new Diccionario();
		
		String palabra = "";

		do {
			System.out.println("Ingrese palabra");
			palabra = sc.nextLine();
			lista.add(palabra);
		} while (!palabra.equals("FIN"));
		
		//Pasamos la lista al diccionario
		
		
		dc.cargarDiccionario(lista);
		
		
		do {
			System.out.println("Ingrese una letra");
			palabra = sc.nextLine().toUpperCase();
			System.out.println("Palabras con la letra " + palabra);
			dc.imprimirPalabras(palabra);

		} while (!palabra.equals("FIN"));
		

	}

}
