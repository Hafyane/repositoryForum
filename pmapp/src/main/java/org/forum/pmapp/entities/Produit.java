package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the produit database table.
 * 
 */
@Entity
@NamedQuery(name="Produit.findAll", query="SELECT p FROM Produit p")
public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idProduit;

	private String description;

	private String exigenceFonct;

	private String nom;

	private String version;

	//bi-directional many-to-one association to Fournisseur
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur;

	//bi-directional many-to-one association to Technologie
	@OneToMany(mappedBy="produit")
	private List<Technologie> technologies;

	public Produit() {
	}

	public Integer getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExigenceFonct() {
		return this.exigenceFonct;
	}

	public void setExigenceFonct(String exigenceFonct) {
		this.exigenceFonct = exigenceFonct;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Fournisseur getFournisseur() {
		return this.fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public List<Technologie> getTechnologies() {
		return this.technologies;
	}

	public void setTechnologies(List<Technologie> technologies) {
		this.technologies = technologies;
	}

	public Technologie addTechnology(Technologie technology) {
		getTechnologies().add(technology);
		technology.setProduit(this);

		return technology;
	}

	public Technologie removeTechnology(Technologie technology) {
		getTechnologies().remove(technology);
		technology.setProduit(null);

		return technology;
	}

}