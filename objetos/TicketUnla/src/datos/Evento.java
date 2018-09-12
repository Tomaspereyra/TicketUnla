package datos;
import java.util.ArrayList;
import java.util.List;

public class Evento {
	
	private int idEvento;
	private String nombre;
	private List<Funcion> lstFunciones;
	private String tipoEvento;
	private List<Descuento> lstDescuentos;
	private Auditorio auditorio;
	
	protected Evento() {
		
	}

	protected Evento(String nombre, String tipoEvento, Auditorio auditorio) {
		
		this.nombre = nombre;
		this.lstFunciones = new ArrayList<Funcion>();
		this.tipoEvento = tipoEvento;
		this.lstDescuentos = new ArrayList<Descuento>();
		this.auditorio = auditorio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Funcion> getLstFunciones() {
		return lstFunciones;
	}

	public void setLstFunciones(ArrayList<Funcion> lstFunciones) {
		this.lstFunciones = lstFunciones;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public List<Descuento> getLstDescuentos() {
		return lstDescuentos;
	}

	public void setLstDescuentos(ArrayList<Descuento> lstDescuentos) {
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
