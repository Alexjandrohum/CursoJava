package com.apress.springrecipes.court.service;

import com.apress.springrecipes.court.domain.Doctor;

public class RegisterServiceImpl implements RegisterService {

	@Override
	public boolean createDoctor(Doctor doctor) throws DoctorNotAvailableException {
		return true;
	}

}
