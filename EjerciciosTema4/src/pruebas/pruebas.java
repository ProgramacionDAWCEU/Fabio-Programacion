package pruebas;

public class pruebas {

	public static void main(String[] args) {
		
		//Recursividad
		
		System.out.println(recursividad(5));

	}

	public static int recursividad(int n) {
		if ( n == 0) {
			return 1;
		}else {
			return n * recursividad(n-1);
		}
	}
}
