package Ejercicio1;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws SQLException {

		Integer y = menu();
		if (y == 1) {
			consultarPersona();
		} else if (y == 2) {
			aplicarFiltro();
		} else if (y == 3) {
			insertarPersona();
		} else if (y == 4) {
			borrarPersona();
		} else if (y == 5) {
			actualizarPersona();
		}

	}

	public static Integer menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Consultar persona");
		System.out.println("Aplicar filtro");
		System.out.println("Insertar persona");
		System.out.println("Borrar persona");
		System.out.println("Actualizar persona");
		Integer x = sc.nextInt();
		return x;
	}

	public static void consultarPersona() throws SQLException {
		PersonaService service = new PersonaService();
		Persona p = new Persona();

		String dni = "789";
		p = service.consultarPersonas(dni);
		System.out.println("Esta es la persona con el dni indicado");
		System.out.println(p.toString());
	}

	public static void aplicarFiltro() throws SQLException {
		Scanner sc = new Scanner(System.in);
		PersonaService service = new PersonaService();
		Persona p = new Persona();

		String filtro = "";
		System.out.println("Indique filtro");
		filtro = sc.nextLine();
		List<Persona> lista = service.buscarPersonas(filtro);
		for (Persona persona : lista) {
			System.out.println(persona);
		}

		System.out.println(p.toString());
	}

	public static void insertarPersona() throws SQLException {
		Scanner sc = new Scanner(System.in);
		PersonaService service = new PersonaService();
		Persona p = new Persona();

		System.out.println("Indique nombre de la persona");
		p.setNombre(sc.nextLine());
		System.out.println("Indique nombre de la persona");
		p.setApellidos(sc.nextLine());
		System.out.println("Indique dni");
		p.setDni(sc.nextLine());
		p.setFecha_nacimiento(LocalDate.now());
		service.insertarPersona(p);
	}

	public static void borrarPersona() throws SQLException {
		Scanner sc = new Scanner(System.in);
		PersonaService service = new PersonaService();
		Persona p = new Persona();

		System.out.println("Indique el dni de la persona a borrar");
		p.setDni(sc.nextLine());
		service.borrarPersona(p);
		System.out.println("Usuario borrado con exito");

	}

	public static void actualizarPersona() throws SQLException {
		Scanner sc = new Scanner(System.in);
		PersonaService service = new PersonaService();
		Persona p = new Persona();

		System.out.println("Dni de persona a actualizar");
		String dni = sc.nextLine();
		System.out.println("Ingrese nuevo nombre");
		p.setNombre(sc.nextLine());
		System.out.println("Ingrese nuevo apellido");
		p.setApellidos(sc.nextLine());
		p.setFecha_nacimiento(LocalDate.now());
		System.out.println("Ingrese nuevo dni");
		p.setDni(sc.nextLine());
		service.actualizarPersona(p, dni);
	}

}
