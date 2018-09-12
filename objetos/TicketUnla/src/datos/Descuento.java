package datos;

public class Descuento {
	
	private int idDescuento;
	private int porcentajeDescuento;
	private String codigo;
	
	
	public Descuento() {
		
	}


	public Descuento(int idDescuento, int porcentajeDescuento, String codigo) {
		
		this.idDescuento = idDescuento;
		this.porcentajeDescuento = porcentajeDescuento;
		this.codigo = codigo;
	}


	public int getPorcentajeDescuento() {
		return porcentajeDescuento;
	}


	public void setPorcentajeDescuento(int porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	protected void setidDescuento(int idDescuento) {
		this.idDescuento = idDescuento;
	}
	
	public int getidDescuento() {
		return idDescuento;
	}
	
	
}
