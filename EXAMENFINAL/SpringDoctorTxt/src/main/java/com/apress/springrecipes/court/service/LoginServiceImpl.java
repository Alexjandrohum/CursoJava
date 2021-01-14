package com.apress.springrecipes.court.service;

import com.apress.springrecipes.court.domain.Credenciales;
import com.apress.springrecipes.court.domain.Doctor;

public class LoginServiceImpl implements LoginService {

	

	@Override
	public boolean getValidation(Credenciales credenciales) throws CredencialesNotAvailableException {
		return true;
	}

	@Override
	public Doctor getInfoDoctor() {
		return null;
	}

}
