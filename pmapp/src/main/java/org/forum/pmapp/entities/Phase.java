package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the phase database table.
 * 
 */
@Entity
@NamedQuery(name="Phase.findAll", query="SELECT p FROM Phase p")
public class Phase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPhase;

	private String description;

	private String nom;

	//bi-directional many-to-one association to Etape
	@OneToMany(mappedBy="phase")
	private List<Etape> etapes;

	//bi-directional many-to-one association to Projet
	@ManyToOne
	@JoinColumn(name="idProjet")
	private Projet projet;

	public Phase() {
	}

	public Integer getIdPhase() {
		return this.idPhase;
	}

	public void setIdPhase(Integer idPhase) {
		this.idPhase = idPhase;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Etape> getEtapes() {
		return this.etapes;
	}

	public void setEtapes(List<Etape> etapes) {
		this.etapes = etapes;
	}

	public Etape addEtape(Etape etape) {
		getEtapes().add(etape);
		etape.setPhase(this);

		return etape;
	}

	public Etape removeEtape(Etape etape) {
		getEtapes().remove(etape);
		etape.setPhase(null);

		return etape;
	}

	public Projet getProjet() {
		return this.projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

}