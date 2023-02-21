package Carrito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private LocalDate fechaCreacion;
	private LocalDate ultimaActualizacion;
	private List<Articulo> listaArticulos = new ArrayList<>();
	private Cliente cliente;
	
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public LocalDate getUltimaActualizacion() {
		return ultimaActualizacion;
	}
	public void setUltimaActualizacion(LocalDate ultimaActualizacion) {
		this.ultimaActualizacion = ultimaActualizacion;
	}
	public List<Articulo> getListaArticulos() {
		return listaArticulos;
	}
	public void setListaArticulos(List<Articulo> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
	
	public void addArticulo(Articulo articulo) {
		listaArticulos.add(articulo);
	}
	
}
