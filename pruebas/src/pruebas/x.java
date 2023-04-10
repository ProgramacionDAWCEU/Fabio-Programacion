package pruebas;

import java.util.Scanner;

public class x {
	public static void main(String[] args) {
		Integer num1;
		Integer num2;
		Integer sumar;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime un numero");
		num1 = scanner.nextInt();
		System.out.println("Dime otro numero");
		num2 = scanner.nextInt();
		sumar = num1 + num2;

		sumar(num1, num2);

		scanner.close();

	}

	public static void sumar(Integer x, Integer y) {
		System.out.println(x + y);
	}
}
