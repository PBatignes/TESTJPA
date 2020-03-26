package dev;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entities.Livre;


public class TestJpa {
	
	private static final Logger LOGGER = Logger.getLogger(TestJpa.class.getName());
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		LOGGER.log(Level.INFO, "EntityManager : " + entityManager.isOpen());
		
		Livre l1 = entityManager.find(Livre.class, 1);
		System.out.println("id du livre " + l1.getId());
		System.out.println("titre du livre " + l1.getTitre());
		System.out.println("auteur du livre " + l1.getAuteur());
		
		String s = "Germinal";
		TypedQuery<Livre> query = entityManager.createQuery("select l from Livre l where l.titre = ?1", Livre.class);
		query.setParameter(1, s);
		List<Livre> list = query.getResultList();
		
		for (Livre l : list) {
			
			System.out.println("id du livre " + l.getId());
			System.out.println("titre du livre " + l.getTitre());
			System.out.println("auteur du livre " + l.getAuteur());
			
		}
		
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
