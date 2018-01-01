package gimnasio.accesoadatos.impl;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import gimnasio.accesoadatos.IDataAccessDisciplinas;
import gimnasio.dominio.Disciplina;


public class DataAccessHibernateDisciplinas extends AbstractDataAccessHibernate<Disciplina, Integer> implements IDataAccessDisciplinas {

	public DataAccessHibernateDisciplinas(Disciplina objeto, SessionFactory sessionFactory) {
		super(objeto, sessionFactory);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Disciplina obtenerPorId(int Id) {
		return super.obtenerPorId(Id);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Disciplina> obtenerTodos() {
		Criteria criteria = createEntityCriteria();
		
		ArrayList<Disciplina> result = (ArrayList<Disciplina>) criteria.list();
		for(Disciplina disciplina : result)
		{
			disciplina.setDisciplinas(disciplina.getDisciplinas());
		}
    	return result;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminar(Disciplina objeto) {
		super.eliminar(objeto);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizar(Disciplina objeto) {
		super.actualizar(objeto);
	}
}
