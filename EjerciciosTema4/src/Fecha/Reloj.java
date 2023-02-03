package Fecha;

public class Reloj {
	private Integer Horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean Formato24Horas;
	
	
	public Reloj() {
		Horas = 00;
		minutos = 00;
		segundos = 00;
		Formato24Horas = true;
	}


	public Reloj(Integer horas, Integer minutos, Integer segundos, Boolean formato24Horas) {
		Horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		Formato24Horas = true;
	}
	
	public void ponerEnHora(Integer horas, Integer minutos) {
		this.Horas = horas;
		this.minutos = minutos;
	}
	
	
	public void ponerEnHora(Integer horas, Integer minutos, Integer segundos) {
		this.Horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	


	public Integer getHoras() {
		return Horas;
	}


	public Integer getMinutos() {
		return minutos;
	}


	public Integer getSegundos() {
		return segundos;
	}


	public Boolean getFormato24Horas() {
		return Formato24Horas;
	}


	public void setFormato24Horas(Boolean formato24Horas) {
		Formato24Horas = formato24Horas;
	}
	
	public Boolean check() {
		if(Horas < 0 || Horas > 24) {
			return false;
		}else if ( minutos < 0 || minutos > 59) {
			return false;
		}else if ( segundos < 0 || segundos > 59) {
			return false;
		}else {
			return true;
		}
	}


	@Override
	public String toString() {
		if (Formato24Horas == true) {
			if (Horas > 12 && minutos > 12) {
				return "Reloj [Horas=" + (Horas-12) + ", minutos=" + minutos + ", segundos=" + segundos + "]";
			}else if ( segundos == null) {
				return "Reloj [Horas=" + Horas + ", minutos=" + minutos + "]";
			}
			return "Reloj [Horas=" + Horas + ", minutos=" + minutos + ", segundos=" + segundos + "]";
		}else {
			return "Reloj [Horas=" + (Horas -12) + ", minutos=" + minutos + ", segundos=" + segundos + "]";
		}
	}
	
	
	
	
}
