package domain;

import java.sql.Date;

public class Cliente {

	private int numero;
	private String nombre;
	private String nacimiento;
	private String rfc;
	private int domicilio;
	private int estado;
	private int banco;
	private String apellidos;
	private String sexo;

	public Cliente(int numero, String nombre, String nacimiento, String rfc, int domicilio, int estado, int banco,
			String apellidos, String sexo) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.rfc = rfc;
		this.domicilio = domicilio;
		this.estado = estado;
		this.banco = banco;
		this.apellidos = apellidos;
		this.sexo = sexo;
	}

	public Cliente() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public int getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(int domicilio) {
		this.domicilio = domicilio;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
