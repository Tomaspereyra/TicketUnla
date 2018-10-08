package controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AsientoDao;
import dao.FuncionDao;
import dao.SectorDao;
import dao.SectorNumeradoDao;
import dao.UsuarioDao;
import datos.Asiento;
import datos.Auditorio;
import datos.Evento;
import datos.Funcion;
import datos.Sector;
import datos.SectorNumerado;


public class ControladorSectores extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public ControladorSectores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesarSolicitud(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesarSolicitud(request,response);
	}
	
	private void procesarSolicitud(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		try {
		
			int f =	Integer.parseInt(request.getParameter("funcion"));
			Funcion funcion = FuncionDao.getIntance().traerFuncion(f);
			System.out.println("1");
			Auditorio auditorio = funcion.getEvento().getAuditorio();
			System.out.println("11");
			List<SectorNumerado> sectores = SectorDao.getIntance().traerSectores(auditorio);
			System.out.println("111");
			request.setAttribute("sectores", sectores);
		    request.getRequestDispatcher("/ubicacion.jsp").forward(request, response);
		    }
		catch (Exception e) {
		response.sendError(500, "Error");
		}
		
		
		
		}

}
