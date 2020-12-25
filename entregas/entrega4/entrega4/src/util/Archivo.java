package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;

public class Archivo {

	private Doctor doctor;
	private ArrayList<Doctor> doctores;

	public Archivo() {
		doctor = new Doctor();
		doctores = new ArrayList<Doctor>();
	}

	public void save(Doctor doctor) {
		this.doctor = doctor;
		aniadirArchivo();
	}

	public void aniadirArchivo() {
		FileWriter flwriter = null;
		try {
			flwriter = new FileWriter(Constantes.rutaFile, true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);

			bfwriter.write(doctor.getNombre() + "-" + doctor.getApellidos() + "-" + doctor.getDireccion() + "-"
					+ doctor.getRfc() + "-" + doctor.getEspecialidad() + "-" + doctor.getSexo() + "-"
					+ doctor.getTelfono() + "-" + doctor.getCorreo() + "-" + doctor.getContra());
			bfwriter.write("\n");
			bfwriter.close();

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void lectura() {
		ArrayList<String> elementos = new ArrayList<String>();
		BufferedReader objReader = null;
		try {
			String strCurrentLine;
			objReader = new BufferedReader(new FileReader(Constantes.rutaFile));

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

	public ArrayList<Doctor> getDoctores() {
		return doctores;
	}

}
