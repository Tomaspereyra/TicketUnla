package negocio;

import dao.SectorDao;
import datos.Sector;

public class SectorABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static SectorABM instancia = null;

	protected SectorABM() {
	}

	public static SectorABM getIntance() {
		if (instancia == null)
			instancia = new SectorABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(Sector s) throws Exception {
		if (s == null)
			throw new Exception("ERROR, el Sector ingresado es nulo.");

		Sector buscado = SectorDao.getIntance().traerSector(s.getIdSector());
		if (buscado != null)
			throw new Exception("ERROR, el Sector ingresado ya existe.");

		return SectorDao.getIntance().agregar(s);
	}

	public void actualizar(Sector s) throws Exception {
		if (s == null)
			throw new Exception("ERROR, el Sector ingresado es nulo.");

		Sector buscado = SectorDao.getIntance().traerSector(s.getIdSector());
		if (buscado == null)
			throw new Exception("ERROR, el Sector ingresado no existe.");

		SectorDao.getIntance().actualizar(s);
	}

	public void eliminar(Sector s) throws Exception {
		if (s == null)
			throw new Exception("ERROR, el Sector ingresado es nulo.");

		Sector buscado = SectorDao.getIntance().traerSector(s.getIdSector());
		if (buscado == null)
			throw new Exception("ERROR, el Sector ingresado no existe.");

		SectorDao.getIntance().eliminar(s);
	}

	public Sector traerSector(int idSector) throws Exception {

		Sector buscado = SectorDao.getIntance().traerSector(idSector);
		if (buscado == null)
			throw new Exception("ERROR, el Sector ingresado no existe.");

		return buscado;
	}

}