package services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Conexion.Proveedor;

import modelo.Agenda;



public class AgendaService {

	public void insertarNuevo(Agenda agenda) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Proveedor p = new Proveedor();
			conn = Proveedor.getConnection();
			conn.setAutoCommit(false);
			String sql = "INSERT INTO AGENDA VALUES (?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, agenda.getConcepto());
			stmt.setString(2, agenda.getTipo());
			stmt.setDate(3, Date.valueOf(agenda.getFecha()));
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

	public List<Agenda> consultar(LocalDate filtro) throws SQLException {
		List<Agenda> lista = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Proveedor proveedor = new Proveedor();
			conn = Proveedor.getConnection();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM AGENDA WHERE FECHA LIKE '%" + filtro + "%'";
			rs = stmt.executeQuery(sql);

			
			while (rs.next()) {
				Agenda a = new Agenda();
				String concepto = rs.getString("concepto");
				String tipo = rs.getString("tipo");
				Date date = rs.getDate("fecha");
				LocalDate fecha = date.toLocalDate();

				a.setConcepto(concepto);
				a.setTipo(tipo);
				a.setFecha(fecha);
				lista.add(a);

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
	
	
	public List<Agenda> mostrarTodo() throws SQLException{
		List<Agenda> lista = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Proveedor proveedor = new Proveedor();
			conn = Proveedor.getConnection();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM AGENDA";
			rs = stmt.executeQuery(sql);

			
			while (rs.next()) {
				Agenda a = new Agenda();
				String concepto = rs.getString("concepto");
				String tipo = rs.getString("tipo");
				Date date = rs.getDate("fecha");
				LocalDate fecha = date.toLocalDate();

				a.setConcepto(concepto);
				a.setTipo(tipo);
				a.setFecha(fecha);
				lista.add(a);

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
