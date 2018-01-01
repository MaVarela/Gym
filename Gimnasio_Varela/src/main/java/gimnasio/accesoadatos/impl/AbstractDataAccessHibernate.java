package gimnasio.accesoadatos.impl;

import java.io.Serializable;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractDataAccessHibernate <T, TId extends Serializable>{
	
	private T clasePersistente;
	
	public AbstractDataAccessHibernate(T objeto, SessionFactory sessionFactory){
		this.clasePersistente = objeto;
		this.sessionFactory = sessionFactory;
    }
		
    private SessionFactory sessionFactory;
 
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertar(T objeto) {
		getSession().persist(objeto);
	}

	
	@SuppressWarnings("unchecked")
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public T obtenerPorId(TId Id) {
		return (T) getSession().get(clasePersistente.getClass(), Id);
	}

	
	protected Criteria createEntityCriteria(){
        return getSession().createCriteria(clasePersistente.getClass());
    }

	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminar(T objeto) {
		getSession().delete(objeto);							
	}

	
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizar(T objeto) {
		getSession().update(objeto);
	}
}
