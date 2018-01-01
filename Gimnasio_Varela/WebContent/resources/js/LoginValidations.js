function validarSubmit() {
	var result = true;
	if(document.getElementById("id") != null)
	{
		if ((/^\s*$/).test(document.getElementById("id").value)) {
			document.getElementById("errorDni").textContent = "El campo 'Dni' es obligatorio";
			result = false;
		}
		else
		{
			document.getElementById("errorDni").textContent = "";
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