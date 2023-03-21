package examen;

import java.util.List;
import java.util.Objects;

public class Estacion {

	private String nombre;
	private List<Tren> trenesDisponibles;
	
	
	public Estacion(String nombre) {
		
		this.nombre = nombre;
	}
	
	
	public void addTren(Tren tren) {
		trenesDisponibles.add(tren);
	}
	
	public void borrarTrenesCompletos(Tren tren) {
		if (tren.getPlazasLibres(2) == 0) {
			trenesDisponibles.remove(tren);
		}
	}
	
	Tren t;
	public Tren getProximoTren(String ciudad , Integer hora) {
		for ( int i = 0 ; i < trenesDisponibles.size(); i++) {
			if(t.getPlazasLibres(2) > 0 ) {
				return t;
			}
		}
		return t;
	}
	
	public Tren getTrenMasRapido(String ciudad) {
		return trenesDisponibles.get(0);
	}


	@Override
	public int hashCode() {
		return Objects.hash(nombre, t, trenesDisponibles);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estacion other = (Estacion) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(t, other.t)
				&& Objects.equals(trenesDisponibles, other.trenesDisponibles);
	}
	
	
	
	
	
}
