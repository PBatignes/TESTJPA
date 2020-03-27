/**
 * 
 */
package banque.dev;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import banque.entities.Adresse;
import banque.entities.AssuranceVie;
import banque.entities.Banque;
import banque.entities.Client;
import banque.entities.Compte;
import banque.entities.LivretA;
import banque.entities.Operation;
import banque.entities.Virement;
import banque.entities.dao.AssuranceVieDao;
import banque.entities.dao.BanqueDao;
import banque.entities.dao.ClientDao;
import banque.entities.dao.CompteDao;
import banque.entities.dao.LivretADao;
import banque.entities.dao.OperationDao;
import banque.entities.dao.VirementDao;

/**
 *
 * @author Pierre
 * @since 07/03/2020
 *
 */
public class App {

	
	public static void main(String[] args) {
		
		//Drop and create les table en base de donnée
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque_pu");
		
		//Insertion d'une instance de banque en bdd
		Banque b = new Banque("Banque Courtois");
		BanqueDao banque = new BanqueDao();
		
		banque.insert(b, entityManagerFactory);
		
		//Insertion d'une instance de client en bdd
		Client c = new Client("Lecompte", "Jean", LocalDate.parse("1990-10-15"), 
				new Adresse(10, "rue des morpions", 31000, "Toulouse"), 
				b);
		Client c1 = new Client("Dicule", "Henri", LocalDate.parse("1985-02-20"), 
				new Adresse(3, "rue des virage", 69001, "Lyon"), 
				b);
		ClientDao client = new ClientDao();
		
		client.insert(c, entityManagerFactory);
		client.insert(c1, entityManagerFactory);
		
		List<Client> clients = new ArrayList<>();
		clients.add(c);
		clients.add(c1);
		
		//Insertion d'une instance de compte en bdd
		Compte cp = new Compte(clients, "123456", 1562.25);
		CompteDao compte = new CompteDao();
		
		compte.insert(cp, entityManagerFactory);
		
		clients.remove(1);
		
		//Insertion d'une instance d'assurance vie en bdd
		AssuranceVie ass = new AssuranceVie(new Compte(clients, "789654", 1500.00), LocalDate.parse("2050-10-20"), 5.00);
		AssuranceVieDao asDao = new AssuranceVieDao();
		
		asDao.insert(ass, entityManagerFactory);
		
		//Insertion d'une instance de livretA en bdd
		LivretA lA = new LivretA(new Compte(clients, "456128", 1200.00), 10.00);
		LivretADao lAdao = new LivretADao();
		
		lAdao.insert(lA, entityManagerFactory);
		
		//Insertion d'une instance de Virement en bdd
		Virement v = new Virement(new Operation(LocalDateTime.parse("2019-02-10T15:21:18"), 500.00, "Achat vélo", cp), "VéloLand");
		VirementDao vDao = new VirementDao();
		
		vDao.insert(v, entityManagerFactory);
		
		//Insertion d'une instance de Operation en bdd
		Operation op = new Operation(LocalDateTime.parse("2020-04-05T10:30:00"), 100.00, "Impôt", cp);
		OperationDao oDao = new OperationDao();
		
		oDao.insert(op, entityManagerFactory);
		
		entityManagerFactory.close();

	}

}
