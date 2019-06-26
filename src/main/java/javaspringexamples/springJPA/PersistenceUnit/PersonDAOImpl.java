package javaspringexamples.springJPA.PersistenceUnit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */

public class PersonDAOImpl implements PersonDAO {

	@PersistenceUnit
	private EntityManagerFactory emf;

	public void save(Person p) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(p);
		transaction.commit();
		em.close();
	}
}
