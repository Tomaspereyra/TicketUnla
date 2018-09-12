package datos;

import java.util.ArrayList;
import java.util.List;

public class SectorNumerado  extends Sector{
	
	private List<Asiento> lstAsientos;

	public SectorNumerado() {
	
	}

	public SectorNumerado(String tipoSector, int idSector, int precio, String descripcion, int capacidadTotal) {
		super(tipoSector,idSector,precio,descripcion,capacidadTotal);
		
		this.lstAsientos = new ArrayList<Asiento>();
	}

	public List<Asiento> getLstAsientos() {
		return lstAsientos;
	}
	
	
	
	
}
