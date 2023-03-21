package examen;

public class Regional extends Tren{

	
	private Boolean electrico;
	
	
	public Regional(String destino, Integer plazas) {
		super(destino, plazas);
		
	}

	public Integer getVelocidad(Boolean electrico) {
		if(electrico == true) {
			Integer velocidad = 200;
			return velocidad;
		}else{
			Integer velocidad = 150;
			return velocidad;
		}
		
	}
	
	
	public Integer getCapacidadTotal() {
		return plazas;
	}
	
	public Integer getPlazasLibres(Integer capacidad, Integer plazasOcupadas) {
		Integer total = capacidad - plazasOcupadas;
		return total;
	}
}
