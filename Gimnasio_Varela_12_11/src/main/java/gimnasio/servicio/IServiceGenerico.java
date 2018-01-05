package gimnasio.servicio;

import java.util.ArrayList;

public interface IServiceGenerico <T, TId>{
	
	ArrayList<T> obtenerTodos();

	T obtenerUnRegistro(TId Id);

	void insertar(T objeto);

	void eliminar(T objeto);

	void actualizar(T objeto);
}
