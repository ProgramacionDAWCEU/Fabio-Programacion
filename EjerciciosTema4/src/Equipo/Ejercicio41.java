package Equipo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Equipo equipo1 = new Equipo("equipo1");
		Equipo equipo2 = new Equipo("equipo2");
		
		//Se crean los dos equipos
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
		
		
		//Se crea el partido con resultado de 0-0
		
		Partido partido = new Partido();
		partido.setEquipoLocal(equipo1);
		partido.setEquipoLocal(equipo2);
		
		Resultado resultado = new Resultado(1,0);
		partido.setResultado(resultado);
		System.out.println(resultado.toString());
	}

}
