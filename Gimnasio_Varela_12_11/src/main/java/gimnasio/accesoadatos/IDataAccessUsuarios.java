package gimnasio.accesoadatos;

import java.util.ArrayList;
import gimnasio.dominio.Usuario;

public interface IDataAccessUsuarios {

	//Persiste un usuario
	void insertar(Usuario objeto);

	//Obtiene un usuario por su identificador
	Usuario obtenerPorId(int Id);

	//Obtiene todos los usuarios
	ArrayList<Usuario> obtenerTodos();
	
	//Recupera los usuarios con el rol de socio que no pertenecen a una clase
	ArrayList<Usuario> obtenerSociosNoInscriptos(Integer idClase);
	
	//Recupera los usuarios con el rol de socio que están inscriptos en una clase
	ArrayList<Usuario> obtenerSociosInscriptos(Integer idClase);
	
	//Recupera los usuarios con el rol de socio que están inscriptos en una clase
	ArrayList<Usuario> obtenerSocios();

	//Elimina un usuario
	void eliminar(Usuario objeto);

	//Actualiza los datos de un usuario
	void actualizar(Usuario objeto);
}
