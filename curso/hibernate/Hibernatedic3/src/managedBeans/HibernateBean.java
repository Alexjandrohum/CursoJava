package managedBeans;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hbm.Vehicle;

@ManagedBean
public class HibernateBean {
	public void consultar() {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		Session session = sessions.openSession();
		
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// consulta normal
			List<Vehicle> list = session.createQuery("from Vehicle").list();
			
			
			
			for (Vehicle vehicle : list) {
				System.out.println("-----------------------"+ vehicle);
			}
			
			tx.commit();
			tx = null;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			System.out.println("could not acquire message " + e);
		}finally {
			session.close();
		}
	}
	
	
	public void condicion() {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		Session session = sessions.openSession();
		
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// consulta con condicion
			Query q = session.createQuery("from Vehicle where color = :color_param");
			q.setString("color_param", "verde");
			
			List<Vehicle> list = q.list();
			
			
			
			for (Vehicle vehicle : list) {
				System.out.println("-----------------------"+ vehicle);
			}
			
			tx.commit();
			tx = null;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			System.out.println("could not acquire message " + e);
		}finally {
			session.close();
		}
	}
	
	
	
	public void registra() {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		Session session = sessions.openSession();
		
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Vehicle  vehicle = new Vehicle();
			vehicle.setColor("marron");
			vehicle.setSeal(new BigDecimal("4"));
			vehicle.setWheel(new BigDecimal("5"));
			vehicle.setVehocleNo("122");
			
			session.save(vehicle);
			
			tx.commit();
			tx = null;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			System.out.println("could not acquire message " + e);
		}finally {
			session.close();
		}	
	}
	
	
	public void contar() {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		Session session = sessions.openSession();
		
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Iterator iterasiones = session.createQuery("select count(*) from Vehicle").iterate();
			while (iterasiones.hasNext()) {
				Long cuenta = (Long) iterasiones.next();
				System.out.println("******************+"+ cuenta);
			}

			
			tx.commit();
			tx = null;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			System.out.println("could not acquire message " + e);
		}finally {
			session.close();
		}
	}
}
