package com.apress.springrecipes.court.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.apress.springrecipes.court.domain.Doctor;
import com.apress.springrecipes.court.util.Constantes;

public class GuardarInformacion {

	public boolean save(Doctor doctor) {
		FileWriter flwriter = null;
		try {
			flwriter = new FileWriter(Constantes.urlArchivo, true);
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
