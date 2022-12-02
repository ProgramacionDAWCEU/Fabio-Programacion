package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Cuantos numeros va a introducir");
		Integer num = scanner.nextInt();

		Integer numeros[] = new Integer[num];

		for (int pos = numeros.length - 1; pos >= 0; pos--) {
			System.out.println("Numero");
			Integer x = scanner.nextInt();
			numeros[pos] = x;
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		scanner.close();

	}

}
