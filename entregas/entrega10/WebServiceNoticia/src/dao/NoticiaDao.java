package dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import contract.NoticiaContract;
import domain.NoticiaDomain;

public class NoticiaDao implements NoticiaContract {

	private List<NoticiaDomain> noticias;

	public NoticiaDao() {
		noticias = new ArrayList<NoticiaDomain>();
		noticias = generateNoticia();
	}

	@Override
	public NoticiaDomain getNoticia() {

		return getAleatorio();
	}

	NoticiaDomain getAleatorio() {
		NoticiaDomain noticiaObtenida = null;
		int numero = (int) (Math.random() * 7 + 1);
		for (NoticiaDomain noticia : noticias) {
			if (noticia.getNumero() == numero) {
				return noticia;
			}
		}
		return noticiaObtenida;
	}

	List<NoticiaDomain> generateNoticia() {
		Date calendar = new Date();
		noticias.add(new NoticiaDomain(1, "Farmaceuticos", "Los farmaceuticos son medicamentos importamtes", calendar));
		noticias.add(new NoticiaDomain(2, "Aliviax", "Medicamento para aliviar dolores de cabeza", calendar));
		noticias.add(new NoticiaDomain(3, "Treda", "Medicamento para aliviar el dolor de estómago", calendar));
		noticias.add(new NoticiaDomain(4, "Next", "Medicamento para aliviar la gripa", calendar));
		noticias.add(new NoticiaDomain(5, "Paracetamol", "Medicamento para aliviar el bomito", calendar));
		noticias.add(new NoticiaDomain(6, "Prodolina", "Medicamento para dolores ceberos de cabeza", calendar));
		noticias.add(new NoticiaDomain(7, "Neomelubrina", "Medicamento para estar sano", calendar));

		return noticias;

	}

}
