package com.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.dao.LoginDao;
import com.domain.Credenciales;
import com.domain.Doctor;
import com.service.LoginService;

@ManagedBean(name = "login")
@RequestScoped
public class LoginMB {

	public String usuario;
	public String contra;
	public String mensaje;
	public Doctor doctor;
	public Date fecha;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Date getFecha() {
		fecha = new Date();
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String validarUsuario() {
		LoginService service = new LoginDao();
		doctor = service.validarUsuario(new Credenciales(usuario, contra));
		if (doctor != null) {
			return "inicioMenu";
		} else {
			setMensaje("Crenciales incorrectas");
			return "login";
		}
	}

}
