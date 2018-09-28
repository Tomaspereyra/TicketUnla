package datos;

import java.util.Set;

public class Evento {

	private int idEvento;
	private String nombre;
	private Set<Funcion> lstFunciones;
	private String tipoEvento;
	private Set<Descuento> lstDescuentos;
	private Auditorio auditorio;

	public Evento() {

	}

	public Evento(String nombre, String tipoEvento, Auditorio auditorio) {

		this.nombre = nombre;
		this.tipoEvento = tipoEvento;
		this.auditorio = auditorio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Funcion> getLstFunciones() {
		return lstFunciones;
	}

	public void setLstFunciones(Set<Funcion> lstFunciones) {
		this.lstFunciones = lstFunciones;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Set<Descuento> getLstDescuentos() {
		return lstDescuentos;
	}

	public void setLstDescuentos(Set<Descuento> lstDescuentos) {
		this.lstDescuentos = lstDescuentos;
	}

	public Auditorio getAuditorio() {
		return auditorio;
	}

	public void setAuditorio(Auditorio auditorio) {
		this.auditorio = auditorio;
	}

	public int getIdEvento() {
		return idEvento;
	}

	protected void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

}
