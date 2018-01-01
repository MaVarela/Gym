package gimnasio.accesoadatos;

import java.util.ArrayList;

import gimnasio.dominio.RolUsuario;

public interface IDataAccessRoles {

	//Persiste un rol de usuario
	public void insertar(RolUsuario objeto);

	//Obtiene un rol de usuario por su identificador
	public RolUsuario obtenerPorId(int Id);

	//Obtiene todas los roles
	public ArrayList<RolUsuario> obtenerTodos();

	//Elimina un rol
	public void eliminar(RolUsuario objeto);

	//Actualiza los datos de un rol
	public void actualizar(RolUsuario objeto);

}