package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Doctor;
import util.Archivo;

public class BienvenidaController extends HttpServlet {
	Doctor doctorSelect = null;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Archivo lectura = new Archivo();
		lectura.lectura();
		ArrayList<Doctor> doctores = lectura.getDoctores();
		RequestDispatcher rd = null;
		Date date = new Date();
		String fecha = date.toString();
		request.setAttribute("fecha", fecha);
		if (validarCredenciales(request.getParameter("usuario"), request.getParameter("password"), doctores)) {
			request.setAttribute("doctor", doctorSelect);
			rd = request.getRequestDispatcher("/bienvenida.jsp");
		} else {
			rd = request.getRequestDispatcher("/index.jsp");
		}
		rd.forward(request, response);
	}

	private boolean validarCredenciales(String usuario, String password, ArrayList<Doctor> doctores) {
		boolean estado = false;
		for (Doctor doctor : doctores) {
			String user = doctor.getCorreo().trim();
			String pass = doctor.getContra().trim();
			if (user.equals(usuario) & pass.equals(password)) {
				estado = true;
				doctorSelect = doctor;
				return estado;
			}

		}
		return estado;
	}

}
