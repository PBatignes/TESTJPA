/**
 * 
 */
package banque.entities.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import banque.entities.Operation;

/**
 * Méthode d'accées à la base de donnée pour les objet de type Operation
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
public class OperationDao {
	
	public void insert(Operation o, EntityManagerFactory entityManagerFactory) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		entityManager.persist(o);

		tx.commit();
		entityManager.close();

	}

}
