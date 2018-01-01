<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AltaDisciplina.html" method="post">
		<table>
			<tr>
				<td>
					<label for="descripcion">Disciplina: </label>
				</td>
				<td>
					<input type="text" name="descripcion" id="descripcion">
				</td>
			</tr>
			<tr>
				<td>
					<label for="precio">Precio: </label>
				</td>
				<td>
					<input type="text" name="precio" id="precio">
				</td>
			</tr>
			<tr>
				<td>
					<label for="cupos">Cupos: </label>
				</td>
				<td>
					<input type="text" name="cupos" id="cupos">
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