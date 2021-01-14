package com.apress.springrecipes.court.web;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apress.springrecipes.court.domain.DoctorDTO;
import com.apress.springrecipes.court.domain.HorarioContent;
import com.apress.springrecipes.court.domain.Semanas;
import com.apress.springrecipes.court.service.DoctorService;
import com.apress.springrecipes.court.util.Constantes;
import com.apress.springrecipes.court.util.SemanasDatas;

@Controller
@RequestMapping("/inicio")
public class InicioController {

	private DoctorService service;

	@Autowired
	public InicioController(DoctorService service) {
		this.service = service;
	}

	List<Semanas> getSemanas() {
		SemanasDatas semana = new SemanasDatas();
		List<Semanas> listSemanas = java.util.Collections.emptyList();

		listSemanas = semana.getListSemanas();
		return listSemanas;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String inicio(Model model, HttpServletRequest request) {
		HttpSession sesion = request.getSession();
		HorarioContent horario = new HorarioContent();
		model.addAttribute("horario", horario);
		Date date = new Date();
		DoctorDTO doctor;
		doctor = (DoctorDTO) sesion.getAttribute("doctor");
		model.addAttribute("doctor", doctor);
		model.addAttribute("fecha", date);

		model.addAttribute("semanas2", getSemanas());

		return "inicio";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String horario(@ModelAttribute("horario") HorarioContent horario, Model model, HttpServletRequest request) {
		HttpSession sesion = request.getSession();
		DoctorDTO doctor;
		System.out.println("DOc: " + horario);
		doctor = (DoctorDTO) sesion.getAttribute("doctor");
		model.addAttribute("semanas2", getSemanas());
		int estado = service.createHorario(horario, doctor.getIdDoctor());
		switch (estado) {  
		case Constantes.diaNecesario:
			model.addAttribute("mensajes", "Selecciona un día por lo menos");
			return "inicio";
		case Constantes.errorSaveHorario:
			model.addAttribute("mensajes", "No se pudo crear el horario");
			return "inicio";
		case Constantes.semanaOcupada:
			model.addAttribute("mensajes", "La semana seleccionada ya está ocupada");
			return "inicio";
		case Constantes.saveHorario:
			return "redirect:inicio";
		case Constantes.validacionDiasCorrecto:
			model.addAttribute("mensajes", "Dias incorrectos");
			return "inicio";
		default:
			model.addAttribute("mensajes", "Error inesperado");
			return "inicio";
		}

	}

}
