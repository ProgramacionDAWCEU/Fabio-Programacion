package EjerciciosExcepciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();

		Integer n = 0;

		try {

			do {
				try {
					System.out.println("Indique numero");
					n = sc.nextInt();
					numeros.add(n);
				} catch (Exception e) {
					System.out.println("Error");
					sc.nextLine();
				}
			} while (n != -1);

		} finally {
			sc.close();
		}

	}

}
