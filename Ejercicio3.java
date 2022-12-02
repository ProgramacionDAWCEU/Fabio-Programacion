package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Cuantos numeros va a introducir");
		Integer num = scanner.nextInt();

		Integer numeros[] = new Integer[num];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca numero");
			Integer x = scanner.nextInt();
			numeros[i] = x;
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		scanner.close();
	}
}
