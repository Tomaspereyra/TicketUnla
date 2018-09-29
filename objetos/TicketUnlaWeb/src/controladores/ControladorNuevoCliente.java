// package controladores;
//
// import java.io.IOException;
// import java.io.PrintWriter;
// import java.util.GregorianCalendar;
//
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
//
// import datos.Cliente;
// import datos.Usuario;
// import negocio.ClienteABM;
// import negocio.UsuarioABM;
//
// public class ControladorNuevoCliente extends HttpServlet {
//
// protected void doGet(HttpServletRequest request,
// HttpServletResponse response) throws ServletException, IOException {
// procesarPeticion(request, response);
// }
//
// protected void doPost(HttpServletRequest request,
// HttpServletResponse response) throws ServletException, IOException {
// procesarPeticion(request, response);
// }
//
// private void procesarPeticion(HttpServletRequest request,
// HttpServletResponse response) throws ServletException, IOException {
// response.setContentType("text/html;charset=UTF-8");
// try {
// // datos cliente
// int dni = Integer.parseInt(request.getParameter("dni"));
// String nombre = request.getParameter("nombre");
// String apellido = request.getParameter("apellido");
// GregorianCalendar nacimiento = request.getParameter("nacimiento");
//
// // datos usuario
// String email = request.getParameter("emal");
// String clave = request.getParameter("contraseña");
//
// Usuario u = new Usuario(nombre, email, clave);
// UsuarioABM.getIntance().agregar(u);
//
// Cliente c = new Cliente(dni, apellido, nombre, nacimiento, u);
// ClienteABM.getIntance().agregar(c);
//
// response.setStatus(200);
//
// PrintWriter salida = response.getWriter();
//
// salida.println("");
// salida.println("<!DOCTYPE 4.01 Transitional//EN\">");
// salida.println("<HTML>");
// salida.println("<HEAD>");
// salida.println("<TITLE>registra tu cuenta</TITLE>");
// salida.println("</HEAD>");
// salida.println("<BODY>");
// salida.println("Cuenta agregado:" + "<br>");
// salida.println("Nombre: " + c.getNombre() + "<BR>");
// salida.println("Apellido: " + c.getApellido() + "<BR>");
// salida.println("DNI: " + c.getDni() + "<BR>");
// salida.println(
// "<A href=\"/TiketUnlaWeb/index.html\">Volver...</A>");
// salida.println("</BODY>");
// salida.println("</HTML>");
// } catch (Exception e) {
// response.sendError(500, "Error al ingresar nuevo usuario.");
// }
// }
// }