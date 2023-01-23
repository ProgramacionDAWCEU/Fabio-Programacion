package Alumnos;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String DNI = "111";
		String nombre = "Pepe";
		int edad = 18;
		int nota = 7;
		Alumno alumno = new Alumno(DNI);
		alumno.setNombre(nombre);
		alumno.setEdad(edad);
		alumno.setNota(nota);
		System.out.println(alumno.getNombre() +  " " + alumno.getDni() + " " + alumno.getEdad() + " " + alumno.getNota());

		sc.close();
	}

}
