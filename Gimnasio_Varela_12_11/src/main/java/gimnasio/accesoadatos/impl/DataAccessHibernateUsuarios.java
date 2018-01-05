package gimnasio.accesoadatos.impl;

import java.util.ArrayList;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Propagation;
import gimnasio.accesoadatos.IDataAccessUsuarios;
import gimnasio.dominio.Usuario;

@Transactional
public class DataAccessHibernateUsuarios extends AbstractDataAccessHibernate<Usuario, Integer> implements IDataAccessUsuarios {
	
	public DataAccessHibernateUsuarios(Usuario objeto, SessionFactory sessionFactory) {
		super(objeto, sessionFactory);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertar(Usuario objeto) {
		super.insertar(objeto);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Usuario obtenerPorId(int Id) {
		Usuario result = super.obtenerPorId(Id);
		if(result != null){
			Hibernate.initialize(result.getRol());
			Hibernate.initialize(result.getDisciplinas());
		}
		
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Usuario> obtenerTodos() {
		Criteria criteria = createEntityCriteria();
		
		ArrayList<Usuario> result = (ArrayList<Usuario>) criteria.list();
		for(Usuario user : result)
		{
			Hibernate.initialize(user.getRol());
		}
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Usuario> obtenerSociosNoInscriptos(Integer idClase) {
		
		ArrayList<Usuario> result = (ArrayList<Usuario>) getSession().getNamedQuery("getSociosNoInscriptos")
				.setParameter("idClase", idClase)
				.setParameter("idRol", 4).list();
		
		for(Usuario user : result)
		{
			Hibernate.initialize(user.getRol());
		}
		
    	return result;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Usuario> obtenerSociosInscriptos(Integer idClase) {
		
		ArrayList<Usuario> result = (ArrayList<Usuario>) getSession().getNamedQuery("getSociosInscriptos")
				.setParameter("idClase", idClase)
				.setParameter("idRol", 4).list();
		
		for(Usuario user : result)
		{
			Hibernate.initialize(user.getRol());
		}
		
    	return result;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Usuario> obtenerSocios() {
		
		Criteria criteria = this.getSession().createCriteria(Usuario.class, "usuario");
		criteria.add(Restrictions.eq("rol.id", 4));
		
		ArrayList<Usuario> result = (ArrayList<Usuario>) criteria.list();
		for(Usuario user : result)
		{
			Hibernate.initialize(user.getRol());
		}
		
		return result;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminar(Usuario objeto) {
		super.eliminar(objeto);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizar(Usuario objeto) {
		super.actualizar(objeto);
	}
}
