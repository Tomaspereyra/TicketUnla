package dao;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.SectorNumerado;

public class SectorNumeradoDao {
	private static Session session;
	private Transaction tx;

	/*-----------------PATRON SINGLETON-----------------*/

	private static SectorNumeradoDao instancia = null;

	protected SectorNumeradoDao() {
	}

	public static SectorNumeradoDao getIntance() {
		if (instancia == null)
			instancia = new SectorNumeradoDao();
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

	public int agregar(SectorNumerado objeto) {
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

	public void actualizar(SectorNumerado objeto) throws HibernateException {
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

	public void eliminar(SectorNumerado objeto) throws HibernateException {
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

	public SectorNumerado traerSectorNumerado(int idSectorNumerado) throws HibernateException {
		SectorNumerado objeto = null;

		try {
			iniciaOperacion();
			objeto = (SectorNumerado) session.get(SectorNumerado.class, idSectorNumerado);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	public SectorNumerado traerSectorNumeradoYAsientos(int idSectorNumerado) throws HibernateException{
		SectorNumerado objeto = null;
		try {
			iniciaOperacion();
			String hql ="from SectorNumerado s where s.idSector="+idSectorNumerado;
			objeto = (SectorNumerado) session.createQuery(hql).uniqueResult();
			Hibernate.initialize(objeto.getLstAsientos());
		}
		finally {
			session.close();
		}
		return objeto;
		
	}

}
