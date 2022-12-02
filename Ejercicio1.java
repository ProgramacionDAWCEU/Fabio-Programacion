package EjerciciosTema3;

public class Ejercicio1 {

	public static void main(String[] args) {

		Integer numeros[] = new Integer[15];
		Integer x = 2;
		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = x;
			x += 2;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
