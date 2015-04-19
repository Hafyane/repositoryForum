package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the contrainte database table.
 * 
 */
@Entity
@NamedQuery(name="Contrainte.findAll", query="SELECT c FROM Contrainte c")
public class Contrainte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idContrainte;

	private String nom;

	//bi-directional many-to-one association to Timesheet
	@OneToMany(mappedBy="contrainte")
	private List<Timesheet> timesheets;

	public Contrainte() {
	}

	public Integer getIdContrainte() {
		return this.idContrainte;
	}

	public void setIdContrainte(Integer idContrainte) {
		this.idContrainte = idContrainte;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Timesheet> getTimesheets() {
		return this.timesheets;
	}

	public void setTimesheets(List<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}

	public Timesheet addTimesheet(Timesheet timesheet) {
		getTimesheets().add(timesheet);
		timesheet.setContrainte(this);

		return timesheet;
	}

	public Timesheet removeTimesheet(Timesheet timesheet) {
		getTimesheets().remove(timesheet);
		timesheet.setContrainte(null);

		return timesheet;
	}

}