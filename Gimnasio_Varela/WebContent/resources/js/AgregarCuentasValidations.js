function validarSubmit() {
	var result = true;
	if(document.getElementById("saldo") != null)
	{
		if ((/^\s*$/).test(document.getElementById("saldo").value)) {
			document.getElementById("errorSaldo").textContent = "El campo 'Saldo' es obligatorio";
			result = false;
		}
		else{
			if(isNaN(document.getElementById("saldo").value)){
				document.getElementById("errorSaldo").textContent = "El campo 'Saldo' debe ser numerico";
				result = false;
			}
			else{
				if(document.getElementById("saldo").value < 0) {
					document.getElementById("errorSaldo").textContent = "El saldo debe ser mayor o igual a 0";
					result = false;
				}
				else{
					document.getElementById("errorSaldo").textContent = "";
				}
			}
		}
	}
	if((/^\s*$/).test(document.getElementById("dni").value)){
		document.getElementById("errorDni").textContent = "El campo 'Dni' es obligatorio";
		result = false;
	}
	else{
		if (isNaN(document.getElementById("dni").value)) {
			document.getElementById("errorDni").textContent = "El campo 'Dni' debe ser numerico";
			result = false;
		}
		else{
			if(document.getElementById("dni").value < 1)
			{
				document.getElementById("errorDni").textContent = "El codigo debe ser mayor 0";
				result = false;
			}
			else{
				document.getElementById("errorDni").textContent = "";
			}
		}
	}
	return result;
}