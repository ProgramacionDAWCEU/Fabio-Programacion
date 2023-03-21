package examen;

import java.time.LocalDate;

public class Pasajero {

	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	
	
	public Pasajero() {
		
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
		
	public Boolean isTerceraEdad(Integer edad) {
		if ( edad >= 65 ) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public String toString() {
		return dni + " - " + nombre + " - " + fechaNacimiento;
	}
	
	
	
	
	
}
