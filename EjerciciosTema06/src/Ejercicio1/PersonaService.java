package Ejercicio1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import programa.Main;

public class PersonaService {

	public Persona consultarPersonas(String dni) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Main proveedor = new Main();
			conn = proveedor.getConnection();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM PERSONAS WHERE DNI = " + dni;
			rs = stmt.executeQuery(sql);

			Persona persona = new Persona();
			if (rs.next()) {
				String apellido = rs.getString("apellidos");
				String nombre = rs.getString("nombre");
				String dni1 = rs.getString("dni");
				Date date = rs.getDate("fecha_nacimiento");
				LocalDate fecha = date.toLocalDate();

				persona.setNombre(nombre);
				persona.setApellidos(apellido);
				persona.setFecha_nacimiento(fecha);
				persona.setDni(dni1);
				return persona;
			} else {
				return null;
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

	public List<Persona> buscarPersonas(String filtro) throws SQLException {
		List<Persona> lista = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Main proveedor = new Main();
			conn = proveedor.getConnection();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%" + filtro + "%' OR APELLIDOS LIKE '%" + filtro
					+ "%'";
			rs = stmt.executeQuery(sql);

			
			while (rs.next()) {
				Persona persona = new Persona();
				String apellido = rs.getString("apellidos");
				String nombre = rs.getString("nombre");
				String dni1 = rs.getString("dni");
				Date date = rs.getDate("fecha_nacimiento");
				LocalDate fecha = date.toLocalDate();

				persona.setNombre(nombre);
				persona.setApellidos(apellido);
				persona.setFecha_nacimiento(fecha);
				persona.setDni(dni1);
				lista.add(persona);

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

	public void insertarPersona(Persona persona) throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Main proveedor = new Main();
			conn = proveedor.getConnection();

			String sql = "INSERT INTO PERSONAS VALUES (?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, persona.getDni());
			stmt.setString(2, persona.getNombre());
			stmt.setString(3, persona.getApellidos());
			stmt.setDate(4, Date.valueOf(persona.getFecha_nacimiento()));

			stmt.execute();
		} catch (DateTimeException e) {
			System.err.println(e.getMessage());
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public void borrarPersona(Persona persona) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			Main proveedor = new Main();
			conn = proveedor.getConnection();

			String sql = "DELETE FROM PERSONAS WHERE DNI = (?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, persona.getDni());
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

	public void actualizarPersona(Persona persona, String dni) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			Main proveedor = new Main();
			conn = proveedor.getConnection();

			String sql = "UPDATE PERSONAS SET NOMBRE = (?) , APELLIDOS = (?) , FECHA_NACIMIENTO = (?) , DNI = (?) WHERE DNI = (?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, persona.getNombre());
			stmt.setString(2, persona.getApellidos());
			stmt.setDate(3, Date.valueOf(persona.getFecha_nacimiento()));
			stmt.setString(4, persona.getDni());
			stmt.setString(5, persona.getDni());
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
}
