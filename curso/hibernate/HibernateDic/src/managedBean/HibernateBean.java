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

import hbm.Usuario;

@ManagedBean
public class HibernateBean {

	public void consulta() {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		Session session = sessions.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			

//			PRIMER APARTADO MOSTRANDO TODOS LOS DATOS 
			
//			List<Usuario> list = session.createQuery("from Usuario").list();
//			for (Usuario usuario : list) {
//				System.out.println(usuario.toString());
//			}
//			tx.commit();
//			tx = null;
// -------------------------------------------------------------------------------------------
			
//			SEGUNDO APARTADO USANDO :EMAIL_PARAM PARA OBTENER ALGUN DATO EN ESPECIFICO
			
//			Query q = session.createQuery("from Usuario where email = :email_param");
//			q.setString("email_param","jose@gmail.com");
//			List<Usuario> list = q.list();
//			
//			for(Usuario user:list) {
//				System.out.println("Email: " + user.getEmail());
//				System.out.println("Nombre: " + user.getFirstName());
//				System.out.println("Password: " + user.getPassword());
//			}
//			
//			tx.commit();
//			tx = null;
// -------------------------------------------------------------------------------------------------------
			
//			TERCER APARTADO INSERTANDO DATOS A LA BASE, SE PUEDEN ACTUALIZR LOS DATOS CON "saveOrUpdate".
			
//			Usuario usuario = new Usuario();
//			usuario.setEmail("manuel@gmail.com");
//			usuario.setFirstName("Manuel");
//			usuario.setLastName("Licona");
//			usuario.setPassword("4321");
//			usuario.setPhone("1234564789");
//			usuario.setFax("333");
//			
//			session.saveOrUpdate(usuario);
//			System.out.println("Tu nuevo usuario es: " + usuario);
//			tx.commit();
//			tx = null;
//			
// ------------------------------------------------------------------------------------------------------------

//          CUARTO APARTADO, RECUPERA UN CONTEO DE LOS USUARIOS REGISTRADOS.
			
			Iterator iteraciones = session.createQuery("select count(*) from Usuario").iterate();
			
			while(iteraciones.hasNext()) {
				Long cuenta = (Long)iteraciones.next();
				
				System.out.println("El total de Usuarios son: " + cuenta + " Usuarios.");  //sysout("count del Usuario : " + cuenta);
			}
			
			tx.commit();
			tx = null;
			
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			System.out.println("Could not acquire message " + e);
		} finally {
			session.close();
		}
	}
}
