package Ejercicio1;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Se añade filtro del ejercicio 2.

		Scanner sc = new Scanner(System.in);
		PersonaService service = new PersonaService();
		Persona p = new Persona();
		String dni = "789";
		String filtro = "";

		try {

			p = service.consultarPersonas(dni);
			System.out.println("Esta es la persona con el dni indicado");
			System.out.println(p.toString());

			System.out.println("Indique filtro");
			filtro = sc.nextLine();
			System.out.println(service.buscarPersonas(filtro));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
