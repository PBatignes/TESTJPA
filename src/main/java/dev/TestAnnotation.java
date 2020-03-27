/**
 * 
 */
package dev;

import java.util.List;
import java.util.Scanner;

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
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Selectionnez l'ID de l'emprunt à récupérer : ");
		int i = scan.nextInt();
		
		TypedQuery<Emprunt> query = entityManager.createQuery("select e from Emprunt e where e.id = ?1", Emprunt.class);
		query.setParameter(1, i);
		
		List<Emprunt> list = query.getResultList();
		
		System.out.println("Les livres de l'emprunt donné sont : \n");
		
		for (Emprunt e : list) {
			List<Livre> livres = e.getLivres();
			for (Livre l : livres) {
				
				System.out.println(l.getTitre());
				
			}
			
		}
		
		System.out.println("Selectionnez l'ID de du client à récupérer : ");
		i = scan.nextInt();
		
		TypedQuery<Emprunt> query2 = entityManager.createQuery("select e from Emprunt e where e.client.id = ?1", Emprunt.class);
		query2.setParameter(1, i);
		list = query2.getResultList();
		
		System.out.println("Les emprunts du client donné sont : \n");
		
		for (Emprunt e : list) {
			List<Livre> livres = e.getLivres();
			for (Livre l : livres) {
				
				System.out.println(l.getTitre());
				
			}
			
		}
		
		
		entityManager.close();
		entityManagerFactory.close();
		
	}
	
}
