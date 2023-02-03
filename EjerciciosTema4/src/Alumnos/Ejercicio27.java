package Alumnos;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Alumno alumno = new Alumno();
		
		String dni = "54437238X";
		alumno.setDni(dni);
		System.out.println(dni.length());
		System.out.println(alumno.validar());
		

	}

}
