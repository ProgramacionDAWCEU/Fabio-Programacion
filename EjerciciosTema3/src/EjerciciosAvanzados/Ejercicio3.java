package EjerciciosAvanzados;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
static String[][] iniciarTablero(String tablero[][]) {
		
		//Imprimimos el tablero
		
		for ( int i = 0; i < tablero.length; i++) {
			for ( int j = 0; j < tablero.length; j++) {
				tablero[i][j] = "*";
			}
		}
		
		return tablero;
	}
	
	static String[][] ubicacionMinas() {
				//Ubicamos las minas
		
				Random rand = new Random();
				
				//Hay que calcular unas coordenadas aleatorias para ubicar las minas
				
				String ubicacion[][] = new String[10][10];
				
				for ( int i = 0; i < 5; i++) {
					
					int x = rand.nextInt(10);
					int y = rand.nextInt(10);
					ubicacion[x][y] = "M";
				}
				
				return ubicacion;
				
	}
	
	static void tableroActualizado(String tablero[][] , int fila , int columna , int jugador) {
		
		if ( jugador == 0) { //Mostrar tablero inicial
			
			for ( int i = 0;  i < tablero.length; i++) {
				System.out.println();
				for ( int j = 0; j < tablero.length; j++) {
					tablero[i][j] = "*";
					System.out.print(tablero[i][j] + "\t");
				}
			}
			
			System.out.println();
			System.out.println("----------------------");
			
		} else if  ( jugador == 2) { //mostrar tablero actualizado
			
			for ( int x = 0; x < tablero.length; x++) {
				System.out.println();
				for ( int y = 0; y < tablero.length; y++) {
					tablero[fila][columna] = "O";
					System.out.print(tablero[x][y] + "\t");
				}
			}
			
		}
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer jugador = 0;
		String tablero[][] = new String[10][10];
		String minas [][]  = ubicacionMinas();
		tableroActualizado(tablero, 0, 0, 0);
		
		
		Integer estado_partida = 0; // Si pasa a ser 1 la partida termina
		int fila = 0;
		int columna = 0;
		do {
			System.out.println("Quiere despejar o marcar una mina (1/2)");
			jugador = scanner.nextInt();
			
			if ( jugador == 1) {
				
				//despejar
				
				System.out.println("fila");
				fila = scanner.nextInt();
				System.out.println("columna");
				columna = scanner.nextInt();
				
				if (minas[fila][columna] == "M") {
					System.out.println("Ha perdido");
					estado_partida++;
				}
				
			}else if ( jugador == 2) {
				////
				//Marcar mina y mostrar tablero actualizado
				
				System.out.println("fila");
				fila = scanner.nextInt();
				System.out.println("columna");
				columna = scanner.nextInt();
				tableroActualizado(tablero, fila, columna, jugador);
				
				
			}
			
		} while (estado_partida == 0);
		
		scanner.close()	;
		}
	
	

}

