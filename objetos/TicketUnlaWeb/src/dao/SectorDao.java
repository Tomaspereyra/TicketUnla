package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Auditorio;
import datos.Sector;
import datos.SectorNumerado;

public class SectorDao {
	private static Session session;
	private Transaction tx;

	/*-----------------PATRON SINGLETON-----------------*/

	private static SectorDao instancia = null;

	protected SectorDao() {
	}

	public static SectorDao getIntance() {
		if (instancia == null)
			instancia = new SectorDao();
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

	public int agregar(Sector objeto) {
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

	public void actualizar(Sector objeto) throws HibernateException {
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

	public void eliminar(Sector objeto) throws HibernateException {
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

	public Sector traerSector(int idSector) throws HibernateException {
		Sector objeto = null;

		try {
			iniciaOperacion();
			objeto = (Sector) session.get(Sector.class, idSector);
		} finally {
			session.close();
		}
		return objeto;
	}
	@SuppressWarnings("unchecked")
	public List<SectorNumerado> traerSectores(Auditorio a) throws HibernateException{
		List<SectorNumerado> sectores = null;
		try {
			iniciaOperacion();
			sectores = session.createQuery("from Sector s inner join fetch s.auditorio s where s.idauditorio="+a.getidauditorio()).list();
		}
		finally {
			session.close();
		}
		return sectores;
	}
	

}