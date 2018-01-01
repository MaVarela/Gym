function validarSubmit() {
	var result = true;
	if(document.getElementById("idcuenta") != null)
	{
		if ((/^\s*$/).test(document.getElementById("idcuenta").value)) {
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