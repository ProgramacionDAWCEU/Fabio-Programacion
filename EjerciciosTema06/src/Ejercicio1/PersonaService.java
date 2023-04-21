package Ejercicio1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

			Persona persona = new Persona();
			while (rs.next()) {
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

}
