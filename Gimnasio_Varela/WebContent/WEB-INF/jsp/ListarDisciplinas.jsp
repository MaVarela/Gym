<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<div align="center">
	        <h1>Clases</h1>
	       	<table border="1">
	        	<th>CLASE</th>
	        	<th>PRECIO</th>
	        	<th>CUPOS</th>
	        	<th>DISPONIBILIDAD</th>
	        	<!--<th>DISPONIBILIDAD</th>-->
	        	<th></th>
				<c:forEach var="disciplina" items="${listaDisciplinas}">
	        	<tr>
	        		<td>${disciplina.getDescripcion()}</td>
					<td>${disciplina.getPrecio()}</td>
					<td>${disciplina.getCupos()}</td>
					<td>${disciplina.getDisponibilidad()}</td>
					<td>
						<a href="<c:url value='/Borrar-Disciplina-${disciplina.getId()}' />"  >Borrar</a><br>
						<a href="<c:url value='/Editar-Disciplina-${disciplina.getId()}' />"  >Editar</a>
					</td>
	        	</tr>
				</c:forEach>	        	
	       	</table>
	       </div>
	</body>
</html>