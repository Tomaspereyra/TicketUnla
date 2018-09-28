package datos;

public class Asiento {
	private int idAsiento;
	private String codigo;
	private Sector sectorNumerado;

	public Asiento() {
		super();
	}

	public Asiento(String codigo, Sector sectorNumerado) {
		this.sectorNumerado = sectorNumerado;
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getIdAsiento() {
		return idAsiento;
	}

	protected void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}

	public Sector getSectorNumerado() {
		return sectorNumerado;
	}

	public void setSectorNumerado(Sector sectorNumerado) {
		this.sectorNumerado = sectorNumerado;
	}

}
