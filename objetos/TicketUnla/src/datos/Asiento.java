package datos;

public class Asiento {
       private int idAsiento;
       private String codigo;
	
       
    public Asiento() {
		super();
	}
	public Asiento(String codigo) {
		
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
    
}
