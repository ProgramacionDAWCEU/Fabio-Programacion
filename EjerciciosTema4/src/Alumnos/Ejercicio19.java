package Alumnos;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		
		Alumno alumno = new Alumno();
		
		alumno.setNota(alumno.aprobar());
		System.out.println(alumno.getNota());

	}

}
