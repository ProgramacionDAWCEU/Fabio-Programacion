package Programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// metodo static que recibe a y b , lo dividde y devuelve la division
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el dividendo");
		Integer dividendo = sc.nextInt();
		System.out.println("Dime el divisor");
		Integer divisor = sc.nextInt();
		
		
		try {
			Integer resultado = dividir(dividendo,divisor);
			System.out.println(resultado);
		} catch (ArithmeticException e) {
			System.out.println("Infinito");
		}
		
		System.out.println("FIN");
		sc.close();

	}
	
	public static Integer dividir(Integer a , Integer b) {
		return a/b;
	}

}
