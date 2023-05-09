package Ejercicio11;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws SQLException, PedidoException, NotFoundException {

		int y = menu();

		if (y == 1) {
			nuevoPedido();
		} else if (y == 2) {
			verPedido();
		}

	}

	public static Integer menu() {
		Scanner sc = new Scanner(System.in);

		Integer x = null;

		System.out.println("Crear nuevo pedido");
		System.out.println("Ver pedido");
		System.out.println("Salir");
		x = sc.nextInt();

		return x;
	}

	public static void nuevoPedido() throws SQLException, PedidoException {
		Scanner sc = new Scanner(System.in);
		Pedido p = new Pedido();
		PedidoService service = new PedidoService();
		List<PedidoLinea> pedidos = new ArrayList<>();

		System.out.println("Numero de pedido");
		p.setNumero(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Nombre");
		p.setCliente(sc.nextLine());
		
		p.setFecha_entrega(LocalDate.now());

		System.out.println("Cuantas lineas quiere?");
		Integer l = sc.nextInt();
		
		for (int i = 0; i < l; i++) {

			PedidoLinea pl = new PedidoLinea();

			System.out.println("Numero de pedido");
			Integer numero = sc.nextInt();
			pl.setNumero_pedido(numero);
			
			sc.nextLine();

			System.out.println("Articulo");
			String articulo = sc.nextLine();
			pl.setArticulo(articulo);
			
			sc.nextLine();

			System.out.println("Cantidad");
			Integer cantidad = sc.nextInt();
			pl.setCantidad(cantidad);

			sc.nextLine();
			
			System.out.println("Precio");
			Integer precio = sc.nextInt();
			pl.setPrecio_unitario(precio);

			pedidos.add(pl);
			p.setPedidos(pedidos);
		}

		service.crearPedidoCompleto(p);

	}

	public static void verPedido() throws SQLException, PedidoException, NotFoundException {
		Scanner sc = new Scanner(System.in);
		Pedido p = new Pedido();
		PedidoService service = new PedidoService();

		System.out.println("Dime el numero del pedido");
		Integer x = sc.nextInt();
		service.consultarPedidoCompleto(x);
	}

}
