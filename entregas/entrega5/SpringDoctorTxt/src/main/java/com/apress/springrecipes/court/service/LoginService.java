package com.apress.springrecipes.court.service;

import com.apress.springrecipes.court.domain.Credenciales;
import com.apress.springrecipes.court.domain.Doctor;

public interface LoginService {

	boolean getValidation(Credenciales credenciales) throws CredencialesNotAvailableException;

	Doctor getInfoDoctor();

}
