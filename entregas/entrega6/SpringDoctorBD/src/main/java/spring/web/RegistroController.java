package spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import spring.domain.Credenciales;
import spring.domain.Doctor;
import spring.service.DoctorService;

@Controller
@RequestMapping("/registro")
public class RegistroController {

	private DoctorService service;

	public RegistroController(DoctorService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String registro(Model model) {
		Doctor doctor = new Doctor();
		model.addAttribute("doctor", doctor);
		return "registro";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String registrar(@ModelAttribute("doctor") Doctor doctor, BindingResult result, SessionStatus status,
			Model model) {
		Credenciales credenciales = new Credenciales();
		model.addAttribute("credenciales", credenciales);

		if (service.createDoctor(doctor)) {
			return "login";
		} else {
			return "registro";
		}

	}

}
