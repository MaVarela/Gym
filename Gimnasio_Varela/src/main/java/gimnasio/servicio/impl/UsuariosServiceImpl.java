package gimnasio.servicio.impl;

import java.util.ArrayList;

import javax.transaction.Transactional;

import gimnasio.accesoadatos.IDataAccessUsuarios;
import gimnasio.dominio.Usuario;
import gimnasio.servicio.IServiceUsuarios;

@Transactional
public class UsuariosServiceImpl implements IServiceUsuarios {

	private IDataAccessUsuarios dataAccess;
	
	 public IDataAccessUsuarios getDataAccess() {
		return dataAccess;
	} 
	
	public void setDataAccess(IDataAccessUsuarios dataAccess)
	{
		this.dataAccess = dataAccess;
	}
	
	@Override
	public ArrayList<Usuario> obtenerTodos() {
		return dataAccess.obtenerTodos();
	}

	@Override
	public Usuario obtenerUnRegistro(Integer Id) {
		return dataAccess.obtenerPorId(Id);
	}

	@Override
	public void insertar(Usuario objeto) {
		dataAccess.insertar(objeto);
	}

	@Override
	public void eliminar(Usuario objeto) {
		dataAccess.eliminar(objeto);
	}

	@Override
	public void actualizar(Usuario objeto) {
		dataAccess.actualizar(objeto);
	}
}
