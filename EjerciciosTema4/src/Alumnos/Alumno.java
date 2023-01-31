package Alumnos;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	
	public Curso getC() {
		return c;
	}

	public void setC(Curso c) {
		this.c = c;
	}
	
	
	//Metodos
	
	

	@Override
	public String toString() {
		return "Alumnos [dni=" + dni + ", nombre=" + getNombre() + ", edad=" + getEdad() + ", nota=" + nota + "]";
	}
	public Integer aprobar() {
		
		return 5;
	}
	
	public boolean validarDni() {
		if (dni  == null || dni.isEmpty() || dni.length() != 9) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public boolean validar() {
		String ejemploDni = dni;
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(ejemploDni);
		if(match.matches() && ejemploDni.length() == 9 && !ejemploDni.isEmpty()) {
		 return true;
		}
		else {
		 return false;
		} 
	}
	
	
	
	
	public boolean validarTodo() {
		if(nombre == null || nombre.length() < 10 || edad < 12 || edad > 65 || c == null){
			return false;
		}else {
			return true;
		}
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
