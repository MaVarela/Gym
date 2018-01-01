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
	<form action="EditarUsuario.html" method="post">
		<table>
			<tr>
				<td>
					<label for="id">Dni: </label>
				</td>
				<td>
					<input type="text" name="id" id="id" readonly value="${usuario.id}">
				</td>
			</tr>
			<tr>
				<td>
					<label for="nombre">Nombre: </label>
				</td>
				<td>
					<input type="text" name="nombre" id="nombre" value="${usuario.nombre}">
				</td>
			</tr>
			<tr>
				<td>
					<label for="apellido">Apellido: </label>
				</td>
				<td>
					<input type="text" name="apellido" id="apellido" value="${usuario.apellido}">
				</td>
			</tr>
			<tr>
				<td>
					<label for="mail">Mail: </label>
				</td>
				<td>
					<input type="text" name="mail" id="mail" value="${usuario.mail}">
				</td>
			</tr>
			<tr>
				<td>
					<label for="telefono">Teléfono: </label>
				</td>
				<td>
					<input type="text" name="telefono" id="telefono" value="${usuario.telefono}">
				</td>
			</tr>
			<tr>
				<td>
					<label for="password">Password: </label>
				</td>
				<td>
					<input type="text" name="password" id="password" value="${usuario.password}">
				</td>
			</tr>
			<tr>
				<td>
					<label for="idRol">Rol: </label>
				</td>
				<td>
					<select id="idRol" name="idRol">
						<!--<c:set var="selectedRol" value="${idRol}"/>-->
						<c:forEach var="rol" items="${listaRoles}">
							<c:choose> 
							  <c:when test="${rol.getId() == idRol}">
							    <option value="${rol.getId()}" selected>${rol.getDescripcion()}</option>
							  </c:when>
							  <c:otherwise>
							    <option value="${rol.getId()}">${rol.getDescripcion()}</option>
							  </c:otherwise>
						    </c:choose>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Editar" id="btnEditar" name="btnEditar">
				</td>
				<td>
					
				</td>
			</tr>
		</table>		
	</form>
</body>
</html>