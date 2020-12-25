package com.dao;

import com.domain.Credenciales;
import com.service.LoginService;

public class LoginDao implements LoginService {

	@Override
	public boolean validarUsuario(Credenciales credenciales) {
		if (credenciales.getUsuario().equals("alex") && credenciales.getContra().equals("password")) {
			return true;
		} else {
			return false;
		}

	}

}
