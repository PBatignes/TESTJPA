/**
 * 
 */
package entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Pierre
 *
 */
@Entity
public class Emprunt {

	@Id
	@Column(name = "ID")
	private Integer id;

	@ManyToMany
	@JoinTable(name = "compo", 
		joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"), 
		inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private List<Livre> livres;

	@Column(name = "DATE_DEBUT")
	private Date dateDebut;

	@Column(name = "DATE_FIN")
	private Date dateFin;

	@Column(name = "DELAI")
	private Integer delai;

	@Column(name = "ID_CLIENT")
	private Integer idClient;
	
	@ManyToOne
	@JoinColumn(name ="ID_CLIENT", insertable = false, updatable = false)
	private Client client;

	/**
	 * Constructor
	 *
	 */
	public Emprunt() {
	}

	/**
	 * Getter
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 *
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter
	 *
	 * @return the livres
	 */
	public List<Livre> getLivres() {
		return livres;
	}

	/**
	 * Setter
	 *
	 * @param livres the livres to set
	 */
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	/**
	 * Getter
	 *
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter
	 *
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter
	 *
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 *
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Getter
	 *
	 * @return the delai
	 */
	public Integer getDelai() {
		return delai;
	}

	/**
	 * Setter
	 *
	 * @param delai the delai to set
	 */
	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	/**
	 * Getter
	 *
	 * @return the idClient
	 */
	public Integer getIdClient() {
		return idClient;
	}

	/**
	 * Setter
	 *
	 * @param idClient the idClient to set
	 */
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

}
