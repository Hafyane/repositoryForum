package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the entite database table.
 * 
 */
@Entity
@NamedQuery(name="Entite.findAll", query="SELECT e FROM Entite e")
public class Entite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEntite;

	private String description;

	private String nom;

	//bi-directional many-to-one association to Projet
	@OneToMany(mappedBy="entite")
	private List<Projet> projets;

	public Entite() {
	}

	public Integer getIdEntite() {
		return this.idEntite;
	}

	public void setIdEntite(Integer idEntite) {
		this.idEntite = idEntite;
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

	public List<Projet> getProjets() {
		return this.projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

	public Projet addProjet(Projet projet) {
		getProjets().add(projet);
		projet.setEntite(this);

		return projet;
	}

	public Projet removeProjet(Projet projet) {
		getProjets().remove(projet);
		projet.setEntite(null);

		return projet;
	}

}