package com.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.domain.HorarioContent;
import com.domain.Select;

import util.Constantes;



@ManagedBean(name = "inicio")
public class InicioMB {

	public List<Integer> semanas;
	public String semana;
	public String diaLunes;
	public int inicioL;
	public int terminoL;
	public String diaMartes;
	public int inicioM;
	public int terminoM;
	public String diaMiercoles;
	public int inicioMie;
	public int terminoMie;
	public String diaJueves;
	public int inicioJ;
	public int terminoJ;
	public String diaviernes;
	public int inicioV;
	public int terminoV;
	public String mensaje;

	@ManagedProperty("#{login}")
	private LoginMB login;

	public List<Integer> getSemanas() {
		Select select = new Select();
		semanas = select.getSemanas();
		return semanas;
	}

	public void setSemanas(List<Integer> semanas) {
		this.semanas = semanas;
	}

	public String getSemana() {
		return semana;
	}

	public void setSemana(String semana) {
		this.semana = semana;
	}

	public String getDiaLunes() {
		diaLunes = "Lunes";
		return diaLunes;
	}

	public void setDiaLunes(String diaLunes) {
		diaLunes = "Lunes";
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
		diaMartes = "Martes";
		return diaMartes;
	}

	public void setDiaMartes(String diaMartes) {
		diaMartes = "Martes";
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

	public void setTerminoM(int terminoM) {
		this.terminoM = terminoM;
	}

	public String getDiaMiercoles() {
		diaMiercoles = "Miercoles";
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
		diaJueves = "Jueves";
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
		diaviernes = "Viernes";
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

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public LoginMB getLogin() {
		return login;
	}

	public void setLogin(LoginMB login) {
		this.login = login;
	}



}
