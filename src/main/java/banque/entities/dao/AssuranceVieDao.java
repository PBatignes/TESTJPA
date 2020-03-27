/**
 * 
 */
package banque.entities.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import banque.entities.AssuranceVie;

/**
 * Méthode d'accées à la base de donnée pour les objet de type AssuranceVie
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
public class AssuranceVieDao {

	public void insert(AssuranceVie aV, EntityManagerFactory entityManagerFactory) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		entityManager.persist(aV);

		tx.commit();
		entityManager.close();

	}

}
