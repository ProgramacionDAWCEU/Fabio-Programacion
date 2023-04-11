package Ejercicio6_7;

import java.math.BigDecimal;

public class Persona {
	private String genero;
	private BigDecimal altura;

	public void setGenero(String genero) throws ParametroIncorrectoException {
		if (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M")) {
			throw new ParametroIncorrectoException("Genero incorrecto");
		} else {
			this.genero = genero;
		}
	}

	public void setAltura(BigDecimal altura) throws ParametroIncorrectoException {
		if (altura.compareTo(BigDecimal.ZERO) <= 0 || altura.compareTo(new BigDecimal(3)) >= 0) {
			throw new ParametroIncorrectoException("Altura incorrecta");
		} else {
			this.altura = altura;
		}
	}

	public String getGenero() {
		return genero;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "Persona [genero=" + genero + ", altura=" + altura + "]";
	}

}
