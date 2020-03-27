/**
 * 
 */
package banque.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**Représentation d'un client
 *
 * @author Pierre
 * @since 07/03/202
 *
 */
@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	/** Nom du client*/
	@Column(name = "NOM")
	private String nom;
	
	/** Prenom du client */
	@Column(name = "PRENOM")
	private String prenom;
	
	/** DateNaissance du client */
	@Column(name = "DATE_NAISSANCE")
	private LocalDate dateNaissance;
	
	/** Adresse du client */
	@Embedded
	private Adresse adresse;
	
	@ManyToOne
	@JoinColumn(name ="ID_BANQUE")
	private Banque banque;

	/**Constructor
	 *
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 */
	public Client(String nom, String prenom, LocalDate dateNaissance, Adresse adresse, Banque banque) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.banque = banque;
	}

	/**Getter
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**Setter
	 *
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**Getter
	 *
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**Setter
	 *
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**Getter
	 *
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**Setter
	 *
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**Getter
	 *
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**Setter
	 *
	 * @param banque the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

}
