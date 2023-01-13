package Numeros;

public class Numeros {
	
	public static void sumarNumeros(int inicial , int N) {
		//Sumar numeros
		Integer suma = 0;
		for ( int i = N; i > inicial; i--) {
			
			suma = suma + i + (i-1);
		}
		System.out.println(suma);
	}

}
