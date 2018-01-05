package gimnasio.servicio.impl;

import java.util.ArrayList;
import gimnasio.accesoadatos.IDataAccessDisciplinaUsuario;
import gimnasio.dominio.DisciplinaUsuario;
import gimnasio.dominio.DisciplinaUsuarioId;
import gimnasio.servicio.IServiceDisciplinaUsuario;

public class DisciplinaUsuarioServiceImpl implements IServiceDisciplinaUsuario {

	private IDataAccessDisciplinaUsuario dataAccess;
	
	public IDataAccessDisciplinaUsuario getDataAccess() {
		return dataAccess;
	}

	public void setDataAccess(IDataAccessDisciplinaUsuario dataAccess) {
		this.dataAccess = dataAccess;
	}
	
	
	@Override
	public ArrayList<DisciplinaUsuario> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DisciplinaUsuario obtenerUnRegistro(DisciplinaUsuarioId Id) {
		return dataAccess.obtenerPorId(Id);
	}

	@Override
	public void insertar(DisciplinaUsuario objeto) {
		dataAccess.insertar(objeto);
	}

	@Override
	public void eliminar(DisciplinaUsuario objeto) {
		dataAccess.eliminar(objeto);
	}

	@Override
	public void actualizar(DisciplinaUsuario objeto) {
		// TODO Auto-generated method stub
		
	}

}
