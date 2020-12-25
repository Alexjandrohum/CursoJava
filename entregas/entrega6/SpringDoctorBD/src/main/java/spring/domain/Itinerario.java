package spring.domain;

public class Itinerario {

	private int idItinerario;
	private int idSemana;
	private int inicioL;
	private int terminoL;
	private String diaLunes;
	private int inicioM;
	private int terminoM;
	private String diaMartes;
	private int inicioMie;
	private int terminoMie;
	private String diaMiercoles;
	private int inicioJ;
	private int terminoJ;
	private String diaJueves;
	private int inicioV;
	private int terminoV;
	private String diaViernes;
	private int idDoctor;

	public Itinerario() {
		super();
	}

	public Itinerario(int idItinerario, int idSemana, int inicioL, int terminoL, String diaLunes, int inicioM,
			int terminoM, String diaMartes, int inicioMie, int terminoMie, String diaMiercoles, int inicioJ,
			int terminoJ, String diaJueves, int inicioV, int terminoV, String diaViernes, int idDoctor) {
		super();
		this.idItinerario = idItinerario;
		this.idSemana = idSemana;
		this.inicioL = inicioL;
		this.terminoL = terminoL;
		this.diaLunes = diaLunes;
		this.inicioM = inicioM;
		this.terminoM = terminoM;
		this.diaMartes = diaMartes;
		this.inicioMie = inicioMie;
		this.terminoMie = terminoMie;
		this.diaMiercoles = diaMiercoles;
		this.inicioJ = inicioJ;
		this.terminoJ = terminoJ;
		this.diaJueves = diaJueves;
		this.inicioV = inicioV;
		this.terminoV = terminoV;
		this.diaViernes = diaViernes;
		this.idDoctor = idDoctor;
	}

	public int getIdItinerario() {
		return idItinerario;
	}

	public void setIdItinerario(int idItinerario) {
		this.idItinerario = idItinerario;
	}

	public int getIdSemana() {
		return idSemana;
	}

	public void setIdSemana(int idSemana) {
		this.idSemana = idSemana;
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

	public String getDiaLunes() {
		return diaLunes;
	}

	public void setDiaLunes(String diaLunes) {
		this.diaLunes = diaLunes;
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

	public void setTerminoM(int terminoM) {
		this.terminoM = terminoM;
	}

	public String getDiaMartes() {
		return diaMartes;
	}

	public void setDiaMartes(String diaMartes) {
		this.diaMartes = diaMartes;
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

	public String getDiaMiercoles() {
		return diaMiercoles;
	}

	public void setDiaMiercoles(String diaMiercoles) {
		this.diaMiercoles = diaMiercoles;
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

	public String getDiaJueves() {
		return diaJueves;
	}

	public void setDiaJueves(String diaJueves) {
		this.diaJueves = diaJueves;
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

	public String getDiaViernes() {
		return diaViernes;
	}

	public void setDiaViernes(String diaViernes) {
		this.diaViernes = diaViernes;
	}

	public int getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

	@Override
	public String toString() {
		return "Itinerario [idItinerario=" + idItinerario + ", idSemana=" + idSemana + ", inicioL=" + inicioL
				+ ", terminoL=" + terminoL + ", diaLunes=" + diaLunes + ", inicioM=" + inicioM + ", terminoM="
				+ terminoM + ", diaMartes=" + diaMartes + ", inicioMie=" + inicioMie + ", terminoMie=" + terminoMie
				+ ", diaMiercoles=" + diaMiercoles + ", inicioJ=" + inicioJ + ", terminoJ=" + terminoJ + ", diaJueves="
				+ diaJueves + ", inicioV=" + inicioV + ", terminoV=" + terminoV + ", diaViernes=" + diaViernes
				+ ", idDoctor=" + idDoctor + "]";
	}

}
