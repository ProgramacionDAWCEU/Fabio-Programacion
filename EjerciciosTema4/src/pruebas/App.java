package pruebas;


public class App {
	
	public static void main(String[] args) {
		String dni = "354354654D";
		
		Mascotas miGato = new Mascotas();
		miGato.setColor("rojo");
		miGato.setEdad(3);
		miGato.setDniDueño(dni);
		System.out.println("Mi gato pertenece a " + miGato.getDniDueño());
		miGato.cambiarDueño("000000000X");
		System.out.println("Mi gato pertenece a " + miGato.getDniDueño());
		
		Mascotas miPerro = new Mascotas(dni);
		miPerro.setColor("verde");
		miPerro.setEdad(2);
		miPerro.setDniDueño(dni);
		System.out.println("Mi perro pertenece a " + miPerro.getDniDueño());
	}
}
