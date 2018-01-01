function validarSubmit() {
	var result = true;
	if(document.getElementById("idservicio") != null)
	{
		if ((/^\s*$/).test(document.getElementById("idservicio").value)) {
			document.getElementById("errorId").textContent = "El campo 'Id' es obligatorio";
			result = false;
		}
		else
		{
			document.getElementById("errorId").textContent = "";
		}
	}
	return result;
}