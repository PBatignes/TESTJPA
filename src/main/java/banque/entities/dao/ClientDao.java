/**
 * 
 */
package banque.entities.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import banque.entities.Client;

/**Méthode d'accées à la base de donnée pour les objet de type Client
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
public class ClientDao {
	
	public void insert(Client c, EntityManagerFactory entityManagerFactory) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
		
		entityManager.persist(c);
		
		tx.commit();
		entityManager.close();
		
	}

}
