package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import contract.NoticiaContract;
import dao.NoticiaDao;
import domain.NoticiaDomain;

@WebService
public class Noticia {

	@WebMethod
	public NoticiaDomain getNoticia() {
		NoticiaContract getNoticia = new NoticiaDao();

		return getNoticia.getNoticia();
	}

}
