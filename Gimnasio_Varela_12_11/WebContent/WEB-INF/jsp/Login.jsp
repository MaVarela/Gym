<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/formularioABM.css" rel="stylesheet">
<script type="text/javascript" src="resources/js/LoginValidations.js"></script>

<title>Login</title>
</head>
<body>
	<h1  id="lblTitulo">Login</h1>
	<div id="cntInfo" class="${Info}">
		<span id="lblInformacion" class="${styleMsg}">${mensaje}</span>
	</div>
	<div id="divContenedorLogin">
		<form action="ValidarUsuario.html" method="post">
			<div id="cntFormulario">
				<table>
					<tr>
						<td>Nro. de Usuario: </td>
						<td></td>
						<td></td>
					</tr>
					<tr>
					<td>
						<input type="number" name="id" id="id" value="${id}"></td>
						<td></td>
		      			<td class="lblError"><span id="errorDni">${ErrorUsuario}</span></td>
					</tr>
					<tr>
						<td>Contraseña: </td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td><input type="password" name="password" id="password" value="${password}"></td>
						<td></td>
		      			<td class="lblError"><span id="errorPass">${ErrorPass}</span></td>
					</tr>
					<tr>
						<td><input type="submit" onclick="return validarSubmit()" name="btnAceptar" value="Aceptar"></td>
						<td></td>
					</tr>
				</table>
			</div>
		</form>
	</div>
</body>
</html>