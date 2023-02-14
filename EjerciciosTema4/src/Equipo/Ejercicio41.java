package Equipo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Equipo equipo1 = new Equipo("equipo1");
		Equipo equipo2 = new Equipo("equipo2");
		
		
		List<Jugador> jugadores1 = new ArrayList<>();
		
		for ( int i = 0; i < 3; i++) {
			System.out.println("Nombre");
			String nombre = sc.nextLine();
			System.out.println("Dorsal");
			Integer dorsal = sc.nextInt();
			Jugador jugador = new Jugador(nombre,dorsal);
			jugadores1.add(jugador);
		}
		
		
		List<Jugador> jugadores2 = new ArrayList<>();
		
		for ( int i = 0; i < 3; i++) {
			System.out.println("Nombre");
			String nombre = sc.nextLine();
			System.out.println("Dorsal");
			Integer dorsal = sc.nextInt();
			Jugador jugador = new Jugador(nombre,dorsal);
			jugadores1.add(jugador);
		}
	}

}
