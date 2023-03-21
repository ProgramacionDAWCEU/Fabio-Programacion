package examen;

import java.time.LocalDate;

public class Alta extends Tren{

	public Alta(String destino, Integer plazas) {
		super(destino, plazas);
		
	}
	
	public Integer getVelocidad(LocalDate fecha) {
		LocalDate a = LocalDate.of(2010, 01, 30);
		if ( fecha.isAfter(a)) {
			Integer velocidad = 360;
			return velocidad;
		}else {
			Integer velocidad = 280;
			return velocidad;
		}
	}
	
	public Integer getCapacidadTotal() {
		return plazas;
	}
	
//	public Integer getPlazasLibres(Integer capacidad, Integer plazasOcupadas) {
//		Integer total = capacidad - plazasOcupadas;
//		return total;
//	}

}