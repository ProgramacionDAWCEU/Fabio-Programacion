package Ejercicio6_7;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) throws ParametroIncorrectoException, ListaVaciaExecption {
		Scanner sc = new Scanner(System.in);
		Sociedad s = new Sociedad();

		String x = "";

		while (!x.equalsIgnoreCase("FIN")) {
			try {
				System.out.println("Introduzca genero");
				String genero = sc.nextLine();
				System.out.println("Introduzca altura");
				BigDecimal altura = sc.nextBigDecimal();
				s.addPersona(genero, altura);
				sc.nextLine();
				System.out.println("Continuar?");
				x = sc.nextLine();
			} catch (ParametroIncorrectoException e) {
				System.out.println("Parametro incorrecto");
			}

			try {
				System.out.println("De quien quiere salber la altura media");
				String g = sc.nextLine();
				if (g.equalsIgnoreCase("H")) {
					System.out.println(s.calcularAlturaMediaHombres());
				} else if (g.equalsIgnoreCase("M")) {
					System.out.println(s.calcularAlturaMediaMujeres());
				}
			} catch (ListaVaciaExecption e) {
				System.out.println("Lista vacia");
			}

		}

		sc.close();

	}

}
