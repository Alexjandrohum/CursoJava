package com.bean;

import java.rmi.RemoteException;

import javax.faces.bean.ManagedBean;
import javax.xml.rpc.ServiceException;

import service.Noticia;
import service.NoticiaDomain;
import service.NoticiaService;
import service.NoticiaServiceLocator;

@ManagedBean(name = "noticia")
public class NoticiaMB {

	public NoticiaDomain nota;
	public NoticiaDomain noticiaObtenida;

	public NoticiaDomain getNota() {
		return noticiaObtenida;
	}

	public void obtenerNoticia() {
		NoticiaDomain noticia = null;
		try {
			NoticiaService service = new NoticiaServiceLocator();
			Noticia n = service.getNoticiaPort();

			noticia = n.getNoticia();

		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		noticiaObtenida = noticia;

	}

}
