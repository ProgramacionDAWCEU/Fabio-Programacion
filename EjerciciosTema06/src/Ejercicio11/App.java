package Ejercicio11;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);

		Integer x = null;

		do {
			System.out.println("Crear nuevo pedido");
			System.out.println("Ver pedido");
			System.out.println("Salir");
			x = sc.nextInt();
		} while (x < 1 || x > 3);
	}

}
