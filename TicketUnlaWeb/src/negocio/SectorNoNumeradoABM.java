package negocio;

import dao.SectorNoNumeradoDao;
import datos.SectorNoNumerado;

public class SectorNoNumeradoABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static SectorNoNumeradoABM instancia = null;

	protected SectorNoNumeradoABM() {
	}

	public static SectorNoNumeradoABM getIntance() {
		if (instancia == null)
			instancia = new SectorNoNumeradoABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(SectorNoNumerado s) throws Exception {
		if (s == null)
			throw new Exception("ERROR, el SectorNoNumerado ingresado es nulo.");

		SectorNoNumerado buscado = SectorNoNumeradoDao.getIntance().traerSectorNoNumerado(s.getIdSector());
		if (buscado != null)
			throw new Exception("ERROR, el SectorNoNumerado ingresado ya existe.");

		return SectorNoNumeradoDao.getIntance().agregar(s);
	}

	public void actualizar(SectorNoNumerado s) throws Exception {
		if (s == null)
			throw new Exception("ERROR, el SectorNoNumerado ingresado es nulo.");

		SectorNoNumerado buscado = SectorNoNumeradoDao.getIntance().traerSectorNoNumerado(s.getIdSector());
		if (buscado == null)
			throw new Exception("ERROR, el SectorNoNumerado ingresado no existe.");

		SectorNoNumeradoDao.getIntance().actualizar(s);
	}

	public void eliminar(SectorNoNumerado s) throws Exception {
		if (s == null)
			throw new Exception("ERROR, el SectorNoNumerado ingresado es nulo.");

		SectorNoNumerado buscado = SectorNoNumeradoDao.getIntance().traerSectorNoNumerado(s.getIdSector());
		if (buscado == null)
			throw new Exception("ERROR, el SectorNoNumerado ingresado no existe.");

		SectorNoNumeradoDao.getIntance().eliminar(s);
	}

	public SectorNoNumerado traerSectorNoNumerado(int idSectorNoNumerado) throws Exception {

		SectorNoNumerado buscado = SectorNoNumeradoDao.getIntance().traerSectorNoNumerado(idSectorNoNumerado);
		if (buscado == null)
			throw new Exception("ERROR, el SectorNoNumerado ingresado no existe.");

		return buscado;
	}

}