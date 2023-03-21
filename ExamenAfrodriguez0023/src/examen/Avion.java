package examen;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

public class Avion extends Asiento {

	/*
	 * public Avion(String compañia) { fecha_fabricacion = LocalDate.of(2000, 1, 1);
	 * }
	 */

	private String compañia;
	private LocalDate fecha_fabricacion;
	private List<Asiento> listaAsientos;

	public Avion(Integer fila, String letra, String compañia) {
		super(fila, letra);
		fecha_fabricacion = LocalDate.of(2000, 1, 1);
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public LocalDate getFecha_fabricacion() {
		return fecha_fabricacion;
	}

	public void setFecha_fabricacion(LocalDate fecha_fabricacion) {
		this.fecha_fabricacion = fecha_fabricacion;
	}

	public List<Asiento> getListaAsientos() {
		return listaAsientos;
	}

	public void setListaAsientos(List<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}

	public Integer getAntiguedad() {
		LocalDate hoy = LocalDate.now();
		return hoy.getYear() - fecha_fabricacion.getYear();
	}

	public Integer getCantidadAsientosOcupados() {
		return listaAsientos.size();
	}

	public Integer getListaAsientosLibres() {
		return listaAsientos.size();
	}

	public void establecerPrecioBaseAsiento(BigDecimal precio) {
		setPrecioBase(precio);
	}

	public BigDecimal getPrecioMedioVenta(BigDecimal precio, Boolean tipo) {
		BigDecimal y = new BigDecimal(listaAsientos.size());
		BigDecimal total = getPrecioVenta(precio,tipo).divide(y);
		return total;
	}

	@Override
	public String toString() {
		return "Avion [compañia=" + compañia + ", fecha_fabricacion=" + fecha_fabricacion + ", listaAsientos="
				+ listaAsientos + "]";
	}
	
	
	
}
