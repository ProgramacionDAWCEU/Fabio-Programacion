package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Cuantos numeros me vas a decir");
		Integer num = scanner.nextInt();

		Integer x[] = new Integer[num];

		for (int i = 0; i < x.length; i++) {
			System.out.println("Introduzca numero");
			Integer a = scanner.nextInt();
			x[i] = a;
		}

		Integer y[] = new Integer[x.length];
		Integer z = x.length - 1;

		for (int i = 0; i < y.length; i++) {
			y[i] = x[z];
			z--;
		}

		for (int d = 0; d < y.length; d++) {
			System.out.print(y[d] + " ");
		}

		scanner.close();
	}

}
