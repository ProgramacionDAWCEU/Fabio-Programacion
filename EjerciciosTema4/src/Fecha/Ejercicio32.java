package Fecha;

public class Ejercicio32 {

	public static void main(String[] args) {
		Reloj reloj = new Reloj();
		
		Integer horas = 22;
		Integer minutos = 22 ;
		Integer segundos = 22;
		
		reloj.setFormato24Horas(true);
		reloj.ponerEnHora(horas, minutos, segundos);
		System.out.println(reloj.toString());
		System.out.println(reloj.check());
		
		reloj.setFormato24Horas(false);
		reloj.ponerEnHora(24, 17);
		System.out.println(reloj.toString());
		
	}

}
