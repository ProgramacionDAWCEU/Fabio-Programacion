package modelo;

import java.time.LocalDate;

public class Agenda {

	private String concepto;
	private String tipo;
	private LocalDate fecha;

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Agenda [concepto=" + concepto + ", tipo=" + tipo + ", fecha=" + fecha + "]";
	}
	
	

}
