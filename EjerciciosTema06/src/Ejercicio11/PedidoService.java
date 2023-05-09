package Ejercicio11;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Ejercicio1.Persona;
import programa.Main;

public class PedidoService {

	public List<PedidoLinea> consultarLineasPedido(Integer numeroPedido) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			List<PedidoLinea> lista = new ArrayList<>();
			Main proveedor = new Main();
			conn = proveedor.getConnection();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM PEDIDOS_LINEAS WHERE NUMERO_PEDIDO = " + numeroPedido;
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

	public PedidoLinea consultarPedidoCompleto(Integer numeroPedido) throws SQLException, NotFoundException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			List<PedidoLinea> lista = new ArrayList<>();
			Main proveedor = new Main();
			conn = proveedor.getConnection();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM PEDIDOS_LINEAS WHERE NUMERO = " + numeroPedido;
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				PedidoLinea pedido = new PedidoLinea();
				Integer numero_pedido1 = rs.getInt("numero_pedido");
				String cliente = rs.getString("cliente");
				Integer cantidad = rs.getInt("cantidad");
				Integer precio_unitario = rs.getInt("precio_unitario");

				pedido.setNumero_pedido(numero_pedido1);
				pedido.setArticulo(cliente);
				pedido.setCantidad(cantidad);
				pedido.setPrecio_unitario(precio_unitario);
				lista.add(pedido);
				return pedido;

			} else {
				throw new NotFoundException("No existe pedido con ese numero");
			}

		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public void insertarLineaPedido(PedidoLinea linea, Connection conn) throws SQLException {
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO PEDIDOS_LINEAS VALUES (?, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, linea.getNumero_pedido());
			stmt.setString(2, linea.getArticulo());
			stmt.setInt(3, linea.getCantidad());
			stmt.setInt(4, linea.getPrecio_unitario());
			stmt.execute();
		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}
		}
	}

	public void crearPedidoCompleto(Pedido pedido) throws PedidoException {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Main proveedor = new Main();
			conn = proveedor.getConnection();
			conn.setAutoCommit(false);
			String sql = "INSERT INTO PEDIDOS VALUES (?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, pedido.getNumero());
			stmt.setString(2, pedido.getCliente());
			stmt.setDate(3, Date.valueOf(pedido.getFecha_entrega()));
			stmt.execute();

			for (PedidoLinea linea : pedido.getPedidos()) {
				insertarLineaPedido(linea, conn);
			}
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e2) {
				throw new PedidoException(
						"Error al insertar pedido y no se ha podido deshacer transaccin. La BBDD puede estar inconsistente",
						e);
			}
			throw new PedidoException("Error al insertar el pedido", e);
		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}

}
