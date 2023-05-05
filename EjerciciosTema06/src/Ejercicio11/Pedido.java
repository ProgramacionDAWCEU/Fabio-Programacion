package Ejercicio11;

import java.time.LocalDate;
import java.util.List;

public class Pedido {

	private Integer numero;
	private String cliente;
	private LocalDate fecha_entrega;
	private List<PedidoLinea> pedidos;
}
