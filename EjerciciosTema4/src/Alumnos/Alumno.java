package Alumnos;

import java.util.Objects;

public class Alumno extends Persona{
	
	//Atributos
	 private String dni;
	 private Integer nota;
	 private Curso c;
	 
	 
	 //Constructures
	public Alumno(String dni) {
		this.dni = dni;
	}
	
	public Alumno() {
		
	}
	public String getDni() {
		return dni.toUpperCase();
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	//Metodos
	
	@Override
	public String toString() {
		return "Alumnos [dni=" + dni + ", nombre=" + getNombre() + ", edad=" + getEdad() + ", nota=" + nota + "]";
	}
	public Integer aprobar() {
		
		return 5;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return dni == other.dni;
	}
	
	
	
	 
	
	 
	 

}
