package datos;

public class Sector {

	private int idSector;
	private String tipoSector;
	private int precio;
	private String descripcion;
	private int capacidadTotal;
	private Auditorio auditorio;

	public Sector() {

	}

	public Sector(String tipoSector, int precio, String descripcion, int capacidadTotal, Auditorio auditorio) {

		this.tipoSector = tipoSector;
		this.precio = precio;
		this.descripcion = descripcion;
		this.capacidadTotal = capacidadTotal;
		this.auditorio = auditorio;

	}

	public String getTipoSector() {
		return tipoSector;
	}

	public void setTipoSector(String tipoSector) {
		this.tipoSector = tipoSector;
	}

	public int getIdSector() {
		return idSector;
	}

	protected void setIdSector(int idSector) {
		this.idSector = idSector;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCapacidadTotal() {
		return capacidadTotal;
	}

	public void setCapacidadTotal(int capacidadTotal) {
		this.capacidadTotal = capacidadTotal;
	}

	public Auditorio getAuditorio() {
		return auditorio;
	}

	public void setAuditorio(Auditorio auditorio) {
		this.auditorio = auditorio;
	}

}
