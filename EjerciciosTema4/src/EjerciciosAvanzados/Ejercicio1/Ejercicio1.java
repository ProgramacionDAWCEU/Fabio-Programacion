package EjerciciosAvanzados.Ejercicio1;

import java.math.BigDecimal;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		BigDecimal x = new BigDecimal(31321231);
		BigDecimal y = new BigDecimal(78887);
		String direccion = "xxxxxx";
		Movil movil = new Movil(x,y);
		Fijo fijo = new Fijo(direccion,988769);
		Telefono t = new Telefono();
		t.marcar(5454456);
		
		

	}

}
