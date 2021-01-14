package spring.web;

import java.util.ArrayList;
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

import spring.dao.DoctorDaos;
import spring.domain.Doctor;
import spring.domain.HorarioContent;
import spring.domain.Semanas;
import spring.service.DoctorService;
import spring.util.SemanasDatas;

@Controller
@RequestMapping("/inicio")
public class InicioController {

	private DoctorService service;

	@Autowired
	public InicioController(DoctorService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String inicio(Model model, HttpServletRequest request) {
		HttpSession sesion = request.getSession();
		HorarioContent horario = new HorarioContent();
		model.addAttribute("horario", horario);
		Date date = new Date();
		Doctor doctor;
		doctor = (Doctor) sesion.getAttribute("doctor");
		model.addAttribute("doctor", doctor);
		model.addAttribute("fecha", date);
		SemanasDatas semana = new SemanasDatas();
		List<Semanas> listSemanas = java.util.Collections.emptyList();

		listSemanas = semana.getListSemanas();
		model.addAttribute("semanas2", listSemanas);

		return "inicio";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String horario(@ModelAttribute("horario") HorarioContent horario, Model model, HttpServletRequest request) {
		HttpSession sesion = request.getSession();
		Doctor doctor;
		doctor = (Doctor) sesion.getAttribute("doctor");
		if (service.createHorario(horario, doctor.getIdDoctor())) {
			return "redirect:inicio";
		} else {
			model.addAttribute("mensaje", "La semana está ocupada, selecciona otra");
			return "redirect:inicio";
		}

	}

}
