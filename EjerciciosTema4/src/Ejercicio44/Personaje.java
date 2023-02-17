package Ejercicio44;

public abstract class Personaje {

	protected Integer vida;
	protected Integer ataque;
	protected Integer tiempoAtaque;
	protected String codigo;

	public Personaje() {

	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getTiempoAtaque() {
		return tiempoAtaque;
	}

	public void setTiempoAtaque(Integer tiempoAtaque) {
		this.tiempoAtaque = tiempoAtaque;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	

}
