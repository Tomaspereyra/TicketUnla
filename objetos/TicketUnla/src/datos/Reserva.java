package datos;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
	
	private Funcion funcion;
	private Cliente cliente;
	private int idReserva;
	private List<Sector> lstSectorReservado;
	
	
	public Reserva() {
		
	}


	public Reserva(Funcion funcion, Cliente cliente, int idReserva) {
	
		this.funcion = funcion;
		this.cliente = cliente;
		this.idReserva = idReserva;
		this.lstSectorReservado = new ArrayList<Sector>();
	}


	public Funcion getFuncion() {
		return funcion;
	}


	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Sector> getlstSectorReservado() {
		return lstSectorReservado;
	}


	public void setlstSectorReservado(ArrayList<Sector> lstSectorReservado) {
		this.lstSectorReservado = lstSectorReservado;
	}

	
	protected void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	
	public int getIdReserva() {
		return idReserva;
	}

  
	
	
}
