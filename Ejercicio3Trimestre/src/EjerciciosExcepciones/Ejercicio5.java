package EjerciciosExcepciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		SacoNumeros s = new SacoNumeros();
		

		Scanner sc = new Scanner(System.in);
		

		Integer n = 0;

		try {

			do {
				try {
					System.out.println("Indique numero");
					n = sc.nextInt();
					if (n != -1) {
						s.addNumero(n);
					}
				} catch (Exception e) {
					System.out.println("Error");
					sc.nextLine();
				}
			} while (n != -1);
			
			

		} finally {
			
		}
		
		System.out.println(s.division());


	}

}
