package com.domain;

import java.util.ArrayList;
import java.util.List;

public class Select {
	List<Integer> semanas = new ArrayList<Integer>();

	public List<Integer> getSemanas() {
		for (int i = 1; i <= 52; i++) {
			semanas.add(i);
		}
		return semanas;
	}

}
