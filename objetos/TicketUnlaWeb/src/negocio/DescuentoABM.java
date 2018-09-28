package negocio;

import dao.DescuentoDao;
import datos.Descuento;

public class DescuentoABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static DescuentoABM instancia = null;

	protected DescuentoABM() {
	}

	public static DescuentoABM getIntance() {
		if (instancia == null)
			instancia = new DescuentoABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(Descuento d) throws Exception {
		if (d == null)
			throw new Exception("ERROR, el Descuento ingresado es nulo.");

		Descuento buscado = DescuentoDao.getIntance().traerDescuento(d.getCodigo());
		if (buscado != null)
			throw new Exception("ERROR, el Descuento ingresado ya existe.");

		return DescuentoDao.getIntance().agregar(d);
	}

	public void actualizar(Descuento d) throws Exception {
		if (d == null)
			throw new Exception("ERROR, el Descuento ingresado es nulo.");

		Descuento buscado = DescuentoDao.getIntance().traerDescuento(d.getCodigo());
		if (buscado == null)
			throw new Exception("ERROR, el Descuento ingresado no existe.");

		DescuentoDao.getIntance().actualizar(d);
	}

	public void eliminar(Descuento d) throws Exception {
		if (d == null)
			throw new Exception("ERROR, el Descuento ingresado es nulo.");

		Descuento buscado = DescuentoDao.getIntance().traerDescuento(d.getCodigo());
		if (buscado == null)
			throw new Exception("ERROR, el Descuento ingresado no existe.");

		DescuentoDao.getIntance().eliminar(d);
	}

	public Descuento traerDescuento(String nombre) throws Exception {

		Descuento buscado = DescuentoDao.getIntance().traerDescuento(nombre);
		if (buscado == null)
			throw new Exception("ERROR, el nombre ingresado no existe.");

		return buscado;
	}

}
