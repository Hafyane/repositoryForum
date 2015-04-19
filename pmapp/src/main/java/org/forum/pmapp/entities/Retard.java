package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the retard database table.
 * 
 */
@Entity
@NamedQuery(name="Retard.findAll", query="SELECT r FROM Retard r")
public class Retard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idRetard;

	private String cause;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datePrevut;

	//bi-directional many-to-one association to Projet
	@OneToMany(mappedBy="retard")
	private List<Projet> projets;

	public Retard() {
	}

	public Integer getIdRetard() {
		return this.idRetard;
	}

	public void setIdRetard(Integer idRetard) {
		this.idRetard = idRetard;
	}

	public String getCause() {
		return this.cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public Date getDatePrevut() {
		return this.datePrevut;
	}

	public void setDatePrevut(Date datePrevut) {
		this.datePrevut = datePrevut;
	}

	public List<Projet> getProjets() {
		return this.projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

	public Projet addProjet(Projet projet) {
		getProjets().add(projet);
		projet.setRetard(this);

		return projet;
	}

	public Projet removeProjet(Projet projet) {
		getProjets().remove(projet);
		projet.setRetard(null);

		return projet;
	}

}