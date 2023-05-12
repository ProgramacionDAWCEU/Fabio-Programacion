package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Libro;
import conexion.Main;

public class LibreriaService {

	public void insertarLibroNuevo(Libro libro) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Main proveedor = new Main();
			conn = proveedor.getConnection();
			conn.setAutoCommit(false);
			String sql = "INSERT INTO LIBROS VALUES (?, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, libro.getISBN());
			stmt.setString(2, libro.getTitulo());
			stmt.setString(3, libro.getAutor());
			stmt.setBigDecimal(4, libro.getPrecio());
			stmt.execute();

			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e2) {

			}

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
	
	public Boolean actualizarPrecioLibroNuevo(Libro libro) throws LibroException {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Main proveedor = new Main();
			conn = proveedor.getConnection();
			conn.setAutoCommit(false);
			String sql = "UPDATE LIBROS SET = ? WHERE ISBN = '" + libro.getISBN() + "'";
			stmt = conn.prepareStatement(sql);
			stmt.setBigDecimal(1, libro.getPrecio());
			stmt.execute();
			
			if(stmt.executeUpdate() > 0) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			throw new LibroException();

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
