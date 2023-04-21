package Ejercicio1;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws SQLException {
		// Se añade filtro del ejercicio 2.

		Scanner sc = new Scanner(System.in);
		PersonaService service = new PersonaService();
		Persona p = new Persona();
		String dni = "789";
		String filtro = "";

		p = service.consultarPersonas(dni);
		System.out.println("Esta es la persona con el dni indicado");
		System.out.println(p.toString());

		System.out.println("Indique filtro");
		filtro = sc.nextLine();
		List<Persona> lista = service.buscarPersonas(filtro);
		for (Persona persona : lista) {
			System.out.println(persona);
		}

		System.out.println(p.toString());
	}

}
