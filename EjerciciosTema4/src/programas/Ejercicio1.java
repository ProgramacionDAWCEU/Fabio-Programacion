package programas;

public class Ejercicio1 {

	public static void main(String[] args) {
		String cadena = getMayusculas(" Hola que tal ");

		System.out.println(cadena);
	}

	public static String getMayusculas(String cadena) {
		cadena = cadena.toUpperCase().trim();
		return cadena;
	}

}
