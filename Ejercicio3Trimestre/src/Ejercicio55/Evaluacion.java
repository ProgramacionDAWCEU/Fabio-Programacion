package Ejercicio55;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Evaluacion {

	private Map<String, BigDecimal> notas = new HashMap<>();
	
	public Boolean addNota(String dni , BigDecimal nota) {
		if ( notas.containsKey(dni)) {
			return false;
		}else {
			notas.put(dni, nota);
			return true;
		}
	}
	
	public Boolean corregirNota(String dni , BigDecimal nota) {
		if ( notas.containsKey(dni)) {
			notas.put(dni, nota);
			return true;
		}else {
			return false;
		}
	}
	
	public BigDecimal obtenerNotaAlumno(String dni) {
		if (notas.containsKey(dni)) {
			BigDecimal nota = notas.get(dni);
			return nota;
		}
		return BigDecimal.ZERO;
	}
	
	
}
