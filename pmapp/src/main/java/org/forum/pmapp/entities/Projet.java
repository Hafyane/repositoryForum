package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the projet database table.
 * 
 */
@Entity
@NamedQuery(name="Projet.findAll", query="SELECT p FROM Projet p")
public class Projet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idProjet;

	private String description;

	private String duree;

	private String nom;

	//bi-directional many-to-one association to Phase
	@OneToMany(mappedBy="projet")
	private List<Phase> phases;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="idClt")
	private Client client;

	//bi-directional many-to-one association to Entite
	@ManyToOne
	@JoinColumn(name="idEntite")
	private Entite entite;

	//bi-directional many-to-one association to Retard
	@ManyToOne
	@JoinColumn(name="idRetard")
	private Retard retard;

	//bi-directional many-to-one association to Statutprj
	@ManyToOne
	@JoinColumn(name="idStatut")
	private Statutprj statutprj;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="matricule")
	private User user;

	public Projet() {
	}

	public Integer getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(Integer idProjet) {
		this.idProjet = idProjet;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuree() {
		return this.duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Phase> getPhases() {
		return this.phases;
	}

	public void setPhases(List<Phase> phases) {
		this.phases = phases;
	}

	public Phase addPhas(Phase phas) {
		getPhases().add(phas);
		phas.setProjet(this);

		return phas;
	}

	public Phase removePhas(Phase phas) {
		getPhases().remove(phas);
		phas.setProjet(null);

		return phas;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Entite getEntite() {
		return this.entite;
	}

	public void setEntite(Entite entite) {
		this.entite = entite;
	}

	public Retard getRetard() {
		return this.retard;
	}

	public void setRetard(Retard retard) {
		this.retard = retard;
	}

	public Statutprj getStatutprj() {
		return this.statutprj;
	}

	public void setStatutprj(Statutprj statutprj) {
		this.statutprj = statutprj;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}