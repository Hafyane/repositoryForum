package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sousaction database table.
 * 
 */
@Entity
@NamedQuery(name="Sousaction.findAll", query="SELECT s FROM Sousaction s")
public class Sousaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idSousact;

	private String description;

	private String nom;

	//bi-directional many-to-one association to Microaction
	@OneToMany(mappedBy="sousaction")
	private List<Microaction> microactions;

	//bi-directional many-to-one association to Action
	@ManyToOne
	@JoinColumn(name="idAction")
	private Action action;

	public Sousaction() {
	}

	public Integer getIdSousact() {
		return this.idSousact;
	}

	public void setIdSousact(Integer idSousact) {
		this.idSousact = idSousact;
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

	public List<Microaction> getMicroactions() {
		return this.microactions;
	}

	public void setMicroactions(List<Microaction> microactions) {
		this.microactions = microactions;
	}

	public Microaction addMicroaction(Microaction microaction) {
		getMicroactions().add(microaction);
		microaction.setSousaction(this);

		return microaction;
	}

	public Microaction removeMicroaction(Microaction microaction) {
		getMicroactions().remove(microaction);
		microaction.setSousaction(null);

		return microaction;
	}

	public Action getAction() {
		return this.action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

}