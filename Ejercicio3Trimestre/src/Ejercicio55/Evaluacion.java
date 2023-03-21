package Ejercicio55;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Evaluacion {

	private Map<String, BigDecimal> notas = new HashMap<>();

	public Boolean addNota(String dni, BigDecimal nota) {
		if (notas.containsKey(dni)) {
			return false;
		} else {
			notas.put(dni, nota);
			return true;
		}
	}

	public Boolean corregirNota(String dni, BigDecimal nota) {
		if (notas.containsKey(dni)) {
			notas.put(dni, nota);
			return true;
		} else {
			return false;
		}
	}

	public BigDecimal obtenerNotaAlumno(String dni) {
		if (notas.containsKey(dni)) {
			// BigDecimal nota = notas.get(dni);
			return notas.get(dni);
		}
		return BigDecimal.ZERO;
	}

	public BigDecimal obtenerNotaMedia(String dni) {
		BigDecimal suma = BigDecimal.ZERO;
		for (BigDecimal nota : notas.values()) {
			suma = suma.add(nota);
		}

		BigDecimal cantidad = new BigDecimal(notas.size());
		return suma.divide(cantidad, 2, RoundingMode.HALF_DOWN);
	}

	public Integer obtenerCantidadAprobados() {
		Integer cantidad = 0;
		for (BigDecimal nota : notas.values()) {
			if (nota.compareTo(new BigDecimal(5)) >= 0) {
				cantidad++;
			}
		}

		return cantidad;
	}

	public List<String> obtenerSuspensos() {
		List<String> suspensos = new ArrayList<>();
		for (String dni : notas.keySet()) {
			if (notas.get(dni).compareTo(new BigDecimal(5)) < 0) {
				suspensos.add(dni);
			}
		}
		
		return suspensos;
	}

	public void borrarAprobados() {
		List<String> suspensos = obtenerSuspensos();
		Iterator<String> it = notas.keySet().iterator();
		while (it.hasNext()) {
			String dni = (String) it.next();
			if (!suspensos.contains(dni)) {
				it.remove();
			}
		}
	}

	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,###.0");
		String aprobados = "Aprobados: \n";
		String suspensos = "Suspensos: \n";
		for (String dni : notas.keySet()) {
			String alumno = "\t" + dni + " (" + formato.format(notas.get(dni)) + ")\n";
			if (notas.get(dni).compareTo(new BigDecimal(5)) < 0) {
				suspensos += alumno;
				} else {
					aprobados += alumno;
					}
			}
		return aprobados + "\n" + suspensos;
		}

}
