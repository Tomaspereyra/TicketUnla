package negocio;

import dao.VendedorDao;
import datos.Vendedor;

public class VendedorABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static VendedorABM instancia = null;

	protected VendedorABM() {
	}

	public static VendedorABM getIntance() {
		if (instancia == null)
			instancia = new VendedorABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(Vendedor v) throws Exception {
		if (v == null)
			throw new Exception("ERROR, el Vendedor ingresado es nulo.");

		Vendedor buscado = VendedorDao.getIntance().traerVendedor(v.getUsuario().getidUsuario());
		if (buscado != null)
			throw new Exception("ERROR, el Vendedor ingresado ya existe.");

		return VendedorDao.getIntance().agregar(v);
	}

	public void actualizar(Vendedor v) throws Exception {
		if (v == null)
			throw new Exception("ERROR, el Vendedor ingresado es nulo.");

		Vendedor buscado = VendedorDao.getIntance().traerVendedor(v.getUsuario().getidUsuario());
		if (buscado == null)
			throw new Exception("ERROR, el Vendedor ingresado no existe.");

		VendedorDao.getIntance().actualizar(v);
	}

	public void eliminar(Vendedor v) throws Exception {
		if (v == null)
			throw new Exception("ERROR, el Vendedor ingresado es nulo.");

		Vendedor buscado = VendedorDao.getIntance().traerVendedor(v.getUsuario().getidUsuario());
		if (buscado == null)
			throw new Exception("ERROR, el Vendedor ingresado no existe.");

		VendedorDao.getIntance().eliminar(v);
	}

	public Vendedor traerVendedor(int idVendedor) throws Exception {

		Vendedor buscado = VendedorDao.getIntance().traerVendedor(idVendedor);
		if (buscado == null)
			throw new Exception("ERROR, el idVendedor ingresado no existe.");

		return buscado;
	}

}