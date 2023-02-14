package Equipo;

public class Resultado {

	private Integer golesLocal;
	private Integer golesVisitante;

	public Resultado(Integer golesLocal, Integer golesVisitante) {
		super();
		this.golesLocal = 0;
		this.golesVisitante = 0;
	}

	public Integer getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(Integer golesLocal) {
		this.golesLocal = golesLocal;
	}

	public Integer getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(Integer golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public Boolean isVictoriaLocal() {
		return golesLocal > golesVisitante;
	}

	public Boolean isVictoriaVisitante() {
		return golesLocal < golesVisitante;
	}

	public Boolean isEmpate() {
		return golesLocal == golesVisitante;
	}

	@Override
	public String toString() {
		return "Resultado [golesLocal=" + golesLocal + ", golesVisitante=" + golesVisitante + "]";
	}

}
