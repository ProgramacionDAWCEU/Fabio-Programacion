package Alumnos;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Alumnos alumno = new Alumnos();
		
		
		System.out.println("DNI");
		alumno.setEdad(scanner.nextInt());
		scanner.nextLine();
		
		System.out.println("Nombre");
		String nombre = scanner.nextLine();
		alumno.setNombre(nombre);
		scanner.nextLine();
		
		System.out.println("Edad");
		Integer edad = scanner.nextInt();
		alumno.setEdad(edad);
		scanner.nextLine();
		
		System.out.println("Edad");
		Integer nota = scanner.nextInt();
		alumno.setEdad(nota);
		scanner.nextLine();
		
		System.out.println(alumno.getNombre() + alumno.getDni()+ alumno.getEdad()+ alumno.getNota());
		
		scanner.close();
		
		
		
	}

}
