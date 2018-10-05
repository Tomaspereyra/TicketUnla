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
import dao.SectorNumeradoDao;
import dao.UsuarioDao;
import datos.Asiento;
import datos.Evento;
import datos.Funcion;
import datos.SectorNumerado;


public class ControladorFunciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ControladorFunciones() {
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
			
			
			System.out.println("hola");
			int e =	Integer.parseInt(request.getParameter("evento"));
			System.out.println(e);
			List<Funcion> funciones = FuncionDao.getIntance().traerFunciones(e);
			
			request.setAttribute("funciones", funciones);
			System.out.println("hola");
		    request.getRequestDispatcher("/Funciones.jsp").forward(request, response);
		    }
		catch (Exception e) {
		response.sendError(500, "Error");
		}
		
		
		
		}

}
