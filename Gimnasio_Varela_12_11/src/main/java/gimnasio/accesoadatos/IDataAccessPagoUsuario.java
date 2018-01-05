package gimnasio.accesoadatos;

import java.util.ArrayList;
import gimnasio.dominio.PagoUsuario;

public interface IDataAccessPagoUsuario {
	//Persiste un pago
	void insertar(PagoUsuario objeto);

	//Obtiene todos los pagos
	ArrayList<PagoUsuario> obtenerTodos();
	
	//Obtiene todos los pagos ordenados por fecha descendente
	ArrayList<PagoUsuario> obtenerPagosPorFechaDesc();
}
