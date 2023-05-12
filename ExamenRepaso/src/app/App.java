package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import modelo.Libreria;
import modelo.Libro;

public class App {

	public static void main(String[] args) {
		
		solicitarLibreria();
		

	}

	public static Libreria solicitarLibreria() {
		Scanner sc = new Scanner(System.in);
		Libreria lb = new Libreria();
		Libro l = new Libro();

		lb.setNombre("Paginas desiertas");

		Map<String, Libro> mapa = new HashMap<>();

		String p = "";
		do {
			System.out.println("Ingrese ISBN");
			l.setISBN(sc.nextLine());
			System.out.println("Ingrese titulo del libro");
			l.setTitulo(sc.nextLine());
			System.out.println("Ingrese autor");
			l.setAutor(sc.nextLine());
			System.out.println("Ingrese precio");
			l.setPrecio(sc.nextBigDecimal());

			mapa.put(l.getISBN(), l);
		} while (!p.equalsIgnoreCase("FIN"));

		return lb;
	}

}
