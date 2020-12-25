package com.apress.springrecipes.court.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.apress.springrecipes.court.domain.Doctor;
import com.apress.springrecipes.court.domain.DoctorValidator;
import com.apress.springrecipes.court.service.RegisterService;

@Controller
@RequestMapping("/formulario")
public class FormularioController {
	private RegisterService service;
	private DoctorValidator validator;

	@Autowired
	public FormularioController(RegisterService service, DoctorValidator validator) {
		this.service = service;
		this.validator = validator;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String formulario(Model model) {
		Doctor doctor = new Doctor();
		model.addAttribute("doctor", doctor);
		return "registro";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String registrar(@ModelAttribute("doctor") Doctor doctor, BindingResult result, SessionStatus status,
			Model model) {
		validator.validate(doctor, result);
		if (result.hasErrors()) {
			model.addAttribute("doctor", doctor);
			return "registro";
		} else {
			if (service.createDoctor(doctor)) {
				return "redirect:login";
			} else {
				model.addAttribute("doctor", doctor);
				return "registro";
			}

		}

	}

}
