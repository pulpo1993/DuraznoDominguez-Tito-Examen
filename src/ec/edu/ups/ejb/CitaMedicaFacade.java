package ec.edu.ups.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.Modelo.CitaMedica;

@Stateless
public class CitaMedicaFacade extends AbstractFacade<CitaMedica>{
	

    @PersistenceContext(unitName = "DuraznoDominguez-Tito-Examen")
    private EntityManager em;

	public CitaMedicaFacade() {
		super(CitaMedica.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	
	
}