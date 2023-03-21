package examen;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Pasajero a = new Pasajero();
		a.setNombre("Sofía García Molina");
		a.setDni("8765432R");
		LocalDate fecha = LocalDate.of(1951, 02, 13);
		a.setFechaNacimiento(fecha);
		
		Pasajero b = new Pasajero();
		b.setNombre("Laura López Gómez");
		b.setDni("12345678X");
		fecha = LocalDate.of(2001, 10, 25);
		b.setFechaNacimiento(fecha);
		
		Alta alta = new Alta("Granada", 2);
		alta.setHoraSalida(10);
		fecha = LocalDate.of(2017, 05, 30);
		alta.setFechaConstruccion(fecha);
		BigDecimal precio = new BigDecimal(49.50);
		alta.setPrecio(precio);
		
		Regional electrico = new Regional("Granada", 2);
		electrico.setHoraSalida(20);
		precio = new BigDecimal(13.2);
		electrico.setPrecio(precio);
		
		
		
		
		System.out.println("Pasajeros: ");
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		System.out.println("Trenes: ");
		System.out.println(alta.toString());
		System.out.println(electrico.toString());
		
		
		String nombre;
		do {
			System.out.println("Ingrese el nombre de la estacion");
			nombre = sc.nextLine();
		} while (nombre.length() < 10);
		Estacion e = new Estacion(nombre.toUpperCase());
		
		e.addTren(electrico);
		e.addTren(alta);
		
		
		
		
		sc.close();
	}

}
