package EjerciciosTema3;

public class Ejercicio11 {

	public static void main(String[] args) {
		Integer numeros[][] = new Integer[10][5];
		Integer cont = 1;
		for (int i = 0; i < numeros.length - 5; i++) {
			for (int j = 0; j < numeros.length; j++) {
				numeros[j][i] = cont;
				cont++;
			}

		}

		for (int i = 0; i < numeros.length - 5; i++) {
			System.out.println();
			for (int j = 0; j < numeros.length; j++) {
				System.out.print(numeros[j][i] + " \t");
			}
		}

	}

}
