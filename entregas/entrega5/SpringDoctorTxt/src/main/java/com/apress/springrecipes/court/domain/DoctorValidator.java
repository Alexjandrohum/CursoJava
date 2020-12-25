package com.apress.springrecipes.court.domain;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class DoctorValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Doctor.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "nombre", "required.nombre", "El nombre es requerido.");
		ValidationUtils.rejectIfEmpty(errors, "apellidos", "required.apellidos", "Los apellidos son requeridos.");
		ValidationUtils.rejectIfEmpty(errors, "direccion", "required.direccion", "La dirección es requerida.");
		ValidationUtils.rejectIfEmpty(errors, "telefono", "required.telefono", "El teléfono es requerido.");
		ValidationUtils.rejectIfEmpty(errors, "rfc", "required.rfc", "El rfc es requerido.");
		ValidationUtils.rejectIfEmpty(errors, "especialidad", "required.especialidad", "La especialidad es requerida.");
		ValidationUtils.rejectIfEmpty(errors, "sexo", "required.sexo", "El tipo de sexo es reuqrido.");
		ValidationUtils.rejectIfEmpty(errors, "correo", "required.correo", "El correo es requerido.");
		ValidationUtils.rejectIfEmpty(errors, "contra", "required.contra", "La contraseña es requerida.");
		Doctor doctor = (Doctor) target;
	}

}
