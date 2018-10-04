package controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AsientoDao;
import dao.SectorNumeradoDao;
import dao.UsuarioDao;
import datos.Asiento;
import datos.SectorNumerado;
import datos.Usuario;


public class ControladorAgregar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	public ControladorAgregar() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesarSolicitud(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesarSolicitud(request, response);
	}
	private void procesarSolicitud(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		try {
			String nombre = request.getParameter("nombre");
			String contrasena = request.getParameter("password");
			String email = request.getParameter("email");
		    Usuario usuario = new Usuario(nombre, contrasena, email);
			//UsuarioDao.getIntance().agregar(usuario);
		    if (UsuarioDao.getIntance().traerUsuario(1)!=null){
		    	SectorNumerado sectornumerado = SectorNumeradoDao.getIntance().traerSectorNumerado(6);
		    	List<Asiento> asientos = AsientoDao.getIntance().traerAsientos(sectornumerado);
		    	request.setAttribute("sectornumerado", sectornumerado);
		    	request.setAttribute("lstAsiento", asientos);
		    	request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
		    }
		
			
		}
		catch (Exception e) {
		response.sendError(500, "Error");
		}
		
		
		
		}


}
