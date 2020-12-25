package com.apress.springrecipes.court.service;

import com.apress.springrecipes.court.dao.LeerInformacion;
import com.apress.springrecipes.court.domain.Credenciales;
import com.apress.springrecipes.court.domain.Doctor;

public class LoginServiceImpl implements LoginService {

	private LeerInformacion lectura;

	@Override
	public boolean getValidation(Credenciales credenciales) throws CredencialesNotAvailableException {
		lectura = new LeerInformacion();
		return lectura.getValidacion(credenciales);
	}

	@Override
	public Doctor getInfoDoctor() {
		return lectura.getInfoDoctor();
	}

} 
