package examen;

public class Cercania extends Tren{
	
	private Integer plazaAdicional;
	
	public Cercania(String destino, Integer plazas) {
		super(destino, plazas);
		
	}

	
	public Integer getVelocidad() {
		Integer velocidad = 120;
		return velocidad;
	}
	
	public Integer getCapacidadTotal(Integer plazaAdicional) {
		plazas = plazas + plazaAdicional;
		return plazas;
	}
	
	public Integer getPlazasLibres(Integer capacidad, Integer plazasOcupadas) {
		Integer total = capacidad - plazasOcupadas;
		return total;
	}
	
	
	
}
