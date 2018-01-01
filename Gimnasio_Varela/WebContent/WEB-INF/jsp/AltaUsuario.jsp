<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AltaUsuario.html" method="post">
		<table>
			<tr>
				<td>
					<label for="id">Dni: </label>
				</td>
				<td>
					<input type="text" name="id" id="id">
				</td>
			</tr>
			<tr>
				<td>
					<label for="nombre">Nombre: </label>
				</td>
				<td>
					<input type="text" name="nombre" id="nombre">
				</td>
			</tr>
			<tr>
				<td>
					<label for="apellido">Apellido: </label>
				</td>
				<td>
					<input type="text" name="apellido" id="apellido">
				</td>
			</tr>
			<tr>
				<td>
					<label for="mail">Mail: </label>
				</td>
				<td>
					<input type="text" name="mail" id="mail">
				</td>
			</tr>
			<tr>
				<td>
					<label for="telefono">Teléfono: </label>
				</td>
				<td>
					<input type="text" name="telefono" id="telefono">
				</td>
			</tr>
			<tr>
				<td>
					<label for="password">Password: </label>
				</td>
				<td>
					<input type="text" name="password" id="password">
				</td>
			</tr>
			<tr>
				<td>
					<label for="idRol">Rol: </label>
				</td>
				<td>
					<select id="idRol" name="idRol">
						<c:forEach var="rol" items="${listaRoles}">
							<option value="${rol.getId()}">${rol.getDescripcion()}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Grabar" id="btnGuardar" name="btnGuardar">
				</td>
				<td>
					
				</td>
			</tr>
		</table>		
	</form>
</body>
</html>