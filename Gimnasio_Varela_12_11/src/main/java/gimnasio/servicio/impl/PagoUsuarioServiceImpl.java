package gimnasio.servicio.impl;

import java.util.ArrayList;
import gimnasio.accesoadatos.IDataAccessPagoUsuario;
import gimnasio.dominio.PagoUsuario;
import gimnasio.dominio.PagoUsuarioId;
import gimnasio.servicio.IServicePagoUsuario;

public class PagoUsuarioServiceImpl implements IServicePagoUsuario {

	
	private IDataAccessPagoUsuario dataAccess;
	
	public IDataAccessPagoUsuario getDataAccess() {
		return dataAccess;
	}

	public void setDataAccess(IDataAccessPagoUsuario dataAccess) {
		this.dataAccess = dataAccess;
	}
	
	@Override
	public ArrayList<PagoUsuario> obtenerTodos() {
		return dataAccess.obtenerTodos();
	}

	@Override
	public PagoUsuario obtenerUnRegistro(PagoUsuarioId Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(PagoUsuario objeto) {
		dataAccess.insertar(objeto);
	}

	@Override
	public void eliminar(PagoUsuario objeto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actualizar(PagoUsuario objeto) {
		// TODO Auto-generated method stub
	}

	@Override
	public ArrayList<PagoUsuario> obtenerPagosPorFechaDesc() {
		return dataAccess.obtenerPagosPorFechaDesc();
	}

}
