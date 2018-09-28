package negocio;

import dao.AdministradorDao;
import datos.Administrador;

public class AdministradorABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static AdministradorABM instancia = null;

	protected AdministradorABM() {
	}

	public static AdministradorABM getIntance() {
		if (instancia == null)
			instancia = new AdministradorABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(Administrador a) throws Exception {
		if (a == null)
			throw new Exception("ERROR, el Administrador ingresado es nulo.");

		Administrador buscado = AdministradorDao.getIntance().traerAdministrador(a.getUsuario().getidUsuario());
		if (buscado != null)
			throw new Exception("ERROR, el Administrador ingresado ya existe.");

		return AdministradorDao.getIntance().agregar(a);
	}

	public void actualizar(Administrador a) throws Exception {
		if (a == null)
			throw new Exception("ERROR, el Administrador ingresado es nulo.");

		Administrador buscado = AdministradorDao.getIntance().traerAdministrador(a.getUsuario().getidUsuario());
		if (buscado == null)
			throw new Exception("ERROR, el Administrador ingresado no existe.");

		AdministradorDao.getIntance().actualizar(a);
	}

	public void eliminar(Administrador a) throws Exception {
		if (a == null)
			throw new Exception("ERROR, el Administrador ingresado es nulo.");

		Administrador buscado = AdministradorDao.getIntance().traerAdministrador(a.getUsuario().getidUsuario());
		if (buscado == null)
			throw new Exception("ERROR, el Administrador ingresado no existe.");

		AdministradorDao.getIntance().eliminar(a);
	}

	public Administrador traerAdministrador(int idAdministrador) throws Exception {

		Administrador buscado = AdministradorDao.getIntance().traerAdministrador(idAdministrador);
		if (buscado == null)
			throw new Exception("ERROR, el idAdministrador ingresado no existe.");

		return buscado;
	}

}