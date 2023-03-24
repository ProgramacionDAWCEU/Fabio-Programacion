package Ejercicio57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, List<String>> letras = new HashMap<>();

		String palabra = "";

		do {
			System.out.println("Ingrese palabra");
			palabra = sc.nextLine();
			if (letras.containsKey(palabra.substring(0, 1))) {
				letras.get(palabra.substring(0, 1)).add(palabra);
			} else {
				List<String> x = new ArrayList<>();
				x.add(palabra);
				letras.put(palabra.substring(0, 1), x);
			}
		} while (!palabra.equals("FIN"));

		do {
			System.out.println("Ingrese una letra");
			palabra = sc.nextLine();
			System.out.println("Palabras con la letra " + palabra);
			System.out.println(letras.get(palabra));

		} while (!palabra.equals("FIN"));
		
		sc.close();
	}

}
