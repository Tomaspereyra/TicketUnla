package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Ubicacion;

public class UbicacionDao {
	private static Session session;
	private Transaction tx;

	/*-----------------PATRON SINGLETON-----------------*/

	private static UbicacionDao instancia = null;

	protected UbicacionDao() {
	}

	public static UbicacionDao getIntance() {
		if (instancia == null)
			instancia = new UbicacionDao();
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

	public int agregar(Ubicacion objeto) {
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

	public void actualizar(Ubicacion objeto) throws HibernateException {
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

	public void eliminar(Ubicacion objeto) throws HibernateException {
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

	public Ubicacion traerUbicacion(int idUbicacion) throws HibernateException {
		Ubicacion objeto = null;

		try {
			iniciaOperacion();
			objeto = (Ubicacion) session.createQuery("from ubicacion e where e.nombre=" + idUbicacion).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}

}