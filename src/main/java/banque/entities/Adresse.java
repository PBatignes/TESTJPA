/**
 * 
 */
package banque.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**Représentation d'une adresse
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
@Embeddable
public class Adresse {
	
	/** numero de rue */
	@Column(name = "NUMERO")
	private Integer numero;
	
	/** rue */
	@Column(name = "RUE")
	private String rue;
	
	/** codePostal de la ville */
	@Column(name = "CODE_POSTAL")
	private Integer codePostal;
	
	/** ville */
	@Column(name = "VILLE")
	private String ville;

	/**Constructor
	 *
	 */
	public Adresse() {
	}

	/**Constructor
	 *
	 * @param numero
	 * @param rue
	 * @param codePostal
	 * @param ville
	 */
	public Adresse(Integer numero, String rue, Integer codePostal, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	/**Getter
	 *
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**Setter
	 *
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**Getter
	 *
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**Setter
	 *
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**Getter
	 *
	 * @return the codePostal
	 */
	public Integer getCodePostal() {
		return codePostal;
	}

	/**Setter
	 *
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	/**Getter
	 *
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**Setter
	 *
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

}
