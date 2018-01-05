<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/listados.css" rel="stylesheet">
<title>Pagos Registrados</title>
</head>
<body>
<a id="btnCerrarSesion" href="Login.html">Cerrar Sesión</a>
		<h1>Pagos Registrados</h1>
		<div id="divContenedor">
			<div id="divListado">
		       	<table id="Items">
		       		<thead>
		       			<tr>
		       				<th>Dni</th>
			        		<th>Nombre</th>
			        		<th>Apellido</th>
			        		<th>Importe</th>
			        		<th>Fecha</th>
			        		<th>Clase</th>
		       			</tr>
		        	</thead>
		        	<c:if test="${listaPagos.size() == 0}">
		        		<tr><td colspan="6">No se encontraron registros</td></tr>
		        	</c:if>
					<c:forEach var="pago" items="${listaPagos}">
			        	<tr>
			        		<td>${pago.getUsuario().getId()}</td>
							<td>${pago.getUsuario().getNombre()}</td>
							<td>${pago.getUsuario().getApellido()}</td>
							<td><span>$</span>${pago.getImporte()}</td>
							<td>${pago.getId().getFechaPago()}</td>
							<td>${pago.getDisciplina().getDescripcion()}</td>
			        	</tr>
					</c:forEach>	        	
		       	</table>
	       </div>
       </div>
       <a id="btnVolver" href="Inicio.html">Volver</a>
</body>
</html>