package datos;

import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.List;

public class Funcion {
	
	private int idFuncion;
	private GregorianCalendar horaFecha;
	private ArrayList<Reserva> lstReservas;
	private Evento evento;
	private List<Sector> lstSectores;
	
	protected Funcion() {
		
	}

	protected Funcion(int idFuncion, GregorianCalendar horaFecha, ArrayList<Reserva> lstReservas, Evento evento) {
		
		this.idFuncion = idFuncion;
		this.horaFecha = horaFecha;
		this.lstReservas = lstReservas;
		this.evento = evento;
		this.lstSectores = new ArrayList<Sector>();
	}

	public GregorianCalendar getHoraFecha() {
		return horaFecha;
	}

	public void setHoraFecha(GregorianCalendar horaFecha) {
		this.horaFecha = horaFecha;
	}

	public ArrayList<Reserva> getLstReservas() {
		return lstReservas;
	}

	public void setLstReservas(ArrayList<Reserva> lstReservas) {
		this.lstReservas = lstReservas;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public List<Sector> getLstSectores() {
		return lstSectores;
	}

	public void setLstSectores(ArrayList<Sector> lstSectores) {
		this.lstSectores = lstSectores;
	}

	public int getIdFuncion() {
		return idFuncion;
	}

	protected void setIdFuncion(int idFuncion) {
		this.idFuncion = idFuncion;
	}
	
	
	
}
