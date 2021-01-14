package com.dao;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.service.RegistroService;

import comconf.Doctor;

public class RegistroDao implements RegistroService {

	@Override
	public void selectDoctor() {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		Session session = sessions.openSession();

		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			List<Doctor> list = session.createQuery("from Doctor").list();

			for (Doctor doctor : list) {
				System.out.println("Doctor: " + doctor);
			}
			tx.commit();
			tx = null;

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			System.out.println("Error: " + e);
		} finally {
			session.close();
		}

	}

	@Override
	public boolean createdoctor(Doctor doctor) {

		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		Session session = sessions.openSession();

		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.save(doctor);

			tx.commit();
			tx = null;
			return true;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}

			System.out.println("Error: " + e);
			return false;
		} finally {
			session.close();
		}

	}

}
