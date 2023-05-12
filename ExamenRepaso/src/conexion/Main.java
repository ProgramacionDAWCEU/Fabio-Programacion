package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	public Connection getConnection() throws SQLException {
		
		String urlConexion = "jdbc:mariadb://localhost:3306/programacion";
		String claseDriver ="org.mariadb.jdbc.Driver";
		String usuario = "programacion";
		String contraseña = "programacion";
		
		try {
			Class.forName(claseDriver);
			return DriverManager.getConnection(urlConexion,usuario,contraseña);
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
			throw new SQLException("No se ha encontrado la clase driver",e);
		}
	}
}
