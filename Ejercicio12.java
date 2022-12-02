package EjerciciosTema3;

public class Ejercicio12 {

	public static void main(String[] args) {
		Integer tabla[][] = new Integer[10][10];
		Integer multiplicacion;
		for (int x = 0; x < tabla.length; x++) {
			for (int y = 0; y < tabla.length; y++) {
				multiplicacion = x * y;
				tabla[x][y] = multiplicacion;
			}
		}

		for (int i = 0; i < tabla.length; i++) {
			System.out.println();
			for (int j = 0; j < tabla.length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
		}

	}

}
