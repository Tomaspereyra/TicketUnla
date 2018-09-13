package test;

import dao.AuditorioDao;
import dao.ClienteDao;
import dao.DescuentoDao;
import dao.EventoDao;
import dao.UsuarioDao;
import datos.Auditorio;
import datos.Cliente;
import datos.Descuento;
import datos.Evento;
import datos.Usuario;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario u = new Usuario("asdas", "asadd", "qweqwe");
		UsuarioDao.getIntance().agregar(u);

		Usuario bus = UsuarioDao.getIntance().traerUsuario(1);

		Cliente c = new Cliente();
		c.setUsuario(bus);
		ClienteDao.getIntance().agregar(c);

		Auditorio auditorio = new Auditorio();
		AuditorioDao.getIntance().agregar(auditorio);
		auditorio = AuditorioDao.getIntance().traerAuditorio(1);

		Evento e = new Evento("Boca", "Futbol", auditorio);

		EventoDao.getIntance().agregar(e);
		e = EventoDao.getIntance().traerEvento(1);
		Descuento d = new Descuento(50, "uno");
		d.setEvento(e);
		DescuentoDao.getIntance().agregar(d);

	}
}
