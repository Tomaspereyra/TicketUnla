package datos;

public class SectorNoNumerado extends Sector {
	private int capacidadDisponible;

	public SectorNoNumerado() {
		super();
	}

	public SectorNoNumerado(int capacidadDisponible, String tipoSector, int precio, String descripcion,
			Auditorio auditorio, int capacidadTotal) {
		super(tipoSector, precio, descripcion, capacidadTotal, auditorio);
		this.capacidadDisponible = capacidadDisponible;
	}

	public int getCapacidadDisponible() {
		return capacidadDisponible;
	}

	public void setCapacidadDisponible(int capacidadDisponible) {
		this.capacidadDisponible = capacidadDisponible;
	}

}
