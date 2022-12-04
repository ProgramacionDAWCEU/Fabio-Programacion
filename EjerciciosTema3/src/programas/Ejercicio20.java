package programas;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String palabras[] = new String[10];
		palabras[0] = "azulejo";
		palabras[1] = "tenedor";
		palabras[2] = "saltamontes";
		palabras[3] = "carretilla";
		palabras[4] = "molinero";
		palabras[5] = "sofisticado";
		palabras[6] = "terremoto";
		palabras[7] = "culinario";
		palabras[8] = "teclado";
		palabras[9] = "primavera";
		
		int randomNum = (int)(Math.random() * 10);
		
		String palabra_user = palabras[randomNum];
		String user[] = palabra_user.split("");
		String acertadas[] = new String[user.length];
		for ( int i = 0; i < acertadas.length; i++) {
			acertadas[i] = " _ ";
		}
		
		int aciertos = 0;
		int fallos = 0;
		int posicion = 0;
		int fallos_turno  = 0;
		
		System.out.println(palabra_user);
		
		do {
			
			System.out.println("Escriba letra");
			String letra = scanner.nextLine();
			
			for ( int i = 0; i < user.length; i++) {
				if ( letra.equals(user[i])) {
					acertadas[i] = letra;
					
				}
				
			}
			
			for ( int j = 0; j < acertadas.length; j++) {
				System.out.print(acertadas[j]);
			}
			
		} while (fallos < 5);
		
		
		
		
		
	}

}
