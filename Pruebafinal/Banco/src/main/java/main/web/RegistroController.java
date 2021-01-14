package main.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegistroController {

	@RequestMapping(value = "getClient", method = RequestMethod.GET)
	public @ResponseBody String registro() {
		return "valores del cliente";
	}

}
