package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = 0;
		do {
			System.out.println("Ingrese un tamaño para el array que sea mayor a 2");
			num = scanner.nextInt();
		} while (num < 2);

		int x = 0;
		int x1 = 1;
		Integer numeros[] = new Integer[num];
		for (int i = 0; i < numeros.length - 1; i++) {
			numeros[i] = x;
			numeros[i + 1] = x1;
			x1 = x + x1;
			x = x1 - x;
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		scanner.close();

	}

}
