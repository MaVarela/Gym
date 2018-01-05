<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/formularioABM.css" rel="stylesheet">
<script type="text/javascript" src="resources/js/AgregarUsuariosValidations.js"></script>

<title>Alta Usuario</title>
</head>
<body>
	<a id="btnCerrarSesion" href="Login.html">Cerrar Sesión</a>
	<h1  id="lblTitulo">Alta Usuarios</h1>
	<div id="cntInfo" class="${Info}">
		<span id="lblInformacion" class="${styleMsg}">${mensaje}</span>
	</div>
	<div id="divContenedor">
		<form action="AltaUsuario.html" method="post">
			<div id="cntFormulario">
				<table>
					<tr>
						<td>
							<label for="id">Dni: </label>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<input type="number" name="id" id="id" ${readonly}>
						</td>
						<td></td>
						<td class="lblError"><span id="errorDni">${ErrorUsuario}</span></td>
					</tr>
					<tr>
						<td>
							<label for="nombre">Nombre: </label>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<input type="text" name="nombre" id="nombre" ${readonly}>
						</td>
						<td></td>
						<td class="lblError"><span id="errorNombre">${ErrorNombre}</span></td>
					</tr>
					<tr>
						<td>
							<label for="apellido">Apellido: </label>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<input type="text" name="apellido" id="apellido" ${readonly}>
						</td>
						<td></td>
						<td class="lblError"><span id="errorApellido">${ErrorApellido}</span></td>
					</tr>
					<tr>
						<td>
							<label for="mail">Mail: </label>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<input type="text" name="mail" id="mail" ${readonly}>
						</td>
						<td></td>
						<td class="lblError"><span id="errorMail">${ErrorMail}</span></td>
					</tr>
					<tr>
						<td>
							<label for="telefono">Teléfono: </label>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<input type="text" name="telefono" id="telefono" ${readonly}>
						</td>
						<td></td>
						<td class="lblError"><span id="errorTelefono">${ErrorTelefono}</span></td>
					</tr>
					<tr>
						<td>
							<label for="password">Password: </label>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<input type="text" name="password" id="password" ${readonly}>
						</td>
						<td></td>
						<td class="lblError"><span id="errorPass">${ErrorPass}</span></td>
					</tr>

					<tr>
						<td>
							<label for="idRol">Rol: </label>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<select id="idRol" name="idRol">
								<c:forEach var="rol" items="${listaRoles}">
									<option value="${rol.getId()}">${rol.getDescripcion()}</option>
								</c:forEach>
							</select>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="Grabar" onclick="return validarSubmit()" id="btnGuardar" name="btnGuardar">
						</td>
						<td>
							
						</td>
					</tr>
				</table>
				<p><br>
  				</p>	
			</div>
		</form>
	</div>
	<a id="btnVolver" href="Inicio.html">Volver</a>
</body>
</html>