package programas;

public class Ejercicio2 {

	public static void main(String[] args) {

		String cadena = getMinusculas("   HOLA QUE TAL    ");

		System.out.println(cadena);
	}

	public static String getMinusculas(String cadena) {
		cadena = cadena.toLowerCase().trim();
		return cadena;
	}

}
