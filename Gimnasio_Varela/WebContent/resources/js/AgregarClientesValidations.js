function validarSubmit() {
	var result = true;
	if(document.getElementById("dni") != null)
	{
		if ((/^\s*$/).test(document.getElementById("dni").value)) {
			document.getElementById("errorDni").textContent = "El campo 'Dni' es obligatorio";
			result = false;
		}
		else{
			if(isNaN(document.getElementById("dni").value)){
				document.getElementById("errorDni").textContent = "El campo 'Dni' debe ser numerico";
				result = false;
			}
			else{
				if(document.getElementById("dni").value <= 0) {
					document.getElementById("errorDni").textContent = "El dni debe ser mayor 0";
					result = false;
				}
				else{
					document.getElementById("errorDni").textContent = "";
				}
			}
		}
	}
	if((/^\s*$/).test(document.getElementById("cuil").value)){
		document.getElementById("errorCuil").textContent = "El campo 'Cuil' es obligatorio";
		result = false;
	}
	else{
		if (isNaN(document.getElementById("cuil").value)) {
			document.getElementById("errorCuil").textContent = "El campo 'Cuil' debe ser numerico";
			result = false;
		}
		else{
			if(document.getElementById("cuil").value <= 0)
			{
				document.getElementById("errorCuil").textContent = "El codigo debe ser mayor 0";
				result = false;
			}
			else{
				document.getElementById("errorCuil").textContent = "";
			}
		}
	}
	if(document.getElementById("nombre") != null)
	{
		if((/^\s*$/).test(document.getElementById("nombre").value)) {
			document.getElementById("errorNombre").textContent = "El campo 'nombre' es obligatorio";
			result = false;
		}
		else{
			document.getElementById("errorNombre").textContent = "";
		}
	}
	if(document.getElementById("apellido") != null)
	{
		if((/^\s*$/).test(document.getElementById("apellido").value)) {
			document.getElementById("errorApellido").textContent = "El campo 'apellido' es obligatorio";
			result = false;
		}
		else{
			document.getElementById("errorApellido").textContent = "";
		}
	}
	if(document.getElementById("fechaNacimiento") != null)
	{
		if((/^\s*$/).test(document.getElementById("fechaNacimiento").value)) {
			document.getElementById("errorFecha").textContent = "El campo 'fecha de nacimiento' es obligatorio";
			result = false;
		}
		if(!document.getElementById("fechaNacimiento").value.match( /\d{2}[\/]\d{2}[\/]\d{4}/ )) {
			document.getElementById("errorFecha").textContent = "Formato de fecha incorrecto (dd/mm/YYYY)";
			result = false;
		}
		else{
			document.getElementById("errorFecha").textContent = "";
		}
	}
	if(document.getElementById("telefono") != null)
	{
		if((/^\s*$/).test(document.getElementById("telefono").value)) {
			document.getElementById("errorTelefono").textContent = "El campo 'telefono' es obligatorio";
			result = false;
		}
		if(!document.getElementById("telefono").value.match( /^(\([0-9]{3}\)\s*|[0-9]{3}\-)[0-9]{3}-[0-9]{4}$/ )) {
			document.getElementById("errorTelefono").textContent = "Formato de telefono incorrecto (nnn-nnn-nnnn)";
			result = false;
		}
		else{
			document.getElementById("errorTelefono").textContent = "";
		}
	}
	if(document.getElementById("domicilio") != null)
	{
		if((/^\s*$/).test(document.getElementById("domicilio").value)) {
			document.getElementById("errorDomicilio").textContent = "El campo 'domicilio' es obligatorio";
			result = false;
		}
		else{
			document.getElementById("errorDomicilio").textContent = "";
		}
	}
	if(document.getElementById("contrasenia") != null)
	{
		if((/^\s*$/).test(document.getElementById("contrasenia").value)) {
			document.getElementById("errorContrasenia").textContent = "El campo 'contrasenia' es obligatorio";
			result = false;
		}
		else{
			document.getElementById("errorContrasenia").textContent = "";
		}
	}
	return result;
}