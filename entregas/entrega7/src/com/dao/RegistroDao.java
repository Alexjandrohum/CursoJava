package com.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.domain.Doctor;
import com.service.RegistroService;

public class RegistroDao implements RegistroService {

	@Override
	public boolean createDoctor(Doctor doctor) {
		System.out.println("Doctor: " + doctor);
		return true;
	}

	public boolean save(Doctor doctor) {
		FileWriter flwriter = null;
		try {
			flwriter = new FileWriter("", true);
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
