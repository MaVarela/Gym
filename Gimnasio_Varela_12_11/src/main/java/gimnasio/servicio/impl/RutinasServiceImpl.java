package gimnasio.servicio.impl;

import java.util.ArrayList;

import gimnasio.accesoadatos.IDataAccessRutinas;
import gimnasio.dominio.Rutina;
import gimnasio.servicio.IServiceRutinas;

public class RutinasServiceImpl implements IServiceRutinas {

	private IDataAccessRutinas dataAccess;
	
	 public IDataAccessRutinas getDataAccess() {
		return dataAccess;
	} 
	
	public void setDataAccess(IDataAccessRutinas dataAccess)
	{
		this.dataAccess = dataAccess;
	}
	
	@Override
	public ArrayList<Rutina> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rutina obtenerUnRegistro(Integer Id) {
		
		return dataAccess.obtenerPorId(Id);
	}

	@Override
	public void insertar(Rutina objeto) {
		dataAccess.insertar(objeto);
	}

	@Override
	public void eliminar(Rutina objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Rutina objeto) {
		// TODO Auto-generated method stub
		
	}
}
