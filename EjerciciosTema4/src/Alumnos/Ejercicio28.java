package Alumnos;

public class Ejercicio28 {

	public static void main(String[] args) {
		
		Alumno alumno = new Alumno();
		
		String dni = "54437238X";
		
		alumno.setDni(dni);
		
		System.out.println(alumno.validar());

	}

}
