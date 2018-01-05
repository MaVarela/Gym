package gimnasio.servicio.impl;

import java.util.ArrayList;
import org.springframework.transaction.annotation.Transactional;
import gimnasio.accesoadatos.IDataAccessRoles;
import gimnasio.dominio.RolUsuario;
import gimnasio.servicio.IServiceRoles;

@Transactional
public class RolesServiceImpl implements IServiceRoles {

	private IDataAccessRoles dataAccess;
	
	public IDataAccessRoles getDataAccess() {
		return dataAccess;
	}
	
	public void setDataAccess(IDataAccessRoles dataAccess) {
		this.dataAccess = dataAccess;
	}

	@Override
	public void actualizar(RolUsuario objeto) {
		dataAccess.actualizar(objeto);
	}

	@Override
	public void eliminar(RolUsuario objeto) {
		dataAccess.eliminar(objeto);
	}

	@Override
	public void insertar(RolUsuario objeto) {
		dataAccess.insertar(objeto);
	}

	@Override
	public ArrayList<RolUsuario> obtenerTodos() {
		return this.dataAccess.obtenerTodos();
	}

	@Override
	public RolUsuario obtenerUnRegistro(Integer Id) {
		return dataAccess.obtenerPorId(Id);
	}
}
