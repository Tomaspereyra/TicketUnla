package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.SectorNoNumerado;

public class SectorNoNumeradoDao {
	private static Session session;
	private Transaction tx;

	/*-----------------PATRON SINGLETON-----------------*/

	private static SectorNoNumeradoDao instancia = null;

	protected SectorNoNumeradoDao() {
	}

	public static SectorNoNumeradoDao getIntance() {
		if (instancia == null)
			instancia = new SectorNoNumeradoDao();
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

	public int agregar(SectorNoNumerado objeto) {
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

	public void actualizar(SectorNoNumerado objeto) throws HibernateException {
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

	public void eliminar(SectorNoNumerado objeto) throws HibernateException {
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

	public SectorNoNumerado traerSectorNoNumerado(int idSectorNoNumerado) throws HibernateException {
		SectorNoNumerado objeto = null;

		try {
			iniciaOperacion();
			objeto = (SectorNoNumerado) session.get(SectorNoNumerado.class, idSectorNoNumerado);
		} finally {
			session.close();
		}
		return objeto;
	}

}
