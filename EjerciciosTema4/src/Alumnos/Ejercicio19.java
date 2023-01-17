package Alumnos;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		
		Alumnos alumno = new Alumnos();
		
		alumno.setNota(alumno.aprobar());
		System.out.println(alumno.getNota());

	}

}
