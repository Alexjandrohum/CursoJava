package com.domain;

public class Doctor {

	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private String rfc;
	private String especialidad;
	private String sexo;
	private String correo;
	private String contra;

	public Doctor() {
		super();
	}

	public Doctor(String nombre, String apellidos, String direccion,String rfc, String especialidad,String sexo, String telefono, 
			 String correo, String contra) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.rfc = rfc;
		this.especialidad = especialidad;
		this.sexo = sexo;
		this.correo = correo;
		this.contra = contra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	@Override
	public String toString() {
		return "Doctor [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefono="
				+ telefono + ", rfc=" + rfc + ", especialidad=" + especialidad + ", sexo=" + sexo + ", correo=" + correo
				+ ", contra=" + contra + "]";
	}

}
