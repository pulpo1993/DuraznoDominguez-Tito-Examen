package ups.edu.ec.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import ups.edu.ec.Modelo.Paciente;

public class testAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = Persistence.createEntityManagerFactory("DuraznoDominguez-Tito-Examen").createEntityManager();
		Paciente p = new Paciente("010","t","b","b","b","b");
		em.getTransaction().begin();
		em.persist(p);
		em.persist(new Paciente("010","t","b","b","b","b"));
		em.getTransaction().commit();
	}

}
