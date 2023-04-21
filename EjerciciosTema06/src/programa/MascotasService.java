package programa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MascotasService {
	public List<Mascota> consultarMascotas() throws SQLException {
		List<Mascota> mascotas = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Main proveedor = new Main();
			conn = proveedor.getConnection();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM MASCOTAS";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String codigo = rs.getString("codigo");
				String nombre = rs.getString("nombre");
				Mascota mascota = new Mascota();
				mascota.setCodigo(codigo);
				mascota.setNombre(nombre);
				mascotas.add(mascota);
			}
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}

		return mascotas;
	}

	public void insertarMascota(Mascota mascota) throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			Main proveedor = new Main();
			conn = proveedor.getConnection();
			String sql = "INSERT INTO MASCOTAS VALUES (?, ?)";
			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, mascota.getCodigo());
			stmt.setString(2, mascota.getNombre());

			
			stmt.execute();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}

	}
	
	public void actualizarMascota(Mascota mascota) throws SQLException {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			Main proveedor = new Main();
			conn = proveedor.getConnection();
			String sql = "UPDATE MASCOTAS SET = ? WHERE CODIGO = ?";
			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, mascota.getCodigo());
			stmt.setString(2, mascota.getNombre());
		}finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
}
