package datos;

public class Usuario {

	private int idUsuario;
	private String usuario;
	private String contrasena;
	private String email;

	public Usuario() {
	}

	public Usuario(String usuario, String contrasena, String email) {
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	protected void setidUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getidUsuario() {
		return idUsuario;
	}

}
