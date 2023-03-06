package pruebas;

public class Hucha_Prueba {

	private Integer dinero;
	
	public Hucha_Prueba(Integer dinero) {
		this.dinero = dinero;
	}
	
	public void meterDinero(Integer meter) {
		Integer total = dinero + meter;
		dinero = total;
	}
	
	public void sacarDinero(Integer sacar) {
		Integer total = dinero - sacar;
		dinero = total;
	}
	
	@Override
	public String toString() {
		return "Hucha_Prueba [dinero=" + dinero + "]";
	}
	
	
}
