package Ejercicio44;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tipos de personajes");
		System.out.println("1. Asesinos");
		System.out.println("2. Parasitos");
		
		Equipo equipo = new Equipo();
		Asesino a1 = new Asesino();
		Asesino a2 = new Asesino();
		Asesino a3= new Asesino();
		
		a1.setCodigo("1");
		a2.setCodigo("2");
		a3.setCodigo("3");
		
		
	}

}
