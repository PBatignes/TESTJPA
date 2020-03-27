/**
 * 
 */
package banque.entities.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import banque.entities.Virement;

/**
 * Méthode d'accées à la base de donnée pour les objet de type Virement
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
public class VirementDao {
	
	public void insert(Virement v, EntityManagerFactory entityManagerFactory) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		entityManager.persist(v);

		tx.commit();
		entityManager.close();

	}

}
