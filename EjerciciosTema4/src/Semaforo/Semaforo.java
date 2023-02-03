package Semaforo;

public class Semaforo {
	private colores color;
	private Boolean parpadeo;
	public static enum colores{ROJO , VERDE , AMBAR}
	
	public Semaforo() {
		color = colores.ROJO;
		parpadeo = false;
	}

	public colores getColor() {
		return color;
	}

	public void setColor(colores color) {
		if (color == colores.AMBAR || color == colores.ROJO || color == colores.VERDE){
			System.out.println("Color " + color);
			this.color = color;
		}else {
			System.out.println("Color no valido");
		}
		}
	

	public Boolean getParpadeo() {
		return parpadeo;
	}

	public void setParpadeo(Boolean parpadeo) {
		if (!color.equals(colores.AMBAR)) {
			this.parpadeo = false;
		}else if ( color.equals(colores.AMBAR)) {
			this.parpadeo = parpadeo;
		}
	}
	
	public void cambiarEstado() {
		if ( color.equals(colores.VERDE)) {
			parpadeo = true;
			color = colores.AMBAR;
		}else if ( color.equals(colores.AMBAR) && parpadeo) {
			color = colores.AMBAR;
			parpadeo = false;
		}else if ( color.equals(colores.AMBAR) && !parpadeo) {
			color = colores.ROJO;
		}else if ( color.equals(colores.ROJO)) {
			color = colores.VERDE;
		}
	}

	@Override
	public String toString() {
		if ( parpadeo == true) {
			return "Semaforo en ambar parpadeando";
		}else {
			return "Semaforo [color=" + color +"]";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
