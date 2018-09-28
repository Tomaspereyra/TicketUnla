package negocio;

import dao.AsientoDao;
import datos.Asiento;

public class AsientoABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static AsientoABM instancia = null;

	protected AsientoABM() {
	}

	public static AsientoABM getIntance() {
		if (instancia == null)
			instancia = new AsientoABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(Asiento a) throws Exception {
		if (a == null)
			throw new Exception("ERROR, el Asiento ingresado es nulo.");

		Asiento buscado = AsientoDao.getIntance().traerAsiento(a.getCodigo());
		if (buscado != null)
			throw new Exception("ERROR, el Asiento ingresado ya existe.");

		return AsientoDao.getIntance().agregar(a);
	}

	public void actualizar(Asiento a) throws Exception {
		if (a == null)
			throw new Exception("ERROR, el Asiento ingresado es nulo.");

		Asiento buscado = AsientoDao.getIntance().traerAsiento(a.getCodigo());
		if (buscado == null)
			throw new Exception("ERROR, el Asiento ingresado no existe.");

		AsientoDao.getIntance().actualizar(a);
	}

	public void eliminar(Asiento a) throws Exception {
		if (a == null)
			throw new Exception("ERROR, el Asiento ingresado es nulo.");

		Asiento buscado = AsientoDao.getIntance().traerAsiento(a.getCodigo());
		if (buscado == null)
			throw new Exception("ERROR, el Asiento ingresado no existe.");

		AsientoDao.getIntance().eliminar(a);
	}

	public Asiento traerAsiento(String codigo) throws Exception {

		Asiento buscado = AsientoDao.getIntance().traerAsiento(codigo);
		if (buscado == null)
			throw new Exception("ERROR, el codigo ingresado no existe.");

		return buscado;
	}

}
