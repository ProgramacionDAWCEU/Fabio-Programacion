package Alumnos;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Alumno alumno = new Alumno();
		
		String DNI = "65465456";
		String nombre = "Pepe";
		Integer edad = 18;
		Integer nota = 3;
		
		alumno.setDni(DNI);
		alumno.setNombre(nombre);
		alumno.setEdad(edad);
		alumno.setNota(nota);
		
		System.out.println(alumno.toString());
		
	}

}
