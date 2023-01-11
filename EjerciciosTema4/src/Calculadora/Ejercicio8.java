package Calculadora;

import java.util.Scanner;

public class Ejercicio8 {
	static String suma = "ADD";
	static String resta = "SUB";
	static String mult = "MUL";
	static String div = "DIV";
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(mult);
		System.out.println(div);
		System.out.println("Escriba la función ");
		String f = scanner.nextLine();
		System.out.println(funcion(f, 2,4));
	}
	
	public static Integer funcion(String f, int x, int y) {
		Integer r = 0;
		if ( f.equals(suma)) {
			r = Calculadora.getSuma(x, y);
		}else if ( f.equals(resta)) {
			r = Calculadora.getResta(x, y);
		}else if ( f.equals(mult)) {
			r = Calculadora.getMult(x, y);
		}else if ( f.equals(div)) {
			r = Calculadora.getDiv(x, y);
		}
		
		return r;
	}

}
