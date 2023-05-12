package modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Libreria {

	private String nombre;
	private Map<String, Libro> mapa = new HashMap<>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Libro> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, Libro> mapa) {
		this.mapa = mapa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mapa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libreria other = (Libreria) obj;
		return Objects.equals(mapa, other.mapa);
	}

	public BigDecimal getTasacionCompleta() {
		Set<String> keys = mapa.keySet();
		BigDecimal suma = BigDecimal.ZERO;
		for (String key : keys) {
			Libro l = mapa.get(key);
			suma = suma.add(l.getPrecio());
		}
		return suma;
	}

	public BigDecimal getPrecioMedio() {
		Set<String> keys = mapa.keySet();
		BigDecimal suma = BigDecimal.ZERO;
		BigDecimal x = new BigDecimal(mapa.size());
		for (String key : keys) {
			Libro l = mapa.get(key);
			suma = suma.add(l.getPrecio());
		}
		return suma.divide(x, 2, RoundingMode.HALF_DOWN);
	}

	public List getLibrosBaratos() {
		Set<String> keys = mapa.keySet();
		BigDecimal suma = BigDecimal.ZERO;
		List<Libro> librosBaratos = new ArrayList<>();
		for (String key : keys) {
			Libro l = mapa.get(key);
			if (l.getPrecio().compareTo(new BigDecimal(10)) == -1) {
				librosBaratos.add(l);
			}
		}

		return librosBaratos;

	}

}
