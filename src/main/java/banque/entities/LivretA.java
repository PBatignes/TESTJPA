/**
 * 
 */
package banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

/**Représentation d'un compte de type livret A
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
@Entity
public class LivretA extends Compte {
	
	/** Taux du livret A*/
	@Column(name = "TAUX")
	private Double taux;

	/**Constructor
	 *
	 * @param taux
	 */
	public LivretA(Compte compte, Double taux) {
		super(compte.getClients(), compte.getNumero(), compte.getSolde());
		this.taux = taux;
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
