package spring.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import spring.domain.Credenciales;
import spring.domain.Doctor;
import spring.service.DoctorService;

@Controller
@RequestMapping("/")
@SessionAttributes("doctor")
public class LoginController {

	private DoctorService service;

	public LoginController(DoctorService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String login(Model model) {
		Credenciales credenciales = new Credenciales();
		model.addAttribute("credenciales", credenciales);
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String loginPost(@ModelAttribute("credenciales") Credenciales credenciales, Model model, HttpServletRequest request) {
		HttpSession sesion = request.getSession();
		Doctor doctor = null;
		doctor = service.getDoctorByEmail(credenciales.getUsuario());
		if (doctor != null) {
			if (credenciales.getPassword().equals(doctor.getContra())) {
				sesion.setAttribute("doctor", doctor);
				return "redirect:inicio";
			} else {
				model.addAttribute("datosIncorrectos", "Credenciales incorrectas");
				return "login";
			}
		} else {
			model.addAttribute("datosIncorrectos", "No estas registrado");
			return "login";
		}

	}

}
