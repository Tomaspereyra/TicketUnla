<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="datos.Usuario"%>
<%@ page import="datos.SectorNumerado"%>
<%@ page import="datos.Asiento"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Principal</title>
</head>
<body>
	<%
		Usuario usuario = (Usuario) request.getAttribute("usuario");
	%>
	<%
		SectorNumerado sector = (SectorNumerado) request.getAttribute("sectornumerado");
	%>
	<%
		List<Asiento> lstAsiento =(List)request.getAttribute("lstAsiento");
	%>
  
	<option value="0">Seleccione un asiento></option>
	
	<%for (Asiento asiento : lstAsiento) {%>
	<input type="radio" name="genero" value="pos" id="hombre"><label for="hombre"><%=asiento.getCodigo()%></label>
	
	<%}%>




</body>
</html>