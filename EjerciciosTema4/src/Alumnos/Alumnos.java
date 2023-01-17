package Alumnos;

public class Alumnos {
	
	 private Integer dni;
	 private String nombre;
	 private Integer edad;
	 private Integer nota;
	 
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	//aprobar
	
	
	public Integer aprobar() {
		return nota = 5;
	}
	
	//constructor dni
	
	public Alumnos(int dni) {
		this.dni = dni;
	}
	
	public Alumnos() {
		
	}
	
	
	

	
	
	 
	 

}
