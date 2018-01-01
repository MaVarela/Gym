package gimnasio.accesoadatos.impl;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import gimnasio.accesoadatos.IDataAccessUsuarios;
import gimnasio.dominio.Usuario;

@Transactional
public class DataAccessHibernateUsuarios extends AbstractDataAccessHibernate<Usuario, Integer> implements IDataAccessUsuarios {
	
	public DataAccessHibernateUsuarios(Usuario objeto, SessionFactory sessionFactory) {
		super(objeto, sessionFactory);
	}
	
	@Override
	public void insertar(Usuario objeto) {
		super.insertar(objeto);
	}

	@Override
	public Usuario obtenerPorId(int Id) {
		return super.obtenerPorId(Id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Usuario> obtenerTodos() {
		Criteria criteria = createEntityCriteria();
		return (ArrayList<Usuario>) criteria.list();
	}

	@Override
	public void eliminar(Usuario objeto) {
		super.eliminar(objeto);
	}

	@Override
	public void actualizar(Usuario objeto) {
		super.actualizar(objeto);
	}
}
