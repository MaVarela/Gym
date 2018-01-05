package gimnasio.accesoadatos.impl;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import gimnasio.accesoadatos.IDataAccessDisciplinaUsuario;
import gimnasio.dominio.DisciplinaUsuario;
import gimnasio.dominio.DisciplinaUsuarioId;

public class DataAccessHibernateDisciplinaUsuario extends AbstractDataAccessHibernate<DisciplinaUsuario, DisciplinaUsuarioId> implements IDataAccessDisciplinaUsuario {

	public DataAccessHibernateDisciplinaUsuario(DisciplinaUsuario objeto, SessionFactory sessionFactory) {
		super(objeto, sessionFactory);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertar(DisciplinaUsuario objeto) {
		super.insertar(objeto); 
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public DisciplinaUsuario obtenerPorId(DisciplinaUsuarioId Id) {
		return super.obtenerPorId(Id);
	}

	@Override
	public ArrayList<DisciplinaUsuario> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminar(DisciplinaUsuario objeto) {
		super.eliminar(objeto);		
	}

	@Override
	public void actualizar(DisciplinaUsuario objeto) {
		// TODO Auto-generated method stub
	}

}
