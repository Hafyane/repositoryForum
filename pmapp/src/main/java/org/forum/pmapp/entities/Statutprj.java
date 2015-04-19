package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the statutprj database table.
 * 
 */
@Entity
@NamedQuery(name="Statutprj.findAll", query="SELECT s FROM Statutprj s")
public class Statutprj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idStatut;

	private String description;

	private String nom;

	//bi-directional many-to-one association to Projet
	@OneToMany(mappedBy="statutprj")
	private List<Projet> projets;

	public Statutprj() {
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

	public List<Projet> getProjets() {
		return this.projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

	public Projet addProjet(Projet projet) {
		getProjets().add(projet);
		projet.setStatutprj(this);

		return projet;
	}

	public Projet removeProjet(Projet projet) {
		getProjets().remove(projet);
		projet.setStatutprj(null);

		return projet;
	}

}