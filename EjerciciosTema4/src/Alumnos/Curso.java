package Alumnos;

public class Curso {
	
	//Atributos
	
	private int idenntificador;
	private String descripcion;
	
	
	
	//Constructores
	
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
	
	//Metodos
	@Override
	public String toString() {
		return "Curso [idenntificador=" + idenntificador + ", descripcion=" + descripcion + "]";
	}
	
	
	
	

}
