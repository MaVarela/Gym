<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/listados.css" rel="stylesheet">
<title>Registrar Pagos</title>
</head>
	<body>
		<a id="btnCerrarSesion" href="Login.html">Cerrar Sesión</a>
		<h1>Clases</h1>
		<div id="cntInfo" class="${Info}">
			<span id="lblInformacion" class="${styleMsg}">${mensaje}</span>
		</div>
		<div id="divContenedor">
			<div id="divListado">
		       	<table id="ItemsRegPagos">
		       		<thead>
		       			<tr>
				        	<th>Clase</th>
				        	<th>Precio</th>
				        	<th></th>
				        </tr>
				    </thead>
				    <c:if test="${listaDisciplinas.size() == 0}">
		        		<tr><td colspan="3">No se encontraron registros</td></tr>
		        	</c:if>
					<c:forEach var="disciplina" items="${listaClases}">
		        	<tr>
		        		<td>${disciplina.getDisciplina().getDescripcion()}</td>
						<td><span>$</span>${disciplina.getDisciplina().getPrecio()}</td>
						<td>
							<a id="btnRegistrarPago" href="<c:url value='/Registrar-Pago-${disciplina.getDisciplina().getId()}-${dniSocio}' />"  >Registrar Pago</a>
						</td>
		        	</tr>
					</c:forEach>	        	
		       	</table>
	       </div>
       </div>
       <a id="btnVolver" href="RegistrarPagos.html">Volver</a>
	</body>
</html>