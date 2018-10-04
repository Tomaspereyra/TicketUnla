package test;

import java.util.List;

import dao.AsientoDao;
import dao.AuditorioDao;
import dao.ClienteDao;
import dao.DescuentoDao;
import dao.EventoDao;
import dao.FuncionDao;
import dao.ReservaDao;
import dao.SectorDao;
import dao.SectorNumeradoDao;
import dao.UsuarioDao;
import datos.Asiento;
import datos.Auditorio;
import datos.Cliente;
import datos.Descuento;
import datos.Evento;
import datos.Funcion;
import datos.Reserva;
import datos.Sector;
import datos.SectorNumerado;
import datos.Usuario;
import negocio.UsuarioABM;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*Usuario u = new Usuario();
		UsuarioDao.getIntance().agregar(u);*/

	    /* Usuario bus = UsuarioDao.getIntance().traerUsuario(1);
	     System.out.println(bus.getNombre());
	     SectorNumerado sectornumerado = SectorNumeradoDao.getIntance().traerSectorNumeradoYAsientos(6);
	     for(Asiento asiento:sectornumerado.getLstAsientos()) {
	    	 System.out.println(asiento.getCodigo());
	     }*/
		SectorNumerado sector = SectorNumeradoDao.getIntance().traerSectorNumeradoYAsientos(6);
		List<Asiento> lstAsientos= AsientoDao.getIntance().traerAsientos(sector);
		for(Asiento a: lstAsientos) {
			System.out.println(a.getCodigo());
		}
	     //Auditorio auditorio = AuditorioDao.getIntance().traerAuditorioYSectores(6);
	   /*  for(Sector sector : auditorio.getLstSectores()) {
	    	 System.out.println(sector.getCapacidadTotal());
	     }*/

		/*Cliente c = new Cliente();
		c.setUsuario(u);
		ClienteDao.getIntance().agregar(c);

		Auditorio auditorio = new Auditorio();
		AuditorioDao.getIntance().agregar(auditorio);
		// auditorio = AuditorioDao.getIntance().traerAuditorio(1);

		Evento e = new Evento("Boca", "Futbol", auditorio);

		EventoDao.getIntance().agregar(e);
		// e = EventoDao.getIntance().traerEvento(1);
		Descuento d = new Descuento(50, "uno");
		d.setEvento(e);
		DescuentoDao.getIntance().agregar(d);

		Funcion funcion = new Funcion(null, e);
		FuncionDao.getIntance().agregar(funcion);

		Sector s = new Sector("tipoSector", 5, "descripcion", 5, auditorio);
		// s.setAuditorio(AuditorioDao.getIntance().traerAuditorio(1));
		SectorDao.getIntance().agregar(s);

		Reserva r = new Reserva(funcion, c);
		ReservaDao.getIntance().agregar(r);*/
		/*SectorNumerado sectorNumerado = new SectorNumerado();
		sectorNumerado = SectorNumeradoDao.getIntance().traerSectorNumerado(6);
		Asiento asiento = new Asiento();
		int fila =0, columna=0;
		for (fila=0; fila<20; fila++) {
			for (columna =0; columna<10; columna++) {
				String codigo = String.format("%d%d", fila, columna);
				asiento.setCodigo(codigo);
				asiento.setSectorNumerado(sectorNumerado);
				AsientoDao.getIntance().agregar(asiento);
			}
		}*/
		
		

	}
}
