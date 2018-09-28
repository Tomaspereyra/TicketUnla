package datos;

import java.util.Set;

public class SectorNumerado extends Sector {

	private Set<Asiento> lstAsientos;

	public SectorNumerado() {

	}

	public SectorNumerado(String tipoSector, int precio, String descripcion, int capacidadTotal, Auditorio auditorio) {
		super(tipoSector, precio, descripcion, capacidadTotal, auditorio);
	}

	public Set<Asiento> getLstAsientos() {
		return lstAsientos;
	}

	public void setLstAsientos(Set<Asiento> lstAsientos) {
		this.lstAsientos = lstAsientos;
	}

}
