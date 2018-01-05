function validarSubmit() {
	var result = true;
	if(document.getElementById("id") != null)
	{
		if ((/^\s*$/).test(document.getElementById("id").value)) {
			document.getElementById("errorDni").textContent = "El campo 'Dni' es obligatorio";
			result = false;
		}
		else{
			if(isNaN(document.getElementById("id").value)){
				document.getElementById("errorDni").textContent = "El campo 'Dni' debe ser numerico";
				result = false;
			}
			else{
				if(document.getElementById("id").value <= 0) {
					document.getElementById("errorDni").textContent = "El dni debe ser mayor 0";
					result = false;
				}
				else{
					document.getElementById("errorDni").textContent = "";
				}
			}
		}
	}
	if((/^\s*$/).test(document.getElementById("nombre").value)){
		document.getElementById("errorNombre").textContent = "El campo 'Nombre' es obligatorio";
		result = false;
	}
	else{
		document.getElementById("errorNombre").textContent = "";
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
	if(document.getElementById("mail") != null)
	{
		if((/^\s*$/).test(document.getElementById("mail").value)) {
			document.getElementById("errorMail").textContent = "El campo 'Mail' es obligatorio";
			result = false;
		}
		if(!document.getElementById("mail").value.match( /^(?:[^<>()[\].,;:\s@"]+(\.[^<>()[\].,;:\s@"]+)*|"[^\n"]+")@(?:[^<>()[\].,;:\s@"]+\.)+[^<>()[\]\.,;:\s@"]{2,63}$/i))
		{
			document.getElementById("errorMail").textContent = "Formato de mail incorrecto (nombre@dominio.com)";
			result = false;
		}
		else{
			document.getElementById("errorMail").textContent = "";
		}
	}
	if(document.getElementById("telefono") != null)
	{
		if((/^\s*$/).test(document.getElementById("telefono").value)) {
			document.getElementById("errorTelefono").textContent = "El campo 'telefono' es obligatorio";
			result = false;
		}
		if(!document.getElementById("telefono").value.match( /[0-9]{4}-[0-9]{4}$/ )) {
			document.getElementById("errorTelefono").textContent = "Formato de telefono incorrecto (nnn-nnn-nnnn)";
			result = false;
		}
		else{
			document.getElementById("errorTelefono").textContent = "";
		}
	}
	if(document.getElementById("password") != null)
	{
		if((/^\s*$/).test(document.getElementById("password").value)) {
			document.getElementById("errorPass").textContent = "El campo 'Password' es obligatorio";
			result = false;
		}
		else{
			document.getElementById("errorPass").textContent = "";
		}
	}
	return result;
}