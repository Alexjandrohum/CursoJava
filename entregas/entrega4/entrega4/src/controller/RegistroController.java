package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Doctor;
import util.Archivo;
import util.Constantes;

public class RegistroController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Doctor doctor = new Doctor();

		doctor.setNombre(request.getParameter("nombre"));
		doctor.setApellidos(request.getParameter("apellidos"));
		doctor.setDireccion(request.getParameter("direccion"));
		doctor.setTelfono(request.getParameter("telefono"));
		doctor.setRfc(request.getParameter("rfc"));
		doctor.setEspecialidad(request.getParameter("especialidad"));
		doctor.setCorreo(request.getParameter("correo"));
		doctor.setContra(request.getParameter("contra"));

		String sexo = request.getParameter("sexo");

		if (request.getParameter("nombre") != null) {

			if (sexo.equals(Constantes.tipoSexoHombre)) {
				doctor.setSexo(Constantes.HOMBRE);
			}

			if (sexo.equals(Constantes.tipoSexoMujer)) {
				doctor.setSexo(Constantes.MUJER);
			}

			Archivo archivo = new Archivo();
			archivo.save(doctor);
		}

		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}

}
