package Dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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
		
		if ( fecha.isLeapYear() == true) {
			System.out.println("Ha nacido en un año bisiesto");
		}else {
			System.out.println("No ha nacido en un año bisiesto");
		}
		
		System.out.println(fecha.getDayOfWeek());
		Period periodo = fecha.until(LocalDate.now());
		System.out.println("Tienes " + periodo.getYears());
		
		LocalDate muerte = fecha.plusYears(100);
		periodo = LocalDate.now().until(muerte);
		System.out.println("Te quedan " + periodo.getYears() + " meses " + periodo.getMonths());
		
		LocalTime hora = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		

	}
	
	public static Boolean comprobar(LocalDate fecha) {
		if ( fecha.isAfter(LocalDate.now()) ) {
			return false;
		}else {
			return true;
		}
	}
	
	public static Integer edad(LocalDate fecha) {
		Integer anio = fecha.getYear();
		Integer anioActual = LocalDate.now().getYear();
		return anioActual - anio;
	}
	
	public static Integer siglo(LocalDate fecha, Integer edad) {
		return 100 - edad;
	}
	
	

}
