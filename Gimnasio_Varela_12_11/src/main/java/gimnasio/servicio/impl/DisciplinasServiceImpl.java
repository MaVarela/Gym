package gimnasio.servicio.impl;

import java.util.ArrayList;
import org.springframework.transaction.annotation.Transactional;
import gimnasio.accesoadatos.IDataAccessDisciplinas;
import gimnasio.dominio.Disciplina;
import gimnasio.servicio.IServiceDisciplinas;

@Transactional
public class DisciplinasServiceImpl implements IServiceDisciplinas{

	private IDataAccessDisciplinas dataAccess;
	
	public IDataAccessDisciplinas getDataAccess() {
		return dataAccess;
	}

	public void setDataAccess(IDataAccessDisciplinas dataAccess) {
		this.dataAccess = dataAccess;
	}

	@Override
	public ArrayList<Disciplina> obtenerTodos() {
		return dataAccess.obtenerTodos();
	}

	@Override
	public Disciplina obtenerUnRegistro(Integer Id) {
		return dataAccess.obtenerPorId(Id);
	}

	@Override
	public void insertar(Disciplina objeto) {
		dataAccess.insertar(objeto);
	}

	@Override
	public void eliminar(Disciplina objeto) {
		dataAccess.eliminar(objeto);
	}

	@Override
	public void actualizar(Disciplina objeto) {
		dataAccess.actualizar(objeto);
	}

}
