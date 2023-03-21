package examen;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Asiento {

	private Integer fila;
	private String letra;
	private Boolean ocupado;
	private BigDecimal precioBase;
	private Boolean tipoAsiento;

	public Asiento(Integer fila, String letra) {
		this.fila = fila;
		this.letra = letra;
		this.ocupado = false;// libre
	}

	public Integer getFila() {
		return fila;
	}

	public void setFila(Integer fila) {
		this.fila = fila;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public Boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}

	public BigDecimal getPrecioVenta() {
		return precioBase;
	}

	public void setPrecioBase(BigDecimal precioBase) {
		this.precioBase = precioBase;
	}

	public Boolean getTipoAsiento() {
		return tipoAsiento;
	}

	public void setTipoAsiento(Boolean tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}

	public BigDecimal getPrecioVenta(BigDecimal x, Boolean tipoAsiento) {
		if (tipoAsiento == true) { // es normal
			x = x.setScale(2, RoundingMode.HALF_UP);
			return x;
		} else { // es vip
			double y = x.doubleValue();
			y = y * 0.2;
			BigDecimal z = new BigDecimal(y);
			z = z.setScale(2, RoundingMode.HALF_UP);
			return z;
		}

	}

	@Override
	public String toString() {
		return "Asiento [fila=" + fila + ", letra=" + letra + ", ocupado=" + ocupado + ", precioBase=" + precioBase
				+ ", tipoAsiento=" + tipoAsiento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fila, letra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asiento other = (Asiento) obj;
		return Objects.equals(fila, other.fila) && Objects.equals(letra, other.letra);
	}

}
