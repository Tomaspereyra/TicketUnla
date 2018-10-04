package negocio;

import dao.FuncionDao;
import datos.Funcion;

public class FuncionABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static FuncionABM instancia = null;

	protected FuncionABM() {
	}

	public static FuncionABM getIntance() {
		if (instancia == null)
			instancia = new FuncionABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(Funcion f) throws Exception {
		if (f == null)
			throw new Exception("ERROR, la Funcion ingresada es nula.");

		Funcion buscado = FuncionDao.getIntance().traerFuncion(f.getIdFuncion());
		if (buscado != null)
			throw new Exception("ERROR, la Funcion ingresada ya existe.");

		return FuncionDao.getIntance().agregar(f);
	}

	public void actualizar(Funcion f) throws Exception {
		if (f == null)
			throw new Exception("ERROR, la Funcion ingresada es nula.");

		Funcion buscado = FuncionDao.getIntance().traerFuncion(f.getIdFuncion());
		if (buscado == null)
			throw new Exception("ERROR, la Funcion ingresada no existe.");

		FuncionDao.getIntance().actualizar(f);
	}

	public void eliminar(Funcion f) throws Exception {
		if (f == null)
			throw new Exception("ERROR, la Funcion ingresada es nula.");

		Funcion buscado = FuncionDao.getIntance().traerFuncion(f.getIdFuncion());
		if (buscado == null)
			throw new Exception("ERROR, la Funcion ingresada no existe.");

		FuncionDao.getIntance().eliminar(f);
	}

	public Funcion traerFuncion(int idFuncion) throws Exception {

		Funcion buscado = FuncionDao.getIntance().traerFuncion(idFuncion);
		if (buscado == null)
			throw new Exception("ERROR, el nombre de la Funcion ingresada no existe.");

		return buscado;
	}

}