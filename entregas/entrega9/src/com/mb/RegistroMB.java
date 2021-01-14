package com.mb;

import javax.faces.bean.ManagedBean;

import com.dao.RegistroDao;

import com.service.RegistroService;

import comconf.Doctor;

@ManagedBean(name = "registro")
public class RegistroMB {

	public String nombre;
	public String apellidos;
	public String direccion;
	public String telefono;
	public String rfc;
	public String especialidad;
	public String sexo;
	public String correo;
	public String contra;

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

	public String registarDoctor() {

		RegistroService service = new RegistroDao();
		if (service.createdoctor(
				new Doctor(nombre, apellidos, direccion, telefono, rfc, especialidad, sexo, correo, contra))) {
			return "registrado";
		} else {
			return "registro";
		}

	}

}
