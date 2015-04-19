package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the statutma database table.
 * 
 */
@Entity
@NamedQuery(name="Statutma.findAll", query="SELECT s FROM Statutma s")
public class Statutma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idStatut;

	private String description;

	private String nom;

	//bi-directional many-to-one association to Microaction
	@OneToMany(mappedBy="statutma")
	private List<Microaction> microactions;

	public Statutma() {
	}

	public Integer getIdStatut() {
		return this.idStatut;
	}

	public void setIdStatut(Integer idStatut) {
		this.idStatut = idStatut;
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
		microaction.setStatutma(this);

		return microaction;
	}

	public Microaction removeMicroaction(Microaction microaction) {
		getMicroactions().remove(microaction);
		microaction.setStatutma(null);

		return microaction;
	}

}