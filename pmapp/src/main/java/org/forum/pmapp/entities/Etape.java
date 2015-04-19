package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the etape database table.
 * 
 */
@Entity
@NamedQuery(name="Etape.findAll", query="SELECT e FROM Etape e")
public class Etape implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEtape;

	private String description;

	private String nom;

	//bi-directional many-to-one association to Action
	@OneToMany(mappedBy="etape", cascade={CascadeType.ALL})
	private List<Action> actions;

	//bi-directional many-to-one association to Phase
	@ManyToOne
	@JoinColumn(name="idPhase")
	private Phase phase;

	public Etape() {
	}

	public Integer getIdEtape() {
		return this.idEtape;
	}

	public void setIdEtape(Integer idEtape) {
		this.idEtape = idEtape;
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

	public List<Action> getActions() {
		return this.actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public Action addAction(Action action) {
		getActions().add(action);
		action.setEtape(this);

		return action;
	}

	public Action removeAction(Action action) {
		getActions().remove(action);
		action.setEtape(null);

		return action;
	}

	public Phase getPhase() {
		return this.phase;
	}

	public void setPhase(Phase phase) {
		this.phase = phase;
	}

}