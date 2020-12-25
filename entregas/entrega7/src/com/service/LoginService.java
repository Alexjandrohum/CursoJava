package com.service;

import com.domain.Credenciales;

public interface LoginService {
	
	boolean validarUsuario(Credenciales credenciales);

}
