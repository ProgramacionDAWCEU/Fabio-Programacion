package Alumnos;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Alumnos alumno = new Alumnos();
		
		alumno.setDni(5);
		
		System.out.println(alumno.getDni());
	}

}
