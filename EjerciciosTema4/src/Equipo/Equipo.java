package Equipo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private String nombre;
	private Jugador capitan;
	private List<Jugador> jugadores = new ArrayList<>();

	public Equipo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador getCapitan() {
		return capitan;
	}

	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", capitan=" + capitan + ", jugadores=" + jugadores + "]";
	}

}
