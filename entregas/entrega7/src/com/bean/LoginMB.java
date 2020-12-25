package com.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.dao.LoginDao;
import com.domain.Credenciales;
import com.service.LoginService;



@ManagedBean(name = "login")
@RequestScoped
public class LoginMB {

	public String usuario;
	public String contra;

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

	public String validarUsuario() {
		LoginService service = new LoginDao();

		if (service.validarUsuario(new Credenciales(usuario, contra))) {
			return "inicioMenu";
		} else {
			return "";
		}
	}

}
