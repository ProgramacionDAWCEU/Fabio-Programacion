package Alumnos;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		
		Alumno listaAlumno[] = new Alumno[3];
		Scanner scanner = new Scanner(System.in);
		
		for ( int i = 0; i < listaAlumno.length; i++) {
			Alumno al = new Alumno();
			listaAlumno[i] = al;
			System.out.println("Digame el nombre del alumno");
			al.setNombre(scanner.nextLine());
			scanner.nextLine();
			System.out.println("Digame el dni del alumno");
			al.setDni(scanner.nextLine());
			scanner.nextLine();
		}
		
		if ( listaAlumno[0].equals(listaAlumno[1]) || listaAlumno[1].equals(listaAlumno[2])) {
			System.out.println("Hay dos alumnos que son iguales");
		}else {
			System.out.println("Sin error");
		}
	}

}
