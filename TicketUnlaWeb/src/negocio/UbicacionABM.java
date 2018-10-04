package negocio;

import dao.UbicacionDao;
import datos.Ubicacion;

public class UbicacionABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static UbicacionABM instancia = null;

	protected UbicacionABM() {
	}

	public static UbicacionABM getIntance() {
		if (instancia == null)
			instancia = new UbicacionABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(Ubicacion u) throws Exception {
		if (u == null)
			throw new Exception("ERROR, la Ubicacion ingresada es nula.");

		Ubicacion buscado = UbicacionDao.getIntance().traerUbicacion(u.getIdUbicacion());
		if (buscado != null)
			throw new Exception("ERROR, la Ubicacion ya existe.");

		return UbicacionDao.getIntance().agregar(u);
	}

	public void actualizar(Ubicacion u) throws Exception {
		if (u == null)
			throw new Exception("ERROR, la Ubicacion ingresada es nula.");

		Ubicacion buscado = UbicacionDao.getIntance().traerUbicacion(u.getIdUbicacion());
		if (buscado == null)
			throw new Exception("ERROR, La Ubicacion ingresada no existe.");

		UbicacionDao.getIntance().actualizar(u);
	}

	public void eliminar(Ubicacion u) throws Exception {
		if (u == null)
			throw new Exception("ERROR, la Ubicacion ingresada es nula.");

		Ubicacion buscado = UbicacionDao.getIntance().traerUbicacion(u.getIdUbicacion());
		if (buscado == null)
			throw new Exception("ERROR, la Ubicacion ingresada es nula");

		UbicacionDao.getIntance().eliminar(u);
	}

	public Ubicacion traerUbicacion(int idUbicacion) throws Exception {

		Ubicacion buscado = UbicacionDao.getIntance().traerUbicacion(idUbicacion);
		if (buscado == null)
			throw new Exception("ERROR, la Ubicacion ingresada no existe.");

		return buscado;
	}

}