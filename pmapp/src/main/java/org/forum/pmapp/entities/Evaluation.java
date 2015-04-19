package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the evaluation database table.
 * 
 */
@Entity
@NamedQuery(name="Evaluation.findAll", query="SELECT e FROM Evaluation e")
public class Evaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEvaluation;

	private String commentaire;

	private String etat;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="matricule")
	private User user;

	//bi-directional many-to-one association to Timesheet
	@OneToMany(mappedBy="evaluation")
	private List<Timesheet> timesheets;

	public Evaluation() {
	}

	public Integer getIdEvaluation() {
		return this.idEvaluation;
	}

	public void setIdEvaluation(Integer idEvaluation) {
		this.idEvaluation = idEvaluation;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
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
		timesheet.setEvaluation(this);

		return timesheet;
	}

	public Timesheet removeTimesheet(Timesheet timesheet) {
		getTimesheets().remove(timesheet);
		timesheet.setEvaluation(null);

		return timesheet;
	}

}