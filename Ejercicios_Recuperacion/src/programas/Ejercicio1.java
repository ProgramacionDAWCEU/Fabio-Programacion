package programas;


import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame una lista de nombres separados por ;");
		String nombre = scanner.nextLine();
		
		String nombres[] = nombre.split(";");
		Integer edades[] = new Integer[nombres.length];
		
		for (int i = 0; i < nombres.length; i++) {
			Integer edad = 0;
			
			do {
				System.out.println("Dame la edad de " + nombres[i]);
				edad = scanner.nextInt();
			} while (!(edad >= 18 && edad < 100));
			edades[i] = edad;
		}
		
		 for (int i = 0; i < edades.length; i++) {
			System.out.println(nombres[i] + " tiene " + edades[i]);
		}
		
		scanner.close();
		
	}

}
