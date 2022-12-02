package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Cuantos numeros va a introducir");
		Integer num = scanner.nextInt();

		Integer numeros[] = new Integer[num];

		// Insertar numeros en el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("numero");
			Integer x = scanner.nextInt();
			numeros[i] = x;
		}

		// Ordenar de menor a mayor

		Integer aux = 0;
		Integer aux2 = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i; j < numeros.length; j++) {
				if (numeros[j] < numeros[i]) {
					aux = numeros[i];
					aux2 = numeros[j];
					numeros[i] = aux2;
					numeros[j] = aux;
				}
			}
		}

		// Imprimir array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
		}

		scanner.close();

	}

}
