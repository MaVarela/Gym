function validarSubmit() {
	var result = true;
	if(document.getElementById("descripcion") != null)
	{
		if ((/^\s*$/).test(document.getElementById("descripcion").value)) {
			document.getElementById("errorDescripcion").textContent = "El campo 'Descripcion' es obligatorio";
			result = false;
		}
		else
		{
			document.getElementById("errorDescripcion").textContent = "";
		}
	}
	return result;
}