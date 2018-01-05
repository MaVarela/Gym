package gimnasio.accesoadatos.impl;

import java.util.ArrayList;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import gimnasio.accesoadatos.IDataAccessRutinas;
import gimnasio.dominio.Rutina;

public class DataAccessHibernateRutina extends AbstractDataAccessHibernate<Rutina, Integer> implements IDataAccessRutinas {

	public DataAccessHibernateRutina(Rutina objeto, SessionFactory sessionFactory) {
		super(objeto, sessionFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Rutina obtenerPorId(int Id) {
		Rutina rutina = super.obtenerPorId(Id);
		Hibernate.initialize(rutina.getUsuario());
		Hibernate.initialize(rutina.getEjercicios());
		
		return rutina;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Rutina> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
