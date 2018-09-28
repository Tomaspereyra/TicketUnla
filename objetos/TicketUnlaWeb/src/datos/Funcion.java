package datos;

import java.util.GregorianCalendar;
import java.util.Set;

public class Funcion {

	private int idFuncion;
	private GregorianCalendar horaFecha;
	private Set<Reserva> lstReservas;
	private Evento evento;
	private Set<Sector> lstSectores;

	public Funcion() {

	}

	public Funcion(GregorianCalendar horaFecha, Evento evento) {

		this.horaFecha = horaFecha;
		this.evento = evento;

	}

	public GregorianCalendar getHoraFecha() {
		return horaFecha;
	}

	public void setHoraFecha(GregorianCalendar horaFecha) {
		this.horaFecha = horaFecha;
	}

	public Set<Reserva> getLstReservas() {
		return lstReservas;
	}

	public void setLstReservas(Set<Reserva> lstReservas) {
		this.lstReservas = lstReservas;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Set<Sector> getLstSectores() {
		return lstSectores;
	}

	public void setLstSectores(Set<Sector> lstSectores) {
		this.lstSectores = lstSectores;
	}

	public int getIdFuncion() {
		return idFuncion;
	}

	protected void setIdFuncion(int idFuncion) {
		this.idFuncion = idFuncion;
	}

}
