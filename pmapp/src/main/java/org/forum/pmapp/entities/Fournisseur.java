package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the fournisseur database table.
 * 
 */
@Entity
@NamedQuery(name="Fournisseur.findAll", query="SELECT f FROM Fournisseur f")
public class Fournisseur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idFournisseur;

	private String description;

	private String nom;

	//bi-directional many-to-one association to Produit
	@OneToMany(mappedBy="fournisseur")
	private List<Produit> produits;

	public Fournisseur() {
	}

	public Integer getIdFournisseur() {
		return this.idFournisseur;
	}

	public void setIdFournisseur(Integer idFournisseur) {
		this.idFournisseur = idFournisseur;
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

	public List<Produit> getProduits() {
		return this.produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public Produit addProduit(Produit produit) {
		getProduits().add(produit);
		produit.setFournisseur(this);

		return produit;
	}

	public Produit removeProduit(Produit produit) {
		getProduits().remove(produit);
		produit.setFournisseur(null);

		return produit;
	}

}