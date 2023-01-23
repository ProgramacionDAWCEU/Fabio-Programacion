package Alumnos;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Alumno alumno = new Alumno();
		
		System.out.println("Escriba el dni");
		alumno.setDni(scanner.nextLine());
		
		System.out.println(alumno.getDni());

	}

}
