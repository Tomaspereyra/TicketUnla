package datos;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private int dni;
	private String nombre;
	private String apellido;
	private GregorianCalendar fechaNacimiento;
	private List<Reserva> lstReservas;
	private Usuario usuario;

	
	public Cliente() {
		
	}

	public Cliente(int dni, String nombre, String apellido, GregorianCalendar fechaNacimiento, Usuario usuario) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.lstReservas = new ArrayList<Reserva>();
		this.usuario = usuario;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public GregorianCalendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<Reserva> getLstReservas() {
		return lstReservas;
	}

	public void setLstReservas(ArrayList<Reserva> lstReservas) {
		this.lstReservas = lstReservas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
