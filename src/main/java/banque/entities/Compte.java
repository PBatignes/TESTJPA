/**
 * 
 */
package banque.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**Représentation d'un compte banquaire
 *
 * @author Pierre
 * @since 27/03/2020
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	/** Le numéro de compte */
	private String numero;
	
	/** Le solde du compte */
	private Double solde;
	
	@ManyToMany
	@JoinTable(name = "compte_client", 
		joinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "ID"), 
		inverseJoinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID"))
	private List<Client> clients;

	/**Constructor
	 *
	 * @param numero
	 * @param solde
	 */
	public Compte(List<Client> clients, String numero, Double solde) {
		this.clients = clients;
		this.numero = numero;
		this.solde = solde;
	}

	/**Getter
	 *
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**Setter
	 *
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**Getter
	 *
	 * @return the solde
	 */
	public Double getSolde() {
		return solde;
	}

	/**Setter
	 *
	 * @param solde the solde to set
	 */
	public void setSolde(Double solde) {
		this.solde = solde;
	}

	/**Getter
	 *
	 * @return the clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/**Setter
	 *
	 * @param clients the clients to set
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

}
