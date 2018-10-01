package negocio;

import dao.ReservaDao;
import datos.Reserva;

public class ReservaABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static ReservaABM instancia = null;

	protected ReservaABM() {
	}

	public static ReservaABM getIntance() {
		if (instancia == null)
			instancia = new ReservaABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(Reserva r) throws Exception {
		if (r == null)
			throw new Exception("ERROR, la Reserva ingresado es nula.");

		Reserva buscado = ReservaDao.getIntance().traerReserva(r.getIdReserva());
		if (buscado != null)
			throw new Exception("ERROR, la Reserva ingresada ya existe.");

		return ReservaDao.getIntance().agregar(r);
	}

	public void actualizar(Reserva r) throws Exception {
		if (r == null)
			throw new Exception("ERROR, la Reserva ingresada es nula.");

		Reserva buscado = ReservaDao.getIntance().traerReserva(r.getIdReserva());
		if (buscado == null)
			throw new Exception("ERROR, la Reserva ingresada no existe.");

		ReservaDao.getIntance().actualizar(r);
	}

	public void eliminar(Reserva r) throws Exception {
		if (r == null)
			throw new Exception("ERROR, la Reserva ingresada es nula.");

		Reserva buscado = ReservaDao.getIntance().traerReserva(r.getIdReserva());
		if (buscado == null)
			throw new Exception("ERROR, la Reserva ingresada no existe.");

		ReservaDao.getIntance().eliminar(r);
	}

	public Reserva traerReserva(int idReserva) throws Exception {

		Reserva buscado = ReservaDao.getIntance().traerReserva(idReserva);
		if (buscado == null)
			throw new Exception("ERROR, el idReserva ingresada no existe.");

		return buscado;
	}

}