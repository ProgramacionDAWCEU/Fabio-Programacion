package programas;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String cadena = "     Hola que tal       ";
		Integer num = 2;
		System.out.println(getMayMin(num, cadena));
		
	}

	public static String getMayMin(int i, String cadena) {
		if ( i == 1) {
			cadena = cadena.toUpperCase().trim();
		}else if ( i == 2) {
			cadena = cadena.toLowerCase().trim();
		}
		
		return cadena;
		
		
	}

}
