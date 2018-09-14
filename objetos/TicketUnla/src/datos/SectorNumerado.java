package datos;

import java.util.ArrayList;
import java.util.List;

public class SectorNumerado extends Sector {

	private List<Asiento> lstAsientos;

	public SectorNumerado() {

	}

	public SectorNumerado(String tipoSector, int precio, String descripcion, int capacidadTotal, Auditorio auditorio) {
		super(tipoSector, precio, descripcion, capacidadTotal, auditorio);

		this.lstAsientos = new ArrayList<Asiento>();
	}

	public List<Asiento> getLstAsientos() {
		return lstAsientos;
	}

}
