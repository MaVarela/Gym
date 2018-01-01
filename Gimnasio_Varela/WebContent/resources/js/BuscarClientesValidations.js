function validarSubmit() {
	var result = true;
	if(document.getElementById("dni") != null)
	{
		if ((/^\s*$/).test(document.getElementById("dni").value)) {
			document.getElementById("errorDni").textContent = "El campo 'Dni' es obligatorio";
			result = false;
		}
		else
		{
			document.getElementById("errorDni").textContent = "";
		}
	}
	return result;
}