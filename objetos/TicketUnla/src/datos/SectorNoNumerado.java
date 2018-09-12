package datos;

public class SectorNoNumerado extends Sector {
	private int capacidadDisponible;

	public SectorNoNumerado(int capacidadDisponible, String tipoSector, int idSector, int precio, String descripcion, int capacidadTotal) {
		super(tipoSector, idSector, precio, descripcion, capacidadTotal);
		this.capacidadDisponible = capacidadDisponible;
	}

	public int getCapacidadDisponible() {
		return capacidadDisponible;
	}

	public void setCapacidadDisponible(int capacidadDisponible) {
		this.capacidadDisponible = capacidadDisponible;
	}
	


	
	

}
