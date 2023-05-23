package app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.mariadb.jdbc.plugin.codec.LocalDateCodec;

import modelo.Agenda;
import services.AgendaException;
import services.AgendaService;

public class App {

	public static void main(String[] args) throws AgendaException {
		Scanner sc = new Scanner(System.in);
		AgendaService service = new AgendaService();

		Integer opcionElegida = 0;

		do {

			opcionElegida = menu(sc);

			if (opcionElegida == 1) {
				Agenda agenda = insertar(sc);
				service.insertarNuevo(agenda);
				System.out.println("Se ha insertado correctamente");

			} else if (opcionElegida == 2) {
				LocalDate fecha = consultar(sc);
				// List<Agenda> lista = consultar(sc);
				try {
					System.out.println(service.consultar(fecha));
				} catch (SQLException e) {

					e.printStackTrace();
				}

			} else if (opcionElegida == 3) {
				System.out.println(mostrarTodo());
			}

		} while (opcionElegida != 0);
	}

	public static Integer menu(Scanner sc) {
		Integer x;

		System.out.println("Insertar nuevo");
		System.out.println("Consultar por fecha");
		System.out.println("Mostrar todo");
		System.out.println("Salir");
		x = sc.nextInt();

		sc.nextLine();

		return x;

	}

	public static Agenda insertar(Scanner sc) {
		Agenda a = new Agenda();

		System.out.println("Ingrese fecha");
		String f = sc.nextLine();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha = LocalDate.parse(f, formato);
		a.setFecha(fecha);

		System.out.println("Inserte concepto");
		a.setConcepto(sc.nextLine());

		System.out.println("Ingrese tipo");
		a.setTipo(sc.nextLine());

		return a;
	}

	public static LocalDate consultar(Scanner sc) {
		Agenda a = new Agenda();

		String f;
		System.out.println("Indique fecha");
		f = sc.nextLine();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha = LocalDate.parse(f, formato);
		a.setFecha(fecha);

		return fecha;

	}

	public static List<Agenda> mostrarTodo() {
		AgendaService service = new AgendaService();
		Agenda a = new Agenda();

		List<Agenda> lista = new ArrayList<>();

		try {
			lista = service.mostrarTodo();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

}
