package gimnasio.accesoadatos;

import java.util.ArrayList;
import gimnasio.dominio.DisciplinaUsuario;
import gimnasio.dominio.DisciplinaUsuarioId;

public interface IDataAccessDisciplinaUsuario {
	//Persiste una disciplina
	public void insertar(DisciplinaUsuario objeto);

	//Obtiene una disciplina por su identificador
	public DisciplinaUsuario obtenerPorId(DisciplinaUsuarioId Id);

	//Obtiene todos las disciplinas
	public ArrayList<DisciplinaUsuario> obtenerTodos();

	//Elimina una disciplina
	public void eliminar(DisciplinaUsuario objeto);

	//Actualiza los datos de una disciplina 
	public void actualizar(DisciplinaUsuario objeto);
}
