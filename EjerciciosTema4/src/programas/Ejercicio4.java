package programas;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String cadena = "     Hola que tal       ";
		Integer num = 1;
		System.out.println(getMayMin(num,cadena));
		

	}

	public static String getMayMin(int i, String cadena) {
		if ( i == 1) {
			cadena = getMayusculas(cadena);
		}else if ( i == 2) {
			cadena = getMinusculas(cadena);
		}
		return cadena;
	}
	
	public static String getMayusculas(String cadena) {
		cadena = cadena.toUpperCase().trim();
		return cadena;
	}
	
	public static String getMinusculas(String cadena) {
		cadena = cadena.toLowerCase().trim();
		return cadena;
		
	}
	
	
	
	


}
