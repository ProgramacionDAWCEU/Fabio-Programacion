package EjerciciosAvanzados.Ejercicio1;

public class Telefono {

	protected Integer numero;
	protected Boolean enLlamada;
	
	public Telefono() {
		
	}
	
	public Integer connsultarNumero() {
		return numero;
	}
	
	public void marcar(Integer numero) {
		System.out.println("LLAMANDO A " + numero);
		
		if (numero.equals(numero)) {
			System.out.println("EN COMUNICACION");
		}else {
			System.out.println("EN COMUNICACION");
			enLlamada = true;
		}
	}
	
	public void colgar() {
		if (enLlamada==true) {
			System.out.println("COMUNICACION TERMINADA");
			enLlamada = false;
		}else {
			
		}
	}
	
}
