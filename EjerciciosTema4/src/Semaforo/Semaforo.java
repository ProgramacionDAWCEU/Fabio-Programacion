package Semaforo;

public class Semaforo {
	private colores color;
	private Boolean parpadeo;
	private enum colores{ROJO , VERDE , AMBAR}
	
	public Semaforo() {
		color = colores.ROJO;
	};
	
	
	
}
