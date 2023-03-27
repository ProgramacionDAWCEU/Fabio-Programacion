package EjerciciosExcepciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		
		Integer n = 0;
		
		try {
			do {
				System.out.println("Inque numero");
				n = sc.nextInt();
				numeros.add(n);
			} while (n!=-1);
			System.out.println("No hay error");
			
		} catch (Exception e) {
			System.out.println("Hay un error");
			System.out.println("Escaner cerrado");
		}finally {
			sc.close();
		}
	}
}
