package negocio;

import dao.EventoDao;
import datos.Evento;

public class EventoABM {
	/*-----------------PATRON SINGLETON-----------------*/

	private static EventoABM instancia = null;

	protected EventoABM() {
	}

	public static EventoABM getIntance() {
		if (instancia == null)
			instancia = new EventoABM();
		return instancia;
	}

	/*--------------------------------------------------*/

	public int agregar(Evento e) throws Exception {
		if (e == null)
			throw new Exception("ERROR, el Evento ingresado es nulo.");

		Evento buscado = EventoDao.getIntance().traerEvento(e.getNombre());
		if (buscado != null)
			throw new Exception("ERROR, el Evento ingresado ya existe.");

		return EventoDao.getIntance().agregar(e);
	}

	public void actualizar(Evento e) throws Exception {
		if (e == null)
			throw new Exception("ERROR, el Evento ingresado es nulo.");

		Evento buscado = EventoDao.getIntance().traerEvento(e.getNombre());
		if (buscado == null)
			throw new Exception("ERROR, el Evento ingresado no existe.");

		EventoDao.getIntance().actualizar(e);
	}

	public void eliminar(Evento e) throws Exception {
		if (e == null)
			throw new Exception("ERROR, el Evento ingresado es nulo.");

		Evento buscado = EventoDao.getIntance().traerEvento(e.getNombre());
		if (buscado == null)
			throw new Exception("ERROR, el Evento ingresado no existe.");

		EventoDao.getIntance().eliminar(e);
	}

	public Evento traerEvento(String nombre) throws Exception {

		Evento buscado = EventoDao.getIntance().traerEvento(nombre);
		if (buscado == null)
			throw new Exception("ERROR, el nombre del Evento ingresado no existe.");

		return buscado;
	}

}