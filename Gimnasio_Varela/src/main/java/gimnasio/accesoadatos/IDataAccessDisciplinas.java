package gimnasio.accesoadatos;

import java.util.ArrayList;

import gimnasio.dominio.Disciplina;

public interface IDataAccessDisciplinas {
	//Persiste una disciplina
	public void insertar(Disciplina objeto);

	//Obtiene una disciplina por su identificador
	public Disciplina obtenerPorId(int Id);

	//Obtiene todos las disciplinas
	public ArrayList<Disciplina> obtenerTodos();

	//Elimina una disciplina
	public void eliminar(Disciplina objeto);

	//Actualiza los datos de una disciplina 
	public void actualizar(Disciplina objeto);
}
