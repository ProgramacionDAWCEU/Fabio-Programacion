package Ejercicio11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private Integer numero;
	private String cliente;
	private LocalDate fecha_entrega;
	private List<PedidoLinea> pedidos = new ArrayList<>();
	
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public LocalDate getFecha_entrega() {
		return fecha_entrega;
	}
	public void setFecha_entrega(LocalDate fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	public List<PedidoLinea> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<PedidoLinea> pedidos) {
		this.pedidos = pedidos;
	}
	
	
	
}
