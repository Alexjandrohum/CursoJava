package com.apress.springrecipes.court.domain;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class CredencialesValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Credenciales.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "usuario", "required.usuario", "Usuario requerido");
		ValidationUtils.rejectIfEmpty(errors, "password", "required.password", "Contraseña requerida");
		Credenciales credencial = (Credenciales) arg0;
	}

}
