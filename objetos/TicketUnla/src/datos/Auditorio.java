package datos;

import java.util.Set;

public class Auditorio {

	private int idAuditorio;
	private String nombre;
	private String direccion;
	private int capacidad;
	private String tipoAuditorio;
	private Set<Evento> lstEventos;
	private Set<Funcion> lstFunciones;

	public Auditorio() {

	}

	public Auditorio(String nombre, String direccion, int capacidad, String tipoAuditorio) {

		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidad = capacidad;
		this.tipoAuditorio = tipoAuditorio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipoAuditorio() {
		return tipoAuditorio;
	}

	public void setTipoAuditorio(String tipoAuditorio) {
		this.tipoAuditorio = tipoAuditorio;
	}

	public Set<Evento> getLstEventos() {
		return lstEventos;
	}

	public void setLstEventos(Set<Evento> lstEventos) {
		this.lstEventos = lstEventos;
	}

	public Set<Funcion> getLstFunciones() {
		return lstFunciones;
	}

	public void setLstFunciones(Set<Funcion> lstFunciones) {
		this.lstFunciones = lstFunciones;
	}

	public int getIdAuditorio() {
		return idAuditorio;
	}

	protected void setIdAuditorio(int idAuditorio) {
		this.idAuditorio = idAuditorio;
	}

}
