package EjercicioAvanzado2;

import java.time.LocalDate;

public class Biblioteca {

	private Integer codigo;
	private String autor;
	private String titulo;
	private LocalDate anio;
	
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalDate getAnio() {
		return anio;
	}
	public void setAnio(LocalDate anio) {
		this.anio = anio;
	}
	
	
	
}
