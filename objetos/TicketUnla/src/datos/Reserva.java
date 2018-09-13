package datos;

import java.util.Set;

public class Reserva {

	private Funcion funcion;
	private Cliente cliente;
	private int idReserva;
	private Set<Sector> lstSectorReservado;

	public Reserva() {

	}

	public Reserva(Funcion funcion, Cliente cliente, int idReserva) {

		this.funcion = funcion;
		this.cliente = cliente;
		this.idReserva = idReserva;
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

	public Set<Sector> getlstSectorReservado() {
		return lstSectorReservado;
	}

	public void setlstSectorReservado(Set<Sector> lstSectorReservado) {
		this.lstSectorReservado = lstSectorReservado;
	}

	protected void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdReserva() {
		return idReserva;
	}

}
