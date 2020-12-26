package com.service;

import com.domain.Credenciales;
import com.domain.Doctor;

public interface LoginService {
	
	Doctor validarUsuario(Credenciales credenciales);

}
