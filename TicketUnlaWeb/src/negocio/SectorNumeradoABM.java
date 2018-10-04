package negocio;

import dao.SectorNumeradoDao;
import datos.SectorNumerado;

public class SectorNumeradoABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static SectorNumeradoABM instancia = null;

	protected SectorNumeradoABM() {
	}

	public static SectorNumeradoABM getIntance() {
		if (instancia == null)
			instancia = new SectorNumeradoABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(SectorNumerado s) throws Exception {
		if (s == null)
			throw new Exception("ERROR, el SectorNumerado ingresado es nulo.");

		SectorNumerado buscado = SectorNumeradoDao.getIntance().traerSectorNumerado(s.getIdSector());
		if (buscado != null)
			throw new Exception("ERROR, el SectorNumerado ingresado ya existe.");

		return SectorNumeradoDao.getIntance().agregar(s);
	}

	public void actualizar(SectorNumerado s) throws Exception {
		if (s == null)
			throw new Exception("ERROR, el SectorNumerado ingresado es nulo.");

		SectorNumerado buscado = SectorNumeradoDao.getIntance().traerSectorNumerado(s.getIdSector());
		if (buscado == null)
			throw new Exception("ERROR, el SectorNumerado ingresado no existe.");

		SectorNumeradoDao.getIntance().actualizar(s);
	}

	public void eliminar(SectorNumerado s) throws Exception {
		if (s == null)
			throw new Exception("ERROR, el SectorNumerado ingresado es nulo.");

		SectorNumerado buscado = SectorNumeradoDao.getIntance().traerSectorNumerado(s.getIdSector());
		if (buscado == null)
			throw new Exception("ERROR, el SectorNumerado ingresado no existe.");

		SectorNumeradoDao.getIntance().eliminar(s);
	}

	public SectorNumerado traerSectorNumerado(int idSectorNumerado) throws Exception {

		SectorNumerado buscado = SectorNumeradoDao.getIntance().traerSectorNumerado(idSectorNumerado);
		if (buscado == null)
			throw new Exception("ERROR, el SectorNumerado ingresado no existe.");

		return buscado;
	}

}