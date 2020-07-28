package ec.edu.ups.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.Modelo.SignosVitaes;

@Stateless
public class SignosVitalesFacade extends AbstractFacade<SignosVitaes>{
	

    @PersistenceContext(unitName = "DuraznoDominguez-Tito-Examen")
    private EntityManager em;

	public SignosVitalesFacade() {
		super(SignosVitaes.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	
	
}