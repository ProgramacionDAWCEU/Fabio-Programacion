package Alumnos;

public class Ejercicio29 {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		Curso curso = new Curso("1",1);
		String nombre = "hjkasdkjahjdgjhasd";
		String dni = "000000000";
		Integer edad = 18;
		
		alumno.setNombre(nombre);
		alumno.setDni(dni);
		alumno.setEdad(edad);
		curso.setDescripcion("1");
		curso.setIdenntificador(1);
		alumno.setC(curso);
		
		System.out.println(alumno.getC());
		System.out.println(alumno.validarTodo());

	}

}
