package negocio;

import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static ClienteABM instancia = null;

	protected ClienteABM() {
	}

	public static ClienteABM getIntance() {
		if (instancia == null)
			instancia = new ClienteABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(Cliente c) throws Exception {
		if (c == null)
			throw new Exception("ERROR, el cliente ingresado es nulo.");

		Cliente buscado = ClienteDao.getIntance().traerCliente(c.getDni());
		if (buscado != null)
			throw new Exception("ERROR, el cliente ingresado ya existe.");

		return ClienteDao.getIntance().agregar(c);
	}

	public void actualizar(Cliente c) throws Exception {
		if (c == null)
			throw new Exception("ERROR, el cliente ingresado es nulo.");

		Cliente buscado = ClienteDao.getIntance().traerCliente(c.getDni());
		if (buscado == null)
			throw new Exception("ERROR, el cliente ingresado no existe.");

		ClienteDao.getIntance().actualizar(c);
	}

	public void eliminar(Cliente c) throws Exception {
		if (c == null)
			throw new Exception("ERROR, el cliente ingresado es nulo.");

		Cliente buscado = ClienteDao.getIntance().traerCliente(c.getDni());
		if (buscado == null)
			throw new Exception("ERROR, el cliente ingresado no existe.");

		ClienteDao.getIntance().eliminar(c);
	}

	public Cliente traerCliente(int idCliente) throws Exception {

		Cliente buscado = ClienteDao.getIntance().traerCliente(idCliente);
		if (buscado == null)
			throw new Exception("ERROR, el ID ingresado no existe.");

		return buscado;
	}

}
