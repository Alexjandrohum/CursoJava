package spring.util;

import java.util.ArrayList;
import java.util.List;

import spring.domain.Semanas;

public class SemanasDatas {

	public List<Semanas> getListSemanas() {
		List<Semanas> semanas = new ArrayList<>();
		for (int i = 1; i <= 52; i++) {
			semanas.add(new Semanas(i, "Semana " + i));
		}

		return semanas;

	}

}
