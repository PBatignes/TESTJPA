/**
 * 
 */
package banque.entities.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import banque.entities.Compte;

/**
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
public class CompteDao {
	
	public void insert(Compte c, EntityManagerFactory entityManagerFactory) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		
		entityManager.persist(c);
		
		tx.commit();
		entityManager.close();
		
	}

}
