<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/resources/css/formularioABM.css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/LoginValidations.js"></script>

<title>Login</title>
</head>
<body>
	<h1  id="lblTitulo">Login</h1>
	<div id="cntInfo" class="${Info}">
		<span id="lblInformacion" class="${styleMsg}">${mensaje}</span>
	</div>
	<div id="divContenedor">
		<form action="ValidarUsuario.html">
			<div id="cntFormulario">
				<table>
					<tr>
						<td>Nro. de Usuario: </td>
						<td><input type="number" name="id" id="id"></td>
						<td></td>
		      			<td class="lblError"><span id="errorDni">${ErrorUsuario}</span></td>
					</tr>
					<tr>
						<td>Contraseña: </td>
						<td><input type="text" name="password" id="password"></td>
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