package Ejercicio6_7;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Sociedad {

	private Set<Persona> personas;
	
	
	public Sociedad(Set<Persona> personas) {
		
		this.personas = personas;
	}

	public void addPersona(String genero , BigDecimal altura) throws ParametroIncorrectoException {
		Persona p = new Persona();
	try{
		p.setGenero(genero);
		p.setAltura(altura);
		personas.add(p);
	}catch(ParametroIncorrectoException e) {
		System.out.println("Hay un error");
		throw e;	
		}
	
	}
	
	public BigDecimal calcularAlturaMediaHombres() throws ListaVaciaExecption {
		Set<Persona> hombre = new HashSet<>();
		BigDecimal total = new BigDecimal(0);
		BigDecimal n = new BigDecimal(0);
		
		for ( Persona persona : personas) {
			if ( persona.getGenero().equals("H")) {
				hombre.add(persona);
			}
		}
		
		for( Persona persona : hombre) {
			total = total.add(persona.getAltura());
			n = n.add(BigDecimal.ONE);
		}
		
		if ( total.equals(0)) {
			throw new ListaVaciaExecption("Lista vacia");
		}else {
			return total.divide(n);
		}
		
	}
	
	
	public BigDecimal calcularAlturaMediaMujeres() throws ListaVaciaExecption {
		Set<Persona> mujer = new HashSet<>();
		BigDecimal total = new BigDecimal(0);
		BigDecimal n = new BigDecimal(0);
		
		for ( Persona persona : personas) {
			if ( persona.getGenero().equals("H")) {
				mujer.add(persona);
			}
		}
		
		for( Persona persona : mujer) {
			total = total.add(persona.getAltura());
			n = n.add(BigDecimal.ONE);
		}
		
		if ( total.equals(0)) {
			throw new ListaVaciaExecption("Lista vacia");
		}else {
			return total.divide(n);
		}
		
	}
	
	
}
	
