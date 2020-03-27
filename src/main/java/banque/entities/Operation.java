/**
 * 
 */
package banque.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**Représentation d'une opération banquaire
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	/** Date de l'opération */
	@Column(name = "DATE")
	private LocalDateTime date;
	
	/** Montant de l'opération */
	@Column(name = "MONTANT")
	private Double montant;
	
	/** Motif de l'opération */
	@Column(name = "MOTIF")
	private String motif;
	
	@ManyToOne
	@JoinColumn(name ="ID_COMPTE")
	private Compte compte;

	/**Constructor
	 *
	 * @param date
	 * @param montant
	 * @param motif
	 */
	public Operation(LocalDateTime date, Double montant, String motif) {
		super();
		this.date = date;
		this.montant = montant;
		this.motif = motif;
	}

	/**Constructor
	 *
	 * @param date
	 * @param montant
	 * @param motif
	 * @param compte
	 */
	public Operation(LocalDateTime date, Double montant, String motif, Compte compte) {
		this.date = date;
		this.montant = montant;
		this.motif = motif;
		this.compte = compte;
	}

	/**Getter
	 *
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**Setter
	 *
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/**Getter
	 *
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}

	/**Setter
	 *
	 * @param montant the montant to set
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}

	/**Getter
	 *
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/**Setter
	 *
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/**Getter
	 *
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/**Setter
	 *
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}
