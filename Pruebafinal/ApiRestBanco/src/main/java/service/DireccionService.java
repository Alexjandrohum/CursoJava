package service;

import java.util.List;

import domain.Cliente;
import domain.Direccion;
import domain.Registro;

public interface DireccionService {
	
	List<Direccion> getDirecciones();
	
	Direccion getDireccionById(int id);
	
	int crearDireccion(Direccion direccion);
	
	void crearCliente(Registro registro);
	
	Cliente obtenerCliente(int id);
	
	int deteleCliente(int id);
	
	
	

}
