package programas;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		Integer numeros[] = new Integer[30];
		
		for ( int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(1,11);
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		//modificar notas menores a 5
		
		Integer total = 0;
		for (int i = 0; i < numeros.length; i++) {
			if ( numeros[i] < 5 ) {
				total = 5 - numeros[i];
				numeros[i] = numeros[i] + total;
			}
		}
		
		System.out.println("--------------------------------");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		scanner.close();
	}

}
