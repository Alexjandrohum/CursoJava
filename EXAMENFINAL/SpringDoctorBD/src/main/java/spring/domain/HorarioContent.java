package spring.domain;

public class HorarioContent {

	private String semana;
	private String diaLunes;
	private int inicioL;
	private int terminoL;
	private String diaMartes;
	private int inicioM;
	private int terminoM;
	private String diaMiercoles;
	private int inicioMie;
	private int terminoMie;
	private String diaJueves;
	private int inicioJ;
	private int terminoJ;
	private String diaviernes;
	private int inicioV;
	private int terminoV;

	public HorarioContent() {
		super();
	}

	public HorarioContent(String semana, String diaLunes, int inicioL, int terminoL, String diaMartes, int inicioM,
			int terminoM, String diaMiercoles, int inicioMie, int terminoMie, String diaJueves, int inicioJ,
			int terminoJ, String diaviernes, int inicioV, int terminoV) {
		super();
		this.semana = semana;
		this.diaLunes = diaLunes;
		this.inicioL = inicioL;
		this.terminoL = terminoL;
		this.diaMartes = diaMartes;
		this.inicioM = inicioM;
		this.terminoM = terminoM;
		this.diaMiercoles = diaMiercoles;
		this.inicioMie = inicioMie;
		this.terminoMie = terminoMie;
		this.diaJueves = diaJueves;
		this.inicioJ = inicioJ;
		this.terminoJ = terminoJ;
		this.diaviernes = diaviernes;
		this.inicioV = inicioV;
		this.terminoV = terminoV;
	}

	public String getSemana() {
		return semana;
	}

	public void setSemana(String semana) {
		this.semana = semana;
	}

	public String getDiaLunes() {
		return diaLunes;
	}

	public void setDiaLunes(String diaLunes) {
		this.diaLunes = diaLunes;
	}

	public int getInicioL() {
		return inicioL;
	}

	public void setInicioL(int inicioL) {
		this.inicioL = inicioL;
	}

	public int getTerminoL() {
		return terminoL;
	}

	public void setTerminoL(int terminoL) {
		this.terminoL = terminoL;
	}

	public String getDiaMartes() {
		return diaMartes;
	}

	public void setDiaMartes(String diaMartes) {
		this.diaMartes = diaMartes;
	}

	public int getInicioM() {
		return inicioM;
	}

	public void setInicioM(int inicioM) {
		this.inicioM = inicioM;
	}

	public int getTerminoM() {
		return terminoM;
	}

	public void setTerminoM(int termino) {
		this.terminoM = termino;
	}

	public String getDiaMiercoles() {
		return diaMiercoles;
	}

	public void setDiaMiercoles(String diaMiercoles) {
		this.diaMiercoles = diaMiercoles;
	}

	public int getInicioMie() {
		return inicioMie;
	}

	public void setInicioMie(int inicioMie) {
		this.inicioMie = inicioMie;
	}

	public int getTerminoMie() {
		return terminoMie;
	}

	public void setTerminoMie(int terminoMie) {
		this.terminoMie = terminoMie;
	}

	public String getDiaJueves() {
		return diaJueves;
	}

	public void setDiaJueves(String diaJueves) {
		this.diaJueves = diaJueves;
	}

	public int getInicioJ() {
		return inicioJ;
	}

	public void setInicioJ(int inicioJ) {
		this.inicioJ = inicioJ;
	}

	public int getTerminoJ() {
		return terminoJ;
	}

	public void setTerminoJ(int terminoJ) {
		this.terminoJ = terminoJ;
	}

	public String getDiaviernes() {
		return diaviernes;
	}

	public void setDiaviernes(String diaviernes) {
		this.diaviernes = diaviernes;
	}

	public int getInicioV() {
		return inicioV;
	}

	public void setInicioV(int inicioV) {
		this.inicioV = inicioV;
	}

	public int getTerminoV() {
		return terminoV;
	}

	public void setTerminoV(int terminoV) {
		this.terminoV = terminoV;
	}

	@Override
	public String toString() {
		return "HorarioContent [semana=" + semana + ", diaLunes=" + diaLunes + ", inicioL=" + inicioL + ", terminoL="
				+ terminoL + ", diaMartes=" + diaMartes + ", inicioM=" + inicioM + ", termino=" + terminoM
				+ ", diaMiercoles=" + diaMiercoles + ", inicioMie=" + inicioMie + ", terminoMie=" + terminoMie
				+ ", diaJueves=" + diaJueves + ", inicioJ=" + inicioJ + ", terminoJ=" + terminoJ + ", diaviernes="
				+ diaviernes + ", inicioV=" + inicioV + ", terminoV=" + terminoV + "]";
	}

}
