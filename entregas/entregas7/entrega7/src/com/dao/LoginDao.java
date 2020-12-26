package com.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.domain.Credenciales;
import com.domain.Doctor;
import com.service.LoginService;
import com.util.Constantes;

public class LoginDao implements LoginService {

	private ArrayList<Doctor> doctores = new ArrayList<Doctor>();
	private Doctor getInfoDoctor;

	@Override
	public Doctor validarUsuario(Credenciales credenciales) {
		lectura();
		if (getValidacion(credenciales)) {
			return getInfoDoctor();
		} else {
			return null;
		}

	}


	public void lectura() {
		ArrayList<String> elementos = new ArrayList<String>();
		BufferedReader objReader = null;

		try {
			String strCurrentLine;
			objReader = new BufferedReader(new FileReader(Constantes.rutaArchivo));

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
		for (Doctor doctor : doctores) {
			String user = doctor.getCorreo().trim();
			String pass = doctor.getContra().trim();
			if (user.equals(credenciales.getUsuario()) & pass.equals(credenciales.getContra())) {
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
