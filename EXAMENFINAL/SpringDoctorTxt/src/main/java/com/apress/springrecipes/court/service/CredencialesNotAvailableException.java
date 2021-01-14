package com.apress.springrecipes.court.service;

public class CredencialesNotAvailableException extends RuntimeException {
	private String usuario;
	private String password;

	public CredencialesNotAvailableException() {
	}

	public CredencialesNotAvailableException(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
