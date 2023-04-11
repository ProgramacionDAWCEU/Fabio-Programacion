package Ejercicio6_7;

import java.math.BigDecimal;

public class Ejercicio6 {

	public static void main(String[] args) throws ParametroIncorrectoException {

		Persona p = new Persona();

		BigDecimal n = new BigDecimal(1);

		p.setGenero("H");
		p.setAltura(n);

		System.out.println(p.toString());

	}

}
