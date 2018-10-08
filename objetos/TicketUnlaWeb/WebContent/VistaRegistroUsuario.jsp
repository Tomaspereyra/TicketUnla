<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="estilo.css">
<title>Insert title here</title>
</head>
<body>
<FORM method="GET" action="/TicketUnlaWeb/ControladorAgregar" >
	<div class="login">
	<label for="nombre" > Usuario</label>
	<input id="nombre" type="text" name="nombre">
    <label for="contrasena" > Contraseña: </label>
    <input id="contrasena" type="text" name="password">
    <label for="email" > Email: </label>
    <input id="email" type="text" name="email">
    <input type="submit" value="enviar">
    </div>
</FORM>
</body>
</html>