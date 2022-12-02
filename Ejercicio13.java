package EjerciciosTema3;

public class Ejercicio13 {

	public static void main(String[] args) {
		Integer tabla[][] = new Integer[10][10];
		Integer multiplicacion;
		int c = 0;
		int a = 1;
		for (int x = 0; x < tabla.length; x++) {
			c++;
			for (int y = 0; y < tabla.length; y++) {
				multiplicacion = c * a;
				tabla[x][y] = multiplicacion;
				a++;
				if (a > 10) {
					a = 1;
				}

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
