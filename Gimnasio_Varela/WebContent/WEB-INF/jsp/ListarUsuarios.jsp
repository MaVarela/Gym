<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<div align="center">
	        <h1>Usuarios</h1>
	       	<table border="1">
	        	<th>DNI</th>
	        	<th>NOMBRE</th>
	        	<th>APELLIDO</th>
	        	<th></th>
				<c:forEach var="usuario" items="${listaUsuarios}">
	        	<tr>
	        		<td>${usuario.getId()}</td>
					<td>${usuario.getNombre()}</td>
					<td>${usuario.getApellido()}</td>
					<td>
						<a href="<c:url value='/Borrar-Usuario-${usuario.getId()}' />"  >Borrar</a><br>
						<a href="<c:url value='/Editar-Usuario-${usuario.getId()}' />"  >Editar</a>
					</td>
	        	</tr>
				</c:forEach>	        	
	       	</table>
	       </div>
	</body>
</html>