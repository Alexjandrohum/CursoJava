package com.apress.springrecipes.court.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.apress.springrecipes.court.domain.Credenciales;
import com.apress.springrecipes.court.domain.Doctor;
import com.apress.springrecipes.court.util.Constantes;

public class LeerInformacion {
	ArrayList<Doctor> doctores = new ArrayList<Doctor>();
	Doctor getInfoDoctor = new Doctor();

	public LeerInformacion() {
		lectura();
	}

	public void lectura() {
		ArrayList<String> elementos = new ArrayList<String>();
		BufferedReader objReader = null;

		try {
			String strCurrentLine;
			objReader = new BufferedReader(new FileReader(Constantes.urlArchivo));

			while ((strCurrentLine = objReader.readLine()) != null) {
				elementos.add(strCurrentLine);
			}
			delimitarDoctor(elementos);

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {
				if (objReader != null)
					objReader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public void delimitarDoctor(ArrayList<String> elementos) {
		String[] parejas;

		for (int i = 0; i < elementos.size(); i++) {
			String oracion = elementos.get(i);
			parejas = oracion.split("-");
			doctores.add(new Doctor(parejas[0], parejas[1], parejas[2], parejas[3], parejas[4], parejas[5], parejas[6],
					parejas[7], parejas[8]));
		}

	}

	public boolean getValidacion(Credenciales credenciales) {

		boolean estado = false;
		for (Doctor doctor : doctores) {
			String user = doctor.getCorreo().trim();
			String pass = doctor.getContra().trim();
			if (user.equals(credenciales.getUsuario()) & pass.equals(credenciales.getPassword())) {
				getInfoDoctor = doctor;
				return true;
			}

		}
		return false;
	}

	public Doctor getInfoDoctor() {
		return getInfoDoctor;
	}

}
