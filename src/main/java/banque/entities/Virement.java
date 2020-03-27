/**
 * 
 */
package banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

/**Représentation d'une opération de type virement
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
@Entity
public class Virement extends Operation {
	
	/** beneficiaire du virement*/
	@Column(name = "BENEFICIAIRE")
	private String beneficiaire;

	/**Constructor
	 *
	 * @param beneficiaire
	 */
	public Virement(Operation o, String beneficiaire) {
		super(o.getDate(), o.getMontant(), o.getMotif(), o.getCompte());
		this.beneficiaire = beneficiaire;
	}

	/**Getter
	 *
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**Setter
	 *
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

}
