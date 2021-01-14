package managedBean;

import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hbv.Vehicle;

@ManagedBean
public class HibernateBean {

	public void consulta() {

		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		Session session = sessions.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
//			PRIMER APARTADO MOSTRANDO TODOS LOS DATOS 
			
//			List<Vehicle> list = session.createQuery("from Vehicle").list();
//			for (Vehicle vehicle : list) {
//				System.out.println(vehicle.toString());
//			}
//			tx.commit();
//			tx = null;
// -------------------------------------------------------------------------------------------
			
//			SEGUNDO APARTADO USANDO :VEHICLE_PARAM PARA OBTENER ALGUN DATO EN ESPECIFICO
			
//			Query q = session.createQuery("from Vehicle where vehicle_no = :vehicle_no_param");
//			q.setString("vehicle_no_param","6");
//			List<Vehicle> list = q.list();
//			
//			for(Vehicle vehiculo:list) {
//				System.out.println("Vehicle_no: " + vehiculo.getVehicleNo());
//				System.out.println("Color: " + vehiculo.getColor());
//				System.out.println("Wheel: " + vehiculo.getWheel());
//			}
//			
//			tx.commit();
//			tx = null;
// -------------------------------------------------------------------------------------------------------
			
//			TERCER APARTADO INSERTANDO DATOS A LA BASE, SE PUEDEN ACTUALIZR LOS DATOS CON "saveOrUpdate".
			
//			Vehicle vehicle = new Vehicle();
//			vehicle.setVehicleNo("8");
//			vehicle.setColor("Amarillo");
//			vehicle.setWheel("6");
//			vehicle.setSeat("8");
//
//			session.saveOrUpdate(vehicle);
//			System.out.println("Tu nuevo vehiculo es: " + vehicle);
//			tx.commit();
//			tx = null;
			
// ------------------------------------------------------------------------------------------------------------

//          CUARTO APARTADO, RECUPERA UN CONTEO DE LOS USUARIOS REGISTRADOS.

			Iterator iteraciones = session.createQuery("select count(*) from Vehicle").iterate();

			while (iteraciones.hasNext()) {
				Long cuenta = (Long) iteraciones.next();

				System.out.println("El total de Vehiculos son: " + cuenta + " Vehiculos."); // sysout("count del Usuario
																							// : " + cuenta);
			}

			tx.commit();
			tx = null;
//
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			System.out.println("Could not acquire message " + e);
		} finally {
			session.close();
		}

		
	}
	
	

}
