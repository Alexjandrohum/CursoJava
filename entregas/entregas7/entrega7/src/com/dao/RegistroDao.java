package com.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.domain.Doctor;
import com.service.RegistroService;
import com.util.Constantes;

public class RegistroDao implements RegistroService {

	@Override
	public boolean createDoctor(Doctor doctor) {
		return save(doctor);
	}

	public boolean save(Doctor doctor) {
		FileWriter flwriter = null;
		try {
			flwriter = new FileWriter(Constantes.rutaArchivo, true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			bfwriter.write(doctor.getNombre() + "-" + doctor.getApellidos() + "-" + doctor.getDireccion() + "-"
					+ doctor.getRfc() + "-" + doctor.getEspecialidad() + "-" + doctor.getSexo() + "-"
					+ doctor.getTelefono() + "-" + doctor.getCorreo() + "-" + doctor.getContra());
			bfwriter.write("\n");
			bfwriter.close();
			return true;
			
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

}
