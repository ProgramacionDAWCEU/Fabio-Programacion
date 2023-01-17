package pruebas;

public class Mascotas {

	// Atributos
	private String numeroSerie;
	private String color;
	private String dniDueño;
	private Integer edad;
	private Boolean vivo;

	// Constructores
	public Mascotas() {
		edad = 0;
		vivo = true;
	}
	
	public Mascotas(String dniDueño) {
		edad = 0;
		vivo = true;
		this.dniDueño = dniDueño;
	}

	// Métodos
	public void cambiarDueño(String nuevoDni) {
		dniDueño = nuevoDni;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String nuevoColor) {
		nuevoColor = color;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getDniDueño() {
		return dniDueño;
	}

	public void setDniDueño(String dniDueño) {
		this.dniDueño = dniDueño;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Boolean getVivo() {
		return vivo;
	}

	public void setVivo(Boolean vivo) {
		this.vivo = vivo;
	}

}
