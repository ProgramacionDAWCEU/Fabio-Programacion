package programa;

import java.sql.SQLException;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		MascotasService service = new MascotasService();
		List<Mascota> lista;
		
		try {
			Mascota m = new Mascota();
			m.setNombre("gafas1");
			m.setCodigo("4");
			service.insertarMascota(m);
			
			lista = service.consultarMascotas();
			System.out.println("Estas son las mascotas que hay");
			for (Mascota mascota : lista) {
				System.out.println(mascota);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
