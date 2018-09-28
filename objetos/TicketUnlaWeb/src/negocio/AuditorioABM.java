package negocio;

import dao.AuditorioDao;
import datos.Auditorio;

public class AuditorioABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static AuditorioABM instancia = null;

	protected AuditorioABM() {
	}

	public static AuditorioABM getIntance() {
		if (instancia == null)
			instancia = new AuditorioABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(Auditorio a) throws Exception {
		if (a == null)
			throw new Exception("ERROR, el Auditorio ingresado es nulo.");

		Auditorio buscado = AuditorioDao.getIntance().traerAuditorio(a.getNombre());
		if (buscado != null)
			throw new Exception("ERROR, el Auditorio ingresado ya existe.");

		return AuditorioDao.getIntance().agregar(a);
	}

	public void actualizar(Auditorio a) throws Exception {
		if (a == null)
			throw new Exception("ERROR, el Auditorio ingresado es nulo.");

		Auditorio buscado = AuditorioDao.getIntance().traerAuditorio(a.getNombre());
		if (buscado == null)
			throw new Exception("ERROR, el Auditorio ingresado no existe.");

		AuditorioDao.getIntance().actualizar(a);
	}

	public void eliminar(Auditorio a) throws Exception {
		if (a == null)
			throw new Exception("ERROR, el Auditorio ingresado es nulo.");

		Auditorio buscado = AuditorioDao.getIntance().traerAuditorio(a.getNombre());
		if (buscado == null)
			throw new Exception("ERROR, el Auditorio ingresado no existe.");

		AuditorioDao.getIntance().eliminar(a);
	}

	public Auditorio traerAsiento(String nombre) throws Exception {

		Auditorio buscado = AuditorioDao.getIntance().traerAuditorio(nombre);
		if (buscado == null)
			throw new Exception("ERROR, el nombre ingresado no existe.");

		return buscado;
	}

}
