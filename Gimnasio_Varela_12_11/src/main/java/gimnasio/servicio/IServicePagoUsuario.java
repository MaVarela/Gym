package gimnasio.servicio;

import java.util.ArrayList;

import gimnasio.dominio.PagoUsuario;
import gimnasio.dominio.PagoUsuarioId;

public interface IServicePagoUsuario extends IServiceGenerico<PagoUsuario, PagoUsuarioId>{
	//Obtiene todos los pagos ordenados por fecha descendente
	ArrayList<PagoUsuario> obtenerPagosPorFechaDesc();
}
