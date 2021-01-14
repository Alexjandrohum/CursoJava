package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.DireccionDao;
import domain.Cliente;
import domain.Direccion;
import domain.Registro;

@Controller
public class RegistroClienteController {

	@RequestMapping(value = "getDirecciones", method = RequestMethod.GET)
	public @ResponseBody List<Direccion> getDirecciones() {

		DireccionDao dao = new DireccionDao();

		return dao.getDirecciones();
	}

	@RequestMapping(value = "getDireccionById/{id}", method = RequestMethod.GET)
	public @ResponseBody Direccion getDireccion(@PathVariable("id") int id) {
		DireccionDao dao = new DireccionDao();

		return dao.getDireccionById(id);
	}

	@RequestMapping(value = "crearDireccion", method = RequestMethod.GET)
	public @ResponseBody int crearDireccion(@RequestBody Direccion direccion) {

		DireccionDao dao = new DireccionDao();

		return dao.crearDireccion(direccion);
	}

	@RequestMapping(value = "crearCliente", method = RequestMethod.POST)
	public @ResponseBody String crearCliente(@RequestBody Registro registro) {
		System.out.println("Crear cliente");
		System.out.println("Obtenido: " + registro);
		DireccionDao dao = new DireccionDao();

		dao.crearCliente(registro);
		return "creado";
	}

	@RequestMapping(value = "getClienteById/{id}", method = RequestMethod.GET)
	public @ResponseBody Cliente getCliente(@PathVariable("id") int id) {
		DireccionDao dao = new DireccionDao();

		return dao.obtenerCliente(id);
	}

	@RequestMapping(value = "deleteClienteById/{id}", method = RequestMethod.DELETE)
	public @ResponseBody String deleteCliente(@PathVariable("id") int id) {
		DireccionDao dao = new DireccionDao();

		if (dao.deteleCliente(id) != 0) {
			return "Eliminado";
		} else {
			return "Sin efectos";
		}

	}

}
