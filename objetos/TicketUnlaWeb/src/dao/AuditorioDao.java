package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Auditorio;

public class AuditorioDao {
	private static Session session;
	private Transaction tx;

	/*-----------------PATRON SINGLETON-----------------*/

	private static AuditorioDao instancia = null;

	protected AuditorioDao() {
	}

	public static AuditorioDao getIntance() {
		if (instancia == null)
			instancia = new AuditorioDao();
		return instancia;
	}

	/*--------------------------------------------------*/

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso de datos", he);
	}

	public int agregar(Auditorio objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}

	public void actualizar(Auditorio objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}

	public void eliminar(Auditorio objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}

	public Auditorio traerAuditorio(int id) throws HibernateException {
		Auditorio objeto = null;

		try {
			iniciaOperacion();
			objeto = (Auditorio) session.createQuery("from Auditorio a where a.idauditorio=" + id).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
	public Auditorio traerAuditorioYSectores(int idAuditorio) throws HibernateException{
		Auditorio objeto = null;
		try {
			iniciaOperacion();
			String hql="from Auditorio a where a.idauditorio="+idAuditorio;
			objeto=(Auditorio) session.createQuery(hql).uniqueResult();
			Hibernate.initialize(objeto.getLstSectores());
		}
		finally {
			session.close();
		}
		return objeto;
		
	}
	@SuppressWarnings("unchecked")
	public List<Auditorio> traerAuditorios() throws HibernateException{
		List<Auditorio> auditorios = null;
		try {
			iniciaOperacion();
			auditorios = session.createQuery("from Auditorio a order by a.nombre asc").list();
		}
		finally {
			session.close();
		}
		return auditorios;
		
	}

}