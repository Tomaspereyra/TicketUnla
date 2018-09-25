package negocio;

import dao.UsuarioDao;
import datos.Usuario;

public class UsuarioABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static UsuarioABM instancia = null;

	protected UsuarioABM() {
	}

	public static UsuarioABM getIntance() {
		if (instancia == null)
			instancia = new UsuarioABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(Usuario u) throws Exception {
		if (u == null)
			throw new Exception("ERROR, el Usuario ingresado es nulo.");

		Usuario buscado = UsuarioDao.getIntance().traerUsuario(u.getUsuario());
		if (buscado != null)
			throw new Exception("ERROR, el Usuario ingresado ya existe.");

		return UsuarioDao.getIntance().agregar(u);
	}

	public void actualizar(Usuario u) throws Exception {
		if (u == null)
			throw new Exception("ERROR, el Usuario ingresado es nulo.");

		Usuario buscado = UsuarioDao.getIntance().traerUsuario(u.getUsuario());
		if (buscado == null)
			throw new Exception("ERROR, el Usuario ingresado no existe.");

		UsuarioDao.getIntance().actualizar(u);
	}

	public void eliminar(Usuario u) throws Exception {
		if (u == null)
			throw new Exception("ERROR, el Usuario ingresado es nulo.");

		Usuario buscado = UsuarioDao.getIntance().traerUsuario(u.getUsuario());
		if (buscado == null)
			throw new Exception("ERROR, el Usuario ingresado no existe.");

		UsuarioDao.getIntance().eliminar(u);
	}

	public Usuario traerUsuario(String usuario) throws Exception {

		Usuario buscado = UsuarioDao.getIntance().traerUsuario(usuario);
		if (buscado == null)
			throw new Exception("ERROR, el idUsuario ingresado no existe.");

		return buscado;
	}

}