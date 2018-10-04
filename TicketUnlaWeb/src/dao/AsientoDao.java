package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import datos.Asiento;
import datos.SectorNumerado;

public class AsientoDao {
	private static Session session;
	private Transaction tx;

	/*-----------------PATRON SINGLETON-----------------*/

	private static AsientoDao instancia = null;

	protected AsientoDao() {
	}

	public static AsientoDao getIntance() {
		if (instancia == null)
			instancia = new AsientoDao();
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

	public int agregar(Asiento objeto) {
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

	public void actualizar(Asiento objeto) throws HibernateException {
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

	public void eliminar(Asiento objeto) throws HibernateException {
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

	public Asiento traerAsiento(String codigo) throws HibernateException {
		Asiento objeto = null;

		try {
			iniciaOperacion();
			objeto = (Asiento) session.createQuery("from Asiento a where a.codigo=" + codigo).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
	
	@SuppressWarnings("unchecked")
	public List<Asiento> traerAsientos(SectorNumerado s){
		List<Asiento> lista=null;
		try {
			iniciaOperacion();
			String hql="from Asiento a inner join fetch a.sectorNumerado s where s.idSector="+s.getIdSector();
			lista = session.createQuery(hql).list();
		}
		finally {
			session.close();
		}
		return lista;
	}

}
