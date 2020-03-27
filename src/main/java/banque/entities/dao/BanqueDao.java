/**
 * 
 */
package banque.entities.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import banque.entities.Banque;

/**Méthode d'accées à la base de donnée pour les objet de type Banque
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
public class BanqueDao {
	
	/**Insère l'objet Banque passé en paramètre dans une basse de donnée
	 * 
	 * @param b une banque à insérer en base de donnée
	 */
	public void insert(Banque b, EntityManagerFactory entityManagerFactory) {
		
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction tx1 = entityManager.getTransaction();
        tx1.begin();
		
		entityManager.persist(b);
		
		tx1.commit();
		entityManager.close();
		
		
	}

}
