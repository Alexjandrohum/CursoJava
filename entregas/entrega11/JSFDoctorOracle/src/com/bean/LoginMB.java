package com.bean;

import java.rmi.RemoteException;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.rpc.ServiceException;

import org.primefaces.component.calendar.Calendar;

import com.dao.HorarioDao;
import com.dao.LoginDao;
import com.domain.Doctor;
import com.service.HorarioService;
import com.service.LoginService;

import service.Noticia;
import service.NoticiaDomain;
import service.NoticiaService;
import service.NoticiaServiceLocator;

@ManagedBean(name = "login")
@SessionScoped
public class LoginMB {

	public String usuario;
	public String contra;
	public Doctor doctor;
	public String mensaje;
	public String fecha;

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

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getFecha() {
		Date fecha = new Date();
		return fecha.toString();
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String validarUsuario() {

		LoginService service = new LoginDao();
		doctor = service.login(usuario, contra);
		if (doctor != null) {
			return "inicioMenu";
		} else {
			mensaje = "Credenciales incorrectas";
			return "login";
		}
	}

}
