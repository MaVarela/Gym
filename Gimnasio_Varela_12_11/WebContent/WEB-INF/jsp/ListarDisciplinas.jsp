<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/listados.css" rel="stylesheet">
<title>Insert title here</title>
</head>
	<body>
		<a id="btnCerrarSesion" href="Login.html">Cerrar Sesión</a>
		<h1>Clases</h1>
		<div id="divContenedorClases">
			<div id="divListado">
		       	<table id="Items">
		       		<thead>
		       			<tr>
				        	<th>Clase</th>
				        	<th>Precio</th>
				        	<th>Cupos</th>
				        	<th>Disponibilidad</th>
				        	<th></th>
				        	<th></th>
				        	<th></th>
				        	<th></th>
				        </tr>
				    </thead>
				    <c:if test="${listaDisciplinas.size() == 0}">
		        		<tr><td colspan="5">No se encontraron registros</td></tr>
		        	</c:if>
					<c:forEach var="disciplina" items="${listaDisciplinas}">
		        	<tr>
		        		<td>${disciplina.getDescripcion()}</td>
						<td><span>$</span>${disciplina.getPrecio()}</td>
						<td>
							<c:choose>
								<c:when test="${disciplina.getId() == 6}">
									<span>N/A</span>
								</c:when>
								<c:otherwise>
									${disciplina.getCupos()}
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${disciplina.getId() == 6}">
									<span>N/A</span>
								</c:when>
								<c:otherwise>
									${disciplina.getDisponibilidad()}
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${disciplina.getId() == 6}">
									<a class="btnDisabled">Borrar</a>
								</c:when>
								<c:otherwise>
									<a href="<c:url value='/Borrar-Disciplina-${disciplina.getId()}' />"  >Borrar</a>
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<a href="<c:url value='/Editar-Disciplina-${disciplina.getId()}' />"  >Editar</a>
						</td>
						<td>
							<c:choose>
								<c:when test="${disciplina.getDisponibilidad() > 0 || disciplina.getId() == 6}">
									<a id="btnAnotarSocio" href="<c:url value='/AnotarEn-Disciplina-${disciplina.getId()}' />"  >Anotar Socio</a>
								</c:when>
								<c:otherwise>
									<a id="btnAnotarSocio" class="btnDisabled">Anotar Socio</a>
								</c:otherwise>
							</c:choose>
							
						</td>
						<td>							
							<a id="btnLiberarCupos" href="<c:url value='/Liberar-Cupos-${disciplina.getId()}' />"  >Liberar Cupos</a>
						</td>
		        	</tr>
					</c:forEach>	        	
		       	</table>
	       </div>
       </div>
       <a id="btnVolverClases" href="Inicio.html">Volver</a>
	</body>
</html>