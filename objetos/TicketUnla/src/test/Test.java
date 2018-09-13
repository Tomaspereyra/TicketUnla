package test;

import dao.ClienteDao;
import dao.UsuarioDao;
import datos.Cliente;
import datos.Usuario;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario u = new Usuario("asdas", "asadd", "qweqwe");
		UsuarioDao.getIntance().agregar(u);

		Usuario bus = UsuarioDao.getIntance().traerUsuario(2);

		Cliente c = new Cliente();
		c.setUsuario(bus);
		ClienteDao.getIntance().agregar(c);

	}
}
