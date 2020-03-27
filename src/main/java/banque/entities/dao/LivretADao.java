/**
 * 
 */
package banque.entities.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import banque.entities.LivretA;

/**
 * Méthode d'accées à la base de donnée pour les objet de type LivretA
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
public class LivretADao {
	
	public void insert(LivretA lA, EntityManagerFactory entityManagerFactory) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		entityManager.persist(lA);

		tx.commit();
		entityManager.close();

	}

}
