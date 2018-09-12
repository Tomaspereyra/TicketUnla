package datos;

public class Administrador {
	
	private Usuario usuario;

	public Administrador() {

	}

	public Administrador(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
