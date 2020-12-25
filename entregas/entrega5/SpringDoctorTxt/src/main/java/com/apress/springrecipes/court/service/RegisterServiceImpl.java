package com.apress.springrecipes.court.service;

import com.apress.springrecipes.court.dao.GuardarInformacion;
import com.apress.springrecipes.court.domain.Doctor;

public class RegisterServiceImpl implements RegisterService {

	@Override
	public boolean createDoctor(Doctor doctor) throws DoctorNotAvailableException {
		GuardarInformacion doc = new GuardarInformacion();
		if (!doc.save(doctor)) {
			throw new DoctorNotAvailableException(doctor.getNombre(), doctor.getApellidos(), doctor.getDireccion(),
					doctor.getTelefono(), doctor.getRfc(), doctor.getEspecialidad(), doctor.getSexo(),
					doctor.getContra(), doctor.getContra());

		} else {
			return true;
		}
	}

}
