<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/index.css" rel="stylesheet">
<title>Inicio</title>
</head>
<body>
	<input type="hidden" name="usuarioLog" value="${usuarioLog}">
	<a id="btnCerrarSesion" href="Login.html">Cerrar Sesión</a>
	<h1 id="lblTitulo">Inicio</h1>
	<div id="divContenedor">
		<a href="AltaUsuario.html">Alta Usuario</a><br>
		<a href="AltaDisciplina.html">Alta Clases</a><br>
		<a href="ListarUsuarios.html">Listar Usuarios</a><br>
		<a href="ListarDisciplinas.html">Listar Clases</a><br>
		<a href="RegistrarPagos.html">Registrar Pagos</a><br>
		<a href="ListarPagos.html">Listar Pagos</a><br>
	</div>
</body>
</html>