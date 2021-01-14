package com.apress.springrecipes.court.service;

import com.apress.springrecipes.court.domain.Doctor;

public interface RegisterService {

	boolean createDoctor(Doctor doctor) throws DoctorNotAvailableException;

}
