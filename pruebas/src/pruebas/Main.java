package pruebas;

public class Main {

	public static void main(String[] args) {
		
		//Pruebas del ejercicio 53 con Integer
		
		Integer dinero = 10;
		Hucha_Prueba a = new Hucha_Prueba(dinero);
		a.meterDinero(10);
		System.out.println(a.toString());
		a.sacarDinero(5);
		System.out.println(a.toString());
		
	}

}
