package EjerciciosExcepciones;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		SacoNumeros s = new SacoNumeros();

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
			
			do {
				System.out.println("Indique la posicion");
				 n = sc.nextInt();
				System.out.println(s.getNumeros(n));
			} while (n != 1);

		} finally {
			
		}

		System.out.println(s.toString());
		
		
		
	}
}
