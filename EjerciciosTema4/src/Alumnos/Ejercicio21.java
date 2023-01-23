package Alumnos;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Alumno alumno = new Alumno();
		
		String nombre = "XXXX";
		int edad = 21;
		
		alumno.setNombre(nombre);
		alumno.setEdad(edad);
		
		System.out.println(alumno.toString());
	}

}
