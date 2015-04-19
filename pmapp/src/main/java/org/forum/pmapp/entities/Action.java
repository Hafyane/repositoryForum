package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the action database table.
 * 
 */
@Entity
@NamedQuery(name="Action.findAll", query="SELECT a FROM Action a")
public class Action implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idAction;

	private String description;

	private String nom;

	//bi-directional many-to-one association to Etape
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="idEtape")
	private Etape etape;

	//bi-directional many-to-one association to Sousaction
	@OneToMany(mappedBy="action")
	private List<Sousaction> sousactions;

	public Action() {
	}

	public Integer getIdAction() {
		return this.idAction;
	}

	public void setIdAction(Integer idAction) {
		this.idAction = idAction;
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

	public Etape getEtape() {
		return this.etape;
	}

	public void setEtape(Etape etape) {
		this.etape = etape;
	}

	public List<Sousaction> getSousactions() {
		return this.sousactions;
	}

	public void setSousactions(List<Sousaction> sousactions) {
		this.sousactions = sousactions;
	}

	public Sousaction addSousaction(Sousaction sousaction) {
		getSousactions().add(sousaction);
		sousaction.setAction(this);

		return sousaction;
	}

	public Sousaction removeSousaction(Sousaction sousaction) {
		getSousactions().remove(sousaction);
		sousaction.setAction(null);

		return sousaction;
	}

}