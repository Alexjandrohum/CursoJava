package spring.service;

import spring.domain.Doctor;
import spring.domain.HorarioContent;

public interface DoctorService {

	boolean createDoctor(Doctor doctor);

	Doctor getDoctorByEmail(String email);
	
	int createHorario();
	
	boolean createHorario(HorarioContent horario, int id);
}
