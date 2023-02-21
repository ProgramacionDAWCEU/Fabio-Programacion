package Dates;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean comprobarFecha;
		LocalDate fecha;
		do {
			System.out.println("Fecha de nacimiento");
			int dia = sc.nextInt();
			int mes = sc.nextInt();
			int anio = sc.nextInt();
			fecha = LocalDate.of(dia, mes, anio);
			comprobarFecha = comprobar(fecha);
			
		} while (comprobarFecha == false);
		
		Boolean anioBisiesto = fecha.isLeapYear(); 
		

	}
	
	public static Boolean comprobar(LocalDate fecha) {
		if ( fecha.isAfter(LocalDate.now()) ) {
			return false;
		}else {
			return true;
		}
	}

}
