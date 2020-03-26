/**
 * 
 */
package dev;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entities.Emprunt;
import entities.Livre;

/**
 *
 * @author Pierre
 *
 */
public class TestAnnotation {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		TypedQuery<Emprunt> query = entityManager.createQuery("select e from Emprunt e where e.id = 1", Emprunt.class);
		
		List<Emprunt> list = query.getResultList();
		
		for (Emprunt e : list) {
			List<Livre> livres = e.getLivres();
			for (Livre l : livres) {
				
				System.out.println(l.getTitre());
				
			}
			
		}
		
	}
	
}
