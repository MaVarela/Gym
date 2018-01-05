<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/listados.css" rel="stylesheet">
<title>Alta de Rutinas</title>
</head>
<body>
	<a tabindex="0" id="btnCerrarSesion" href="Login.html">Cerrar Sesión</a>
		<h1>Alta de Rutina</h1>
		<div id="cntInfo" class="${Info}">
			<span id="lblInformacion" class="${styleMsg}">${mensaje}</span>
		</div>
		<div id="divContenedorClases">
			<div id="divListado">
			<form action="AltaRutina.html" method="post">
				<input type="hidden" id="dniSocio" name="dniSocio" value="${dniSocio}">
		       	<table id="Items">
		       		<tr>
		       			<th colspan="3">Lunes</th><th colspan="3">Martes</th><th colspan="3">Miercoles</th>
		       		</tr>
		       		<tr>
		       			<th>Ejercicio</th><th>Series</th><th>Repeticiones</th>
			        	<th>Ejercicio</th><th>Series</th><th>Repeticiones</th>
			        	<th>Ejercicio</th><th>Series</th><th>Repeticiones</th>
			        </tr>
			        <tr>
			        	<td>
			        		<input tabindex="1" type="text" id="EjercicioLunes1" name="Descripcion">
			        		<input tabindex="4" type="text" id="EjercicioLunes2" name="Descripcion">
			        		<input tabindex="7"  type="text" id="EjercicioLunes3" name="Descripcion">
			        		<input tabindex="10"  type="text" id="EjercicioLunes4" name="Descripcion">
			        		<input tabindex="13"  type="text" id="EjercicioLunes5" name="Descripcion">
			        		<input tabindex="16"  type="text" id="EjercicioLunes6" name="Descripcion">
			        		
			        	</td>
			        	<td>
			        		<input tabindex="2" type="text" id="SeriesLunes1" name="Series">
			        		<input tabindex="5"  type="text" id="SeriesLunes2" name="Series">
			        		<input tabindex="8"  type="text" id="SeriesLunes3" name="Series">
			        		<input tabindex="11"  type="text" id="SeriesLunes4" name="Series">
			        		<input tabindex="14"  type="text" id="SeriesLunes5" name="Series">
			        		<input tabindex="17"  type="text" id="SeriesLunes6" name="Series">
			        	</td>
			        	<td>
			        		<input tabindex="3"  type="text" id="RepeticionesLunes1" name="Repeticiones">
			        		<input tabindex="6"  type="text" id="RepeticionesLunes2" name="Repeticiones">
			        		<input tabindex="9"  type="text" id="RepeticionesLunes3" name="Repeticiones">
			        		<input tabindex="12"  type="text" id="RepeticionesLunes4" name="Repeticiones">
			        		<input tabindex="15"  type="text" id="RepeticionesLunes5" name="Repeticiones">
			        		<input tabindex="18"  type="text" id="RepeticionesLunes6" name="Repeticiones">
			        	</td>
			        	<td>
			        		<input tabindex="19"  type="text" id="EjercicioMartes1" name="Descripcion">
			        		<input tabindex="22"  type="text" id="EjercicioMartes2" name="Descripcion">
			        		<input tabindex="25"  type="text" id="EjercicioMartes3" name="Descripcion">
			        		<input tabindex="28"  type="text" id="EjercicioMartes4" name="Descripcion">
			        		<input tabindex="31"  type="text" id="EjercicioMartes5" name="Descripcion">
			        		<input tabindex="34"  type="text" id="EjercicioMartes6" name="Descripcion">		        		
			        	</td>
			        	<td>
			        		<input tabindex="20"  type="text" id="SeriesMartes1" name="Series">
			        		<input tabindex="23"  type="text" id="SeriesMartes2" name="Series">
			        		<input tabindex="26"  type="text" id="SeriesMartes3" name="Series">
			        		<input tabindex="29"  type="text" id="SeriesMartes4" name="Series">
			        		<input tabindex="32"  type="text" id="SeriesMartes5" name="Series">
			        		<input tabindex="35"  type="text" id="SeriesMartes6" name="Series">
			        	</td>
			        	<td>
			        		<input tabindex="21"  type="text" id="RepeticionesMartes1" name="Repeticiones">
			        		<input tabindex="24"  type="text" id="RepeticionesMartes2" name="Repeticiones">
			        		<input tabindex="27"  type="text" id="RepeticionesMartes3" name="Repeticiones">
			        		<input tabindex="30"  type="text" id="RepeticionesMartes4" name="Repeticiones">
			        		<input tabindex="33"  type="text" id="RepeticionesMartes5" name="Repeticiones">
			        		<input tabindex="36"  type="text" id="RepeticionesMartes6" name="Repeticiones">
			        	</td>
						<td>
							<input tabindex="37"  type="text" id="EjercicioMiercoles1" name="Descripcion">
							<input tabindex="40"  type="text" id="EjercicioMiercoles2" name="Descripcion">
							<input tabindex="43"  type="text" id="EjercicioMiercoles3" name="Descripcion">
							<input tabindex="46"  type="text" id="EjercicioMiercoles4" name="Descripcion">
							<input tabindex="49"  type="text" id="EjercicioMiercoles5" name="Descripcion">
							<input tabindex="52"  type="text" id="EjercicioMiercoles6" name="Descripcion">
						</td>
						<td>
			        		<input tabindex="38"  type="text" id="SeriesMiercoles1" name="Series">
			        		<input tabindex="41"  type="text" id="SeriesMiercoles2" name="Series">
			        		<input tabindex="44"  type="text" id="SeriesMiercoles3" name="Series">
			        		<input tabindex="47"  type="text" id="SeriesMiercoles4" name="Series">
			        		<input tabindex="50"  type="text" id="SeriesMiercoles5" name="Series">
			        		<input tabindex="53"  type="text" id="SeriesMiercoles6" name="Series">
			        	</td>
			        	<td>
			        		<input tabindex="39"  type="text" id="RepeticionesMiercoles1" name="Repeticiones">
			        		<input tabindex="41"  type="text" id="RepeticionesMiercoles2" name="Repeticiones">
			        		<input tabindex="45"  type="text" id="RepeticionesMiercoles3" name="Repeticiones">
			        		<input tabindex="48"  type="text" id="RepeticionesMiercoles4" name="Repeticiones">
			        		<input tabindex="51"  type="text" id="RepeticionesMiercoles5" name="Repeticiones">
			        		<input tabindex="54"  type="text" id="RepeticionesMiercoles6" name="Repeticiones">
			        	</td>
		       		</tr>
		        	<tr>
		       			<th colspan="3">Jueves</th><th colspan="3">Viernes</th><th colspan="3">Sabado</th>
		       		</tr>
		       		<tr>
		       			<th>Ejercicio</th><th>Series</th><th>Repeticiones</th>
			        	<th>Ejercicio</th><th>Series</th><th>Repeticiones</th>
			        	<th>Ejercicio</th><th>Series</th><th>Repeticiones</th>
			        </tr>
			        <tr>
			        	<td>
			        		<input tabindex="55"  type="text" id="EjercicioJueves1" name="Descripcion">
			        		<input tabindex="58"  type="text" id="EjercicioJueves2" name="Descripcion">
			        		<input tabindex="61"  type="text" id="EjercicioJueves3" name="Descripcion">
			        		<input tabindex="64"  type="text" id="EjercicioJueves4" name="Descripcion">
			        		<input tabindex="67"  type="text" id="EjercicioJueves5" name="Descripcion">
			        		<input tabindex="70"  type="text" id="EjercicioJueves6" name="Descripcion">
			        		
			        	</td>
			        	<td>
			        		<input tabindex="56"  type="text" id="SeriesJueves1" name="Series">
			        		<input tabindex="59"  type="text" id="SeriesJueves2" name="Series">
			        		<input tabindex="62"  type="text" id="SeriesJueves3" name="Series">
			        		<input tabindex="65"  type="text" id="SeriesJueves4" name="Series">
			        		<input tabindex="68"  type="text" id="SeriesJueves5" name="Series">
			        		<input tabindex="71"  type="text" id="SeriesJueves6" name="Series">
			        	</td>
			        	<td>
			        		<input tabindex="57"  type="text" id="RepeticionesJueves1" name="Repeticiones">
			        		<input tabindex="60"  type="text" id="RepeticionesJueves2" name="Repeticiones">
			        		<input tabindex="63"  type="text" id="RepeticionesJueves3" name="Repeticiones">
			        		<input tabindex="66"  type="text" id="RepeticionesJueves4" name="Repeticiones">
			        		<input tabindex="69"  type="text" id="RepeticionesJueves5" name="Repeticiones">
			        		<input tabindex="72"  type="text" id="RepeticionesJueves6" name="Repeticiones">
			        	</td>
			        	<td>
			        		<input tabindex="73"  type="text" id="EjercicioViernes1" name="Descripcion">
			        		<input tabindex="76"  type="text" id="EjercicioViernes2" name="Descripcion">
			        		<input tabindex="79"  type="text" id="EjercicioViernes3" name="Descripcion">
			        		<input tabindex="82"  type="text" id="EjercicioViernes4" name="Descripcion">
			        		<input tabindex="85"  type="text" id="EjercicioViernes5" name="Descripcion">
			        		<input tabindex="88"  type="text" id="EjercicioViernes6" name="Descripcion">		        		
			        	</td>
			        	<td>
			        		<input tabindex="74"  type="text" id="SeriesViernes1" name="Series">
			        		<input tabindex="77"  type="text" id="SeriesViernes2" name="Series">
			        		<input tabindex="80"  type="text" id="SeriesViernes3" name="Series">
			        		<input tabindex="83"  type="text" id="SeriesViernes4" name="Series">
			        		<input tabindex="86"  type="text" id="SeriesViernes5" name="Series">
			        		<input tabindex="89" type="text" id="SeriesViernes6" name="Series">
			        	</td>
			        	<td>
			        		<input tabindex="75"  type="text" id="RepeticionesViernes1" name="Repeticiones">
			        		<input tabindex="78"  type="text" id="RepeticionesViernes2" name="Repeticiones">
			        		<input tabindex="81"  type="text" id="RepeticionesViernes3" name="Repeticiones">
			        		<input tabindex="84"  type="text" id="RepeticionesViernes4" name="Repeticiones">
			        		<input tabindex="87"  type="text" id="RepeticionesViernes5" name="Repeticiones">
			        		<input tabindex="90"  type="text" id="RepeticionesViernes6" name="Repeticiones">
			        	</td>
						<td>
							<input tabindex="91"  type="text" id="EjercicioSabado1" name="Descripcion">
							<input tabindex="94"  type="text" id="EjercicioSabado2" name="Descripcion">
							<input tabindex="97"  type="text" id="EjercicioSabado3" name="Descripcion">
							<input tabindex="100"  type="text" id="EjercicioSabado4" name="Descripcion">
							<input tabindex="103"  type="text" id="EjercicioSabado5" name="Descripcion">
							<input tabindex="106"  type="text" id="EjercicioSabado6" name="Descripcion">
						</td>
						<td>
			        		<input tabindex="92"  type="text" id="SeriesSabado1" name="Series">
			        		<input tabindex="95"  type="text" id="SeriesSabado2" name="Series">
			        		<input tabindex="98"  type="text" id="SeriesSabado3" name="Series">
			        		<input tabindex="101"  type="text" id="SeriesSabado4" name="Series">
			        		<input tabindex="104"  type="text" id="SeriesSabado5" name="Series">
			        		<input tabindex="107"  type="text" id="SeriesSabado6" name="Series">
			        	</td>
			        	<td>
			        		<input tabindex="92"  type="text" id="RepeticionesSabado1" name="Repeticiones">
			        		<input tabindex="96"  type="text" id="RepeticionesSabado2" name="Repeticiones">
			        		<input tabindex="99"  type="text" id="RepeticionesSabado3" name="Repeticiones">
			        		<input tabindex="102"  type="text" id="RepeticionesSabado4" name="Repeticiones">
			        		<input tabindex="105"  type="text" id="RepeticionesSabado5" name="Repeticiones">
			        		<input tabindex="108"  type="text" id="RepeticionesSabado6" name="Repeticiones">
			        	</td>
		       		</tr>
		       	</table>
		       	<input type="submit" value="Guardar" id="btnGuardar" name="btnGuardar">
		   </form>
	       </div>
       </div>
       <a tabindex="109" id="btnVolverClases" href="InicioProfesor.html">Volver</a>
</body>
</html>