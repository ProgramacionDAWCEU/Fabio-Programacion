package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String array[] = new String[3];
		String p = "";
		for (int i = 0; i < 3; i++) {
			System.out.println("Introduzca una palabra");
			String palabra = scanner.nextLine();
			array[i] = palabra;
		}

		for (int i = 0; i < array.length; i++) {
			p = p + array[i] + " ";
		}

		System.out.println(p);

		scanner.close();
	}

}
