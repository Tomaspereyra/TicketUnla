package datos;

public class Ubicacion {

	private int idUbicacion;
	private Sector sector;
	private String codigo;

	public Ubicacion() {
	}

	public Ubicacion(Sector sector, String codigo) {
		this.sector = sector;
		this.codigo = codigo;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getIdUbicacion() {
		return idUbicacion;
	}

	protected void setIdUbicacion(int idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	@Override
	public String toString() {
		return "Ubicacion [idUbicacion=" + idUbicacion + ", sector=" + sector + ", codigo=" + codigo + "]";
	}

}
