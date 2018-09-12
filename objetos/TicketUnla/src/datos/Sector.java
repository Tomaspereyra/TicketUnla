package datos;

public class Sector {
	
	private String tipoSector;
	private int idSector;
	private int precio;
	private String descripcion;
	private int capacidadTotal;
	
	
	public Sector() {
	
	}
	
	public Sector(String tipoSector, int idSector, int precio, String descripcion, int capacidadTotal) {
		
		this.tipoSector = tipoSector;
		this.idSector = idSector;
		this.precio = precio;
		this.descripcion = descripcion;
		this.capacidadTotal = capacidadTotal;
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

	public void setIdSector(int idSector) {
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
	
	
	

}
