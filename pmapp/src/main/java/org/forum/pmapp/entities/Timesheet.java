package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the timesheet database table.
 * 
 */
@Entity
@NamedQuery(name="Timesheet.findAll", query="SELECT t FROM Timesheet t")
public class Timesheet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTs;

	private int avancement;

	private String commentaire;

	private int nbrheure;

	//bi-directional many-to-one association to Contrainte
	@ManyToOne
	@JoinColumn(name="idContrainte")
	private Contrainte contrainte;

	//bi-directional many-to-one association to Evaluation
	@ManyToOne
	@JoinColumn(name="idEvaluation")
	private Evaluation evaluation;

	//bi-directional many-to-one association to Microaction
	@ManyToOne
	@JoinColumn(name="idMicroact")
	private Microaction microaction;

	public Timesheet() {
	}

	public Integer getIdTs() {
		return this.idTs;
	}

	public void setIdTs(Integer idTs) {
		this.idTs = idTs;
	}

	public int getAvancement() {
		return this.avancement;
	}

	public void setAvancement(int avancement) {
		this.avancement = avancement;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public int getNbrheure() {
		return this.nbrheure;
	}

	public void setNbrheure(int nbrheure) {
		this.nbrheure = nbrheure;
	}

	public Contrainte getContrainte() {
		return this.contrainte;
	}

	public void setContrainte(Contrainte contrainte) {
		this.contrainte = contrainte;
	}

	public Evaluation getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public Microaction getMicroaction() {
		return this.microaction;
	}

	public void setMicroaction(Microaction microaction) {
		this.microaction = microaction;
	}

}