package Ejercicio56;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> numeros = new HashMap<>();

		Integer x = 0;
		Integer c = 1;
		Integer total = 0;
		do {
			System.out.println("Ingrese numero");
			x = sc.nextInt();
			if (!numeros.containsKey(x)) {
				numeros.put(x, c);
				total++;
			} else {
				numeros.put(x, numeros.get(x) + 1);
				total++;
			}
		} while (x != 0);

		numeros.remove(0);

		System.out.println("Numeros totales" + total);
		System.out.println("Distribucion ");

		Set<Integer> keys = numeros.keySet();
		for (Integer key : keys) {
			System.out.print("	" + ">Numero " + key + " : ");
			System.out.println(numeros.get(key) + " veces");
		}

		sc.close();
	}

}
