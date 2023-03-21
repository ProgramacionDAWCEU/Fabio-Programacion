package examen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String compañia;
		do {
			System.out.println("Indique la compañia");
			compañia = sc.nextLine();
		} while (compañia.isEmpty());

		Avion avion = new Avion(null, null, compañia);
		Asiento a1 = new Asiento(15, "A");
		a1.setOcupado(false);
		a1.setTipoAsiento(true);

		Asiento a2 = new Asiento(15, "B");
		a2.setTipoAsiento(true);

		Asiento a3 = new Asiento(1, "A");
		a3.setTipoAsiento(false);

		List<Asiento> lista = new ArrayList<>();
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);

//		
//		List<Asiento> lista = new ArrayList<>();
//		lista.add(a1);

		System.out.println("Precio base");
		Integer precioBase = sc.nextInt();
		BigDecimal precio = new BigDecimal(precioBase);
		avion.establecerPrecioBaseAsiento(precio); // precio base
		System.out.println(avion.toString());
		System.out.println(avion.getAntiguedad());
		System.out.println(avion.getPrecioMedioVenta(precio, true));

	}

	public static void establecerCompañia() {
		Scanner sc1 = new Scanner(System.in);
		String compañia;
		do {
			System.out.println("Indique la compañia");
			compañia = sc1.nextLine();
		} while (compañia.isEmpty());
	}

	public static void precioBase() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Precio base del asiento");
	}

}
