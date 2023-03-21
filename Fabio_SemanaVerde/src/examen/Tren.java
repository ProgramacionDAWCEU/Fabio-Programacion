package examen;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Tren{

	private String destino;
	protected Integer plazas;
	private BigDecimal precio;
	private LocalDate fechaConstruccion;
	private Integer horaSalida;
	private List<Pasajero> listaPasajeros;
	
	
	public Tren(String destino, Integer plazas) {
		this.destino = destino;
		this.plazas = plazas;
		this.horaSalida = 0;
		this.precio = new BigDecimal(0);
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public Integer getPlazas() {
		return plazas;
	}


	public void setPlazas(Integer plazas) {
		this.plazas = plazas;
	}


	public BigDecimal getPrecio() {
		return precio;
	}


	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	public LocalDate getFechaConstruccion() {
		return fechaConstruccion;
	}


	public void setFechaConstruccion(LocalDate fechaConstruccion) {
		this.fechaConstruccion = fechaConstruccion;
	}


	public Integer getHoraSalida() {
		return horaSalida;
	}


	public void setHoraSalida(Integer horaSalida) {
		this.horaSalida = horaSalida;
	}


	public List<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}


	public void setListaPasajeros(List<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
	
	public Integer getPlazasLibres(Integer plazasOcupadas) {
		Integer total = plazas - plazasOcupadas;
		return total;
	}

	

	@Override
	public String toString() {
		return "Salida: " + horaSalida + "horas >>" + destino + " - " + precio;
	}
	
//	public BigDecimal getRecaudacion(Integer precio) {
//		BigDecimal total;
//		return total;
//	}
//	
	
	
	
	
	
	
	
}
