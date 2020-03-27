/**
 * 
 */
package banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Représentation d'une banque
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
@Entity
public class Banque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	/** Le nom de la banque */
	@Column(name = "NOM")
	private String nom;

	/**
	 * Constructor
	 *
	 */
	public Banque() {
	}

	/**
	 * Constructor
	 *
	 * @param nom
	 */
	public Banque(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
