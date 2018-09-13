package datos;

public class Vendedor {
	private int idVendedor;
	private Usuario usuario;

	public Vendedor() {

	}

	public Vendedor(Usuario usuario) {

		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
