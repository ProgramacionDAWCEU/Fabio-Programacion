package Ejercicio11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Ejercicio1.Persona;
import programa.Main;

public class PedidoService {

	public List<PedidoLinea> consultarLineasPedido(Integer numeroPedido) throws SQLException {
		List<PedidoLinea> lista = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Main proveedor = new Main();
			conn = proveedor.getConnection();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM PEDIDOS_LINEAS WHERE NUMERO_PEDIDO = " + numero_pedido;
			rs = stmt.executeQuery(sql);

			
			while (rs.next()) {
				PedidoLinea pedido = new PedidoLinea();
				Integer numero_pedido1 = rs.getInt("numero_pedido");
				String articulo = rs.getString("articulo");
				Integer cantidad = rs.getInt("cantidad");
				Integer precio_unitario = rs.getInt("precio_unitario");

				pedido.setNumero_pedido(numero_pedido1);
				pedido.setArticulo(articulo);
				pedido.setCantidad(cantidad);
				pedido.setPrecio_unitario(precio_unitario);
				lista.add(pedido);
				
			}
			
			return lista;
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public void consultarPedidoCompleto() {

	}

	public void insertarLineaPedido() {

	}

	public void crearPedidoCompleto() {

	}
}
