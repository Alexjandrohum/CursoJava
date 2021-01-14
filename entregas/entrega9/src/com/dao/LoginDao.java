package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.service.LoginService;

import comconf.Doctor;

public class LoginDao implements LoginService {

	public Doctor validarDoctor(String usuario, String pass) {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		Session session = sessions.openSession();
		Doctor doctor = null;
		List<Doctor> doctores = new ArrayList<>();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			Query query = session.createQuery("from Doctor where correo = :e and contra = :c");
			query.setString("e", usuario);
			query.setString("c", pass);
			doctores = query.list();

			for (Doctor doctorr : doctores) {
				doctor = doctorr;
			}

			tx.commit();
			tx = null;
			return doctor;

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			System.out.println("Error: " + e);
			return null;
		} finally {
			session.close();
		}
	}

}
