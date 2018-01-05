<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/listados.css" rel="stylesheet">
<title>Registro de Pagos</title>
</head>
	<body>
		<a id="btnCerrarSesion" href="Login.html">Cerrar Sesión</a>
		<h1>Socios</h1>
		<div id="divContenedor">
			<div id="divListado">
		       	<table id="Items">
		       		<thead>
		       			<tr>
		       				<th>Dni</th>
			        		<th>Nombre</th>
			        		<th>Apellido</th>
			        		<th></th>
		       			</tr>
		        	</thead>
		        	<c:if test="${listaUsuarios.size() == 0}">
		        		<tr><td colspan="5">No se encontraron registros</td></tr>
		        	</c:if>
					<c:forEach var="usuario" items="${listaUsuarios}">
			        	<tr>
			        		<td>${usuario.getId()}</td>
							<td>${usuario.getNombre()}</td>
							<td>${usuario.getApellido()}</td>
							<td>
								<a id="btnListarInscripciones" href="<c:url value='/Listar-Inscripciones-${usuario.getId()}' />"  >Listar Inscripciones</a>
							</td>
			        	</tr>
					</c:forEach>	        	
		       	</table>
	       </div>
       </div>
       <a id="btnVolver" href="Inicio.html">Volver</a>
	</body>
</html>