/**
 * 
 */
package banque.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

/**Représentation d'un compte de type assurance vie
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
@Entity
public class AssuranceVie extends Compte {
	
	/** dateFin */
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	
	/** taux */
	@Column(name = "TAUX")
	private Double taux;

	/**Constructor
	 *
	 * @param dateFin
	 * @param taux
	 */
	public AssuranceVie(Compte compte, LocalDate dateFin, Double taux) {
		super(compte.getClients(), compte.getNumero(), compte.getSolde());
		this.dateFin = dateFin;
		this.taux = taux;
	}

	/**Getter
	 *
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**Setter
	 *
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/**Getter
	 *
	 * @return the taux
	 */
	public Double getTaux() {
		return taux;
	}

	/**Setter
	 *
	 * @param taux the taux to set
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}

}
