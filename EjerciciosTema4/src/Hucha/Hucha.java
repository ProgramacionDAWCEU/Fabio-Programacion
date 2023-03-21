package Hucha;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Hucha {
	
	private BigDecimal dinero;
	
	public Hucha(BigDecimal dinero) {
		dinero = BigDecimal.ZERO;
	}
	
	public BigDecimal meterDinero(BigDecimal meter) {
		dinero = dinero.add(meter).setScale(2, RoundingMode.HALF_UP);
		return dinero;
	}
	
	public BigDecimal sacarDinero(BigDecimal sacar) {
		if(sacar.compareTo(dinero) > 0 ) {
			BigDecimal cantidad = dinero;
			dinero = BigDecimal.ZERO;
			return cantidad;
		}
		dinero = dinero.subtract(sacar).setScale(2, RoundingMode.HALF_UP);
		return dinero;
	}
	
	public BigDecimal contarDinero(BigDecimal dinero) {
		return dinero;
	}
	
	public BigDecimal romperHucha(BigDecimal dinero, BigDecimal total) {
		total = new BigDecimal(0);
		return dinero;
	}

	@Override
	public String toString() {
		return "Hucha [dinero=" + dinero + "]";
	}
	
	
	
}
