package ArraysUtils;

public class ArrayUtils {

	public static void imprimirArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void obtenerPalabra(String[] array , int x) {
		if ( x <= array.length-1) {
			System.out.println(array[x]);
		}else if ( x >= array.length){
			System.out.println("Nada");
		}
	}
	
	public static int buscarPalabra(String[] array, String palabra) {
		for ( int i = 0; i < array.length; i++) {
			if ( array[i].equals(palabra)) {
				return i;
			}else {
				return -1;
			}
		}
		return -1;
	}
	
	
	
	
}
