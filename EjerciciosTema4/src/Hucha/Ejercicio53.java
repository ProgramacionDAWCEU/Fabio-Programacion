package Hucha;

import java.math.BigDecimal;

public class Ejercicio53 {

	public static void main(String[] args) {
		
		
		
		BigDecimal dinero = new BigDecimal(10);
		BigDecimal meter = new BigDecimal(5);
		Hucha a = new Hucha(dinero);
		a.meterDinero(dinero, meter);
		System.out.println(a);
	}

}
