package gimnasio.accesoadatos;

import java.util.ArrayList;

import gimnasio.dominio.Rutina;

public interface IDataAccessRutinas {
	//Persiste una rutina
	void insertar(Rutina objeto);

	//Obtiene una rutina por su identificador
	Rutina obtenerPorId(int Id);

	//Obtiene todas las rutinas
	ArrayList<Rutina> obtenerTodos();
}
