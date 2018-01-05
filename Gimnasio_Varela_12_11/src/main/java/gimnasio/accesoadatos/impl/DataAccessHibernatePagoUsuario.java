package gimnasio.accesoadatos.impl;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import gimnasio.accesoadatos.IDataAccessPagoUsuario;
import gimnasio.dominio.PagoUsuario;
import gimnasio.dominio.PagoUsuarioId;

public class DataAccessHibernatePagoUsuario extends AbstractDataAccessHibernate<PagoUsuario, PagoUsuarioId> implements IDataAccessPagoUsuario{

	public DataAccessHibernatePagoUsuario(PagoUsuario objeto, SessionFactory sessionFactory) {
		super(objeto, sessionFactory);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertar(PagoUsuario objeto)
	{
		super.insertar(objeto);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<PagoUsuario> obtenerTodos() {
		
		Criteria criteria = createEntityCriteria();
		ArrayList<PagoUsuario> result = (ArrayList<PagoUsuario>) criteria.list();
				
        return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<PagoUsuario> obtenerPagosPorFechaDesc() {
		
		ArrayList<PagoUsuario> result = (ArrayList<PagoUsuario>) getSession().getNamedQuery("getPagosFechaDesc").list();
		
		for(PagoUsuario pago : result)
		{
			Hibernate.initialize(pago.getDisciplina());
			Hibernate.initialize(pago.getUsuario());
		}
		
		return result;
	}
}
