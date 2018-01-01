package gimnasio.accesoadatos.impl;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import gimnasio.accesoadatos.IDataAccessRoles;
import gimnasio.dominio.RolUsuario;

@Transactional
public class DataAccessHibernateRoles extends AbstractDataAccessHibernate<RolUsuario, Integer> implements IDataAccessRoles {

	public DataAccessHibernateRoles(RolUsuario objeto, SessionFactory sessionFactory) {
		super(objeto, sessionFactory);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public RolUsuario obtenerPorId(int Id) {
		return super.obtenerPorId(Id);
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<RolUsuario> obtenerTodos() {
		Criteria criteria = createEntityCriteria();
        return (ArrayList<RolUsuario>) criteria.list();
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminar(RolUsuario objeto) {
		super.eliminar(objeto);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizar(RolUsuario objeto) {
		super.actualizar(objeto);
	}
}
