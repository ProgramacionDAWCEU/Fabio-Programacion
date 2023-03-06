package Hucha;

import java.math.BigDecimal;

public class Hucha {
	
	private BigDecimal dinero;
	
	public Hucha(BigDecimal dinero) {
		
	}
	
	public BigDecimal meterDinero(BigDecimal meter) {
		BigDecimal total = dinero.add(meter); 
		return total;
	}
	
	public BigDecimal sacarDinero(BigDecimal dinero, BigDecimal sacar) {
		BigDecimal total = dinero.subtract(sacar);
		return total;
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
