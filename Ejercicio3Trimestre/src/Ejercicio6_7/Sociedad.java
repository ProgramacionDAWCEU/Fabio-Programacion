package Ejercicio6_7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Set;

public class Sociedad {

	private Set<Persona> personas;

	public Sociedad() {
		personas = new HashSet<>();
	}

	public void addPersona(String genero, BigDecimal altura) throws ParametroIncorrectoException {
		Persona p = new Persona();
		try {
			p.setGenero(genero);
			p.setAltura(altura);
			personas.add(p);
		} catch (ParametroIncorrectoException e) {
			System.out.println("Hay un error");
			throw e;
		}

	}

	public BigDecimal calcularAlturaMediaHombres() throws ListaVaciaExecption {
		Set<Persona> hombre = new HashSet<>();
		BigDecimal total = new BigDecimal(0);

		for (Persona persona : personas) {
			if (persona.getGenero().equalsIgnoreCase("H")) {
				hombre.add(persona);
			}
		}

		BigDecimal n = new BigDecimal(hombre.size());

		for (Persona persona : hombre) {
			total = total.add(persona.getAltura());
		}

		if (hombre.isEmpty()) {
			throw new ListaVaciaExecption("Lista vacia");
		} else {
			return total.divide(n, 2, RoundingMode.HALF_DOWN);
		}

	}

	public BigDecimal calcularAlturaMediaMujeres() throws ListaVaciaExecption {
		Set<Persona> mujer = new HashSet<>();
		BigDecimal total1 = new BigDecimal(0);

		for (Persona persona : personas) {
			if (persona.getGenero().equals("M")) {
				mujer.add(persona);
			}
		}
		BigDecimal n = new BigDecimal(mujer.size());

		for (Persona persona : mujer) {
			total1 = total1.add(persona.getAltura());

		}

		if (mujer.isEmpty()) {
			throw new ListaVaciaExecption("Lista vacia");
		} else {
			return total1.divide(n, 2, RoundingMode.HALF_DOWN);
		}

	}

}
