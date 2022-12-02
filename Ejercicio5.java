package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime cuantos numeros me vas a decir");
		Integer num = scanner.nextInt();
		Integer listanumero[] = new Integer[num];
		Integer menor = 99999;
		Integer pos_menor = 0;
		Integer mayor = 0;
		Integer pos_mayor = 0;
		Double media = 0.0;
		for (int i = 0; i < listanumero.length; i++) {
			System.out.println("Dime un numero");
			listanumero[i] = scanner.nextInt();
			media = media + listanumero[i];

			if (listanumero[i] < menor) {
				menor = listanumero[i];
				pos_menor = i;
			} else if (listanumero[i] > mayor) {
				mayor = listanumero[i];
				pos_mayor = i;
			}

		}

		for (int i = 0; i < listanumero.length; i++) {
			System.out.print(listanumero[i] + " ");
		}
		System.out.println(
				"El numero mas grande es " + mayor + " su posicion es " + pos_mayor + " el numero mas pequeño es "
						+ menor + " su posicion es " + pos_menor + " la media es " + media / num);
		scanner.close();

	}

}
