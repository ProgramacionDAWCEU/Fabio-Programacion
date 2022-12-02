package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Cuantos numeros va a introducir");
		Integer num = scanner.nextInt();

		Integer numeros[] = new Integer[num];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca numero");
			numeros[i] = scanner.nextInt();
		}

		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}

		scanner.close();

	}

}
