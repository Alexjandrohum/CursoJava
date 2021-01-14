package dwr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.dao.HorarioDao;
import com.domain.Doctor;
import com.service.HorarioService;

public class Doc {

	public List<Doctor> getDocFilter(String filter) {
		System.out.println("Filtro obtenido " + filter);
		List<Doctor> list = new ArrayList<Doctor>();
		HorarioService service2 = new HorarioDao();
		list = service2.getDoctoresFilter(filter);
		System.out.println("Info" + list);
		return list;
	}

}
