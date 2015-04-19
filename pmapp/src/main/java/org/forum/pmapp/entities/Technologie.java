package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the technologie database table.
 * 
 */
@Entity
@NamedQuery(name="Technologie.findAll", query="SELECT t FROM Technologie t")
public class Technologie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTch;

	private String description;

	private String nom;

	//bi-directional many-to-one association to Microaction
	@OneToMany(mappedBy="technologie")
	private List<Microaction> microactions;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="idProduit")
	private Produit produit;

	public Technologie() {
	}

	public Integer getIdTch() {
		return this.idTch;
	}

	public void setIdTch(Integer idTch) {
		this.idTch = idTch;
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
		microaction.setTechnologie(this);

		return microaction;
	}

	public Microaction removeMicroaction(Microaction microaction) {
		getMicroactions().remove(microaction);
		microaction.setTechnologie(null);

		return microaction;
	}

	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}


	

}