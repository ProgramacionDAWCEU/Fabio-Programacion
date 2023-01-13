package Numeros;

public class Numeros {
	
	public static int sumarNumeros(int N) {
		
		if (N==0) {
			return 0;
		}else {
			return N + factorial(N-1);
		}
	}
	
	public static int factorial(int N) {
		//Calcular factorial con recursividad
		if ( N== 0) {
			return 1;
		}else {
			return N * factorial(N-1);
		}
	}

}
