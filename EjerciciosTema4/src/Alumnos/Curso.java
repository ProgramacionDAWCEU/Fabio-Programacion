package Alumnos;

import java.util.Arrays;
import java.util.List;

public class Curso {

	// Atributos

	private int idenntificador;
	private String descripcion;
	private Alumno alumnos[];
	private Integer contador;
	private Curso curso;
	private List<Alumno> alumnos1;

	// Constructores

	
	public Curso(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public Curso(int idenntificador, String descripcion, Integer numal) {
		super();
		this.contador = 0;
		this.idenntificador = idenntificador;
		this.descripcion = descripcion;
		alumnos = new Alumno[numal];
	}

	
	//Métodos
	public int getIdenntificador() {
		return idenntificador;
	}

	public void setIdenntificador(int idenntificador) {
		this.idenntificador = idenntificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}
	
	
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	
	public void addAlumno(Alumno alumno) {
			if (contador >= 0 && contador < 3) {
				for(; contador < alumnos.length;) {
					alumnos[contador] = alumno;
					contador++;
					break;
				}
			}
	}
//		   if (contador >= 0 && contador < 3) {
//			
//			
//			            for (; contador < alumnos.length;) {
//				 alumnos[contador] = alumno;
//					                contador++;
//					                break;
//			}
//				
//			}
	
	

	@Override
	public String toString() {
		return "Curso [idenntificador=" + idenntificador + ", descripcion=" + descripcion + ", alumnos="
				+ Arrays.toString(alumnos) + "]";
	}
	
	
	
	

}
