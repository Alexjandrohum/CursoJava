package com.apress.springrecipes.court.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.apress.springrecipes.court.dao.LeerInformacion;
import com.apress.springrecipes.court.domain.Credenciales;
import com.apress.springrecipes.court.domain.CredencialesValidator;
import com.apress.springrecipes.court.service.LoginService;
import com.apress.springrecipes.court.util.Constantes;

@Controller
@RequestMapping("/login")
public class LoginController {

	private LoginService service;
	private CredencialesValidator validator;

	@Autowired
	public LoginController(LoginService service, CredencialesValidator validator) {
		this.service = service;
		this.validator = validator;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String login(Model model) {
		Credenciales credenciales = new Credenciales();
		model.addAttribute("credenciales", credenciales);
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String validation(@ModelAttribute("credenciales") Credenciales credenciales, BindingResult result,
			SessionStatus status, Model model) {
		Date date = new Date();
		validator.validate(credenciales, result);
		if (result.hasErrors()) {
			model.addAttribute("credenciales", credenciales);
			return "login";
		} else {
			if (service.getValidation(credenciales)) {
				model.addAttribute("fecha", date);
				model.addAttribute("infoDoctor", service.getInfoDoctor());
				return "inicio";
			} else {
				model.addAttribute("credenciales", credenciales);
				model.addAttribute("mensaje", Constantes.mensaje);
				return "login";
			}
		}

	}

}