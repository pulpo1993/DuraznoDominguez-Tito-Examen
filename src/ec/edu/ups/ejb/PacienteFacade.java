package ec.edu.ups.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.Modelo.Paciente;

@Stateless
public class PacienteFacade extends AbstractFacade<Paciente>{
	

    @PersistenceContext(unitName = "DuraznoDominguez-Tito-Examen")
    private EntityManager em;

	public PacienteFacade() {
		super(Paciente.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	
	
}