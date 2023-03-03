package aaa;

import java.util.List;

public class Persona {
	 private String nombre;
	    private String apellido;
	    private int edad;

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	}

	class Estudiante extends Persona {
	    private int matricula;
	    private Curso curso;

	    public int getMatricula() {
	        return matricula;
	    }

	    public void setMatricula(int matricula) {
	        this.matricula = matricula;
	    }

	    public Curso getCurso() {
	        return curso;
	    }

	    public void setCurso(Curso curso) {
	        this.curso = curso;
	    }
	}

	class Curso {
	    private String nombre;
	    private List<Estudiante> estudiantes;

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public List<Estudiante> getEstudiantes() {
	        return estudiantes;
	    }

	    public void setEstudiantes(List<Estudiante> estudiantes) {
	        this.estudiantes = estudiantes;
	    }
	}

	class Profesor extends Persona {
	    private List<Curso> cursos;

	    public List<Curso> getCursos() {
	        return cursos;
	    }

	    public void setCursos(List<Curso> cursos) {
	        this.cursos = cursos;
	    }
	}

	class Universidad {
	    private List<Profesor> profesores;
	    private List<Curso> cursos;

	    public List<Profesor> getProfesores() {
	        return profesores;
	    }

	    public void setProfesores(List<Profesor> profesores) {
	        this.profesores = profesores;
	    }

	    public List<Curso> getCursos() {
	        return cursos;
	    }

	    public void setCursos(List<Curso> cursos) {
	        this.cursos = cursos;
	    }
}
