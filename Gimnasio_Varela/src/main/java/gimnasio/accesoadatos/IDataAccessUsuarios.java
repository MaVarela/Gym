package gimnasio.accesoadatos;

import java.util.ArrayList;
import gimnasio.dominio.Usuario;

public interface IDataAccessUsuarios {

		//Persiste un usuario
		public void insertar(Usuario objeto);

		//Obtiene un usuario por su identificador
		public Usuario obtenerPorId(int Id);

		//Obtiene todos los usuarios
		public ArrayList<Usuario> obtenerTodos();

		//Elimina un usuario
		public void eliminar(Usuario objeto);

		//Actualiza los datos de un usuario
		public void actualizar(Usuario objeto);
}
