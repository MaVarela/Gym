<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/formularioABM.css" rel="stylesheet">
<title>Editar Clase</title>
</head>
<body>
	<a id="btnCerrarSesion" href="Login.html">Cerrar Sesión</a>
	<h1  id="lblTitulo">Editar Clase</h1>
	<div id="cntInfo" class="${Info}">
		<span id="lblInformacion" class="${styleMsg}">${mensaje}</span>
	</div>
	<div id="divContenedor">
		<form action="EditarDisciplina.html" method="post">
			<div id="cntFormulario">
				<table>
					<tr>
						<td>
							<label for="id">Id: </label>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<input type="number" name="id" id="id" readonly value="${disciplina.id}">
						</td>
						<td></td>
						<td class="lblError"><span id="errorId">${ErrorId}</span></td>
					</tr>
					<tr>
						<td>
							<label for="descripcion">Clase: </label>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<c:choose>
								<c:when test="${disciplina.getId() == 6}">
									<input type="text" name="descripcion" id="descripcion" readonly value="${disciplina.descripcion}">
								</c:when>
								<c:otherwise>
									<input type="text" name="descripcion" id="descripcion" ${readonly} value="${disciplina.descripcion}">
								</c:otherwise>
							</c:choose>
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
							<input type="number" name="precio" id="precio" ${readonly} value="${disciplina.precio}">
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
							<c:choose>
								<c:when test="${disciplina.getId() == 6}">
									<input type="number" name="cupos" id="cupos" readonly value="${disciplina.cupos}">
								</c:when>
								<c:otherwise>
									<input type="number" name="cupos" id="cupos" ${readonly} value="${disciplina.cupos}">
								</c:otherwise>
							</c:choose>
						</td>
						<td></td>
						<td class="lblError"><span id="errorCupos">${ErrorCupos}</span></td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="Editar" id="btnGuardar" name="btnGuardar">
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