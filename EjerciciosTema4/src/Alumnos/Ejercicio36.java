package Alumnos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Curso> lista = new ArrayList<>(); //Se le pasa los datos al constructor
		
		String nombre;
		String dni;
		Integer nota;
		
//		for ( int i = 0; i < 3; i++) {
//			Alumno al1 = new Alumno();
//			System.out.println("Nombre");
//			al1.setNombre(scanner.nextLine());
//			System.out.println("DNI");
//			al1.setDni(scanner.nextLine());
//			System.out.println("Nota");
//			al1.setNota(scanner.nextInt());
//			scanner.nextLine();
//			curso.addAlumno(al1);
//			al1.setC(lista(i));
//		}
		
		for ( int i = 0; i < 3; i++) {
			Alumno al = new Alumno();
			System.out.println("Nombre");
			
		}
		
		System.out.println(lista);
		
	}

}
