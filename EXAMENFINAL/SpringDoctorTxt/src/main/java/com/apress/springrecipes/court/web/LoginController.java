package com.apress.springrecipes.court.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.apress.springrecipes.court.domain.Credenciales;
import com.apress.springrecipes.court.domain.CredencialesValidator;
import com.apress.springrecipes.court.domain.DoctorDTO;
import com.apress.springrecipes.court.service.DoctorService;
import com.apress.springrecipes.court.service.LoginService;
import com.apress.springrecipes.court.util.Constantes;

@Controller
@RequestMapping("/login")
public class LoginController {

	
	private CredencialesValidator validator;
	private DoctorService docService;

	@Autowired
	public LoginController(CredencialesValidator validator, DoctorService docService) {
		this.validator = validator;
		this.docService = docService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String login(Model model) {
		Credenciales credenciales = new Credenciales();
		model.addAttribute("credenciales", credenciales);
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String validation(@ModelAttribute("credenciales") Credenciales credenciales, BindingResult result,
			SessionStatus status, Model model, HttpServletRequest request) {
		Date date = new Date();
		HttpSession sesion = request.getSession();
		validator.validate(credenciales, result);
		DoctorDTO doc;
		if (result.hasErrors()) {
			model.addAttribute("credenciales", credenciales);
			return "login";
		} else {
			doc = docService.getValidation(credenciales);
			if (doc != null) {
				model.addAttribute("fecha", date);
				model.addAttribute("infoDoctor", doc);
				sesion.setAttribute("doctor", doc);
				return "redirect:inicio";
			} else {
				model.addAttribute("credenciales", credenciales);
				model.addAttribute("mensaje", Constantes.mensaje);
				return "login";
			}
		}

	}

}