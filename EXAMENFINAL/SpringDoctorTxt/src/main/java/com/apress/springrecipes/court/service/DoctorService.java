package com.apress.springrecipes.court.service;

import com.apress.springrecipes.court.domain.Credenciales;
import com.apress.springrecipes.court.domain.Doctor;
import com.apress.springrecipes.court.domain.DoctorDTO;
import com.apress.springrecipes.court.domain.HorarioContent;

public interface DoctorService {

	boolean createDoctor(Doctor doctor);
	
	DoctorDTO getValidation(Credenciales credenciales);
	
	int createHorario(HorarioContent horario, int idDoctor);

}
