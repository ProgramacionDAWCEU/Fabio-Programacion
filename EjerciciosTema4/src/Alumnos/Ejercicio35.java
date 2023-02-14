package Alumnos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		
		List<Alumno> lista = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for ( int i = 0; i < 3; i++) {
			Alumno al = new Alumno();
			lista.add(al);
			System.out.println("Digame el nombre del alumno");
			al.setNombre(scanner.nextLine());
			scanner.nextLine();
			System.out.println("Digame el dni del alumno");
			al.setDni(scanner.nextLine());
			scanner.nextLine();
			if ( lista.get(i).validarDni() == false) {
				System.out.println("Error en el dni	");
			}
		}
		
		if ( lista.get(0).equals(lista.get(1)) || lista.get(1).equals(lista.get(2))) {
			System.out.println("Hay dos alumnos que son iguales");
		}else {
			System.out.println("Sin error");
		}

	}

}
