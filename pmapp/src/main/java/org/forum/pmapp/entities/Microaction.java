package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the microaction database table.
 * 
 */
@Entity
@NamedQuery(name="Microaction.findAll", query="SELECT m FROM Microaction m")
public class Microaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idMicroact;

	private String description;

	private String niveau;

	private String nom;

	//bi-directional many-to-one association to Sousaction
	@ManyToOne
	@JoinColumn(name="idSousact")
	private Sousaction sousaction;

	//bi-directional many-to-one association to Statutma
	@ManyToOne
	@JoinColumn(name="idStatut")
	private Statutma statutma;

	//bi-directional many-to-one association to Technologie
	@ManyToOne
	@JoinColumn(name="idTch")
	private Technologie technologie;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="matricule")
	private User user;

	//bi-directional many-to-one association to Timesheet
	@OneToMany(mappedBy="microaction")
	private List<Timesheet> timesheets;

	public Microaction() {
	}

	public Integer getIdMicroact() {
		return this.idMicroact;
	}

	public void setIdMicroact(Integer idMicroact) {
		this.idMicroact = idMicroact;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNiveau() {
		return this.niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Sousaction getSousaction() {
		return this.sousaction;
	}

	public void setSousaction(Sousaction sousaction) {
		this.sousaction = sousaction;
	}

	public Statutma getStatutma() {
		return this.statutma;
	}

	public void setStatutma(Statutma statutma) {
		this.statutma = statutma;
	}

	public Technologie getTechnologie() {
		return this.technologie;
	}

	public void setTechnologie(Technologie technologie) {
		this.technologie = technologie;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Timesheet> getTimesheets() {
		return this.timesheets;
	}

	public void setTimesheets(List<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}

	public Timesheet addTimesheet(Timesheet timesheet) {
		getTimesheets().add(timesheet);
		timesheet.setMicroaction(this);

		return timesheet;
	}

	public Timesheet removeTimesheet(Timesheet timesheet) {
		getTimesheets().remove(timesheet);
		timesheet.setMicroaction(null);

		return timesheet;
	}

}