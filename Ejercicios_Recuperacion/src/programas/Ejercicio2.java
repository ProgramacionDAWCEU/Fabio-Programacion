package programas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer numero;
		
		do {
			System.out.println("Introduzca un numero del 2 al 10");
			numero = scanner.nextInt();
		} while (numero >= 2 && numero <= 10);
		
		scanner.nextLine();
		
		String silaba;
		
		do {
			System.out.println("Dme una palabra de tamaño 2");
			silaba = scanner.nextLine();
		} while (silaba.length() != 2);
		
		String palabra;
		
		do {
			System.out.println("Dame una palabra magica");
			palabra = scanner.nextLine();
			if ( palabra.length() < numero) {
				System.out.println("La palabra es menor a " + numero);
			}else if ( palabra.length() > numero) {
				System.out.println("La palabra es mayor a " + numero);
			}
		} while (palabra.length() == numero && palabra.endsWith(silaba));
	}

}
