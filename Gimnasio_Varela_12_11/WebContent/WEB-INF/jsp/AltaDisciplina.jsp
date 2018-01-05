<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/formularioABM.css" rel="stylesheet">

<title>Alta Clases</title>
</head>
<body>
	<a id="btnCerrarSesion" href="Login.html">Cerrar Sesión</a>
	<h1  id="lblTitulo">Alta Clases</h1>
	<div id="cntInfo" class="${Info}">
		<span id="lblInformacion" class="${styleMsg}">${mensaje}</span>
	</div>
	<div id="divContenedor">
		<form action="AltaDisciplina.html" method="post">
			<div id="cntFormulario">
				<table>
					<tr>
						<td>
							<label for="descripcion">Clase: </label>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<input type="text" name="descripcion" id="descripcion" ${readonly}>
						</td>
						<td></td>
						<td class="lblError"><span id="errorDescripcion">${ErrorDescripcion}</span></td>
					</tr>
					<tr>
						<td>
							<label for="precio">Precio: </label>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<input type="number" name="precio" id="precio" ${readonly}>
						</td>
						<td></td>
						<td class="lblError"><span id="errorPrecio">${ErrorPrecio}</span></td>
					</tr>
					<tr>
						<td>
							<label for="cupos">Cupos: </label>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<input type="number" name="cupos" id="cupos" ${readonly}>
						</td>
						<td></td>
						<td class="lblError"><span id="errorCupos">${ErrorCupos}</span></td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="Grabar" id="btnGuardar" name="btnGuardar">
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