package datos;

import java.util.Set;

public class Reserva {

	private Funcion funcion;
	private Cliente cliente;
	private int idReserva;
	private Set<Ubicacion> lstUbicacionesReservadas;

	public Reserva() {

	}

	public Reserva(Funcion funcion, Cliente cliente) {

		this.funcion = funcion;
		this.cliente = cliente;
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

	protected void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public Set<Ubicacion> getLstUbicacionesReservadas() {
		return lstUbicacionesReservadas;
	}

	public void setLstUbicacionesReservadas(Set<Ubicacion> lstUbicacionesReservadas) {
		this.lstUbicacionesReservadas = lstUbicacionesReservadas;
	}

}
