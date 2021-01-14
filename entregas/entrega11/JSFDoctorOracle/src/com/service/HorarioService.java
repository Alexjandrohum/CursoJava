package com.service;

import java.util.List;

import com.domain.Doctor;
import com.domain.HorarioContent;

public interface HorarioService {
	int createHorario(HorarioContent horario, int idDoctor);

	List<Doctor> getDoctoresFilter(String caracter);
}
