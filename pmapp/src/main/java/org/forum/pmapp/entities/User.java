package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer matricule;

	private String adresse;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateNaiss;

	private String email;

	@Lob
	@Column(insertable=false)
	private byte[] image;

	private String login;

	private String nom;

	private String nomImage;

	private String password;

	private String prenom;

	private String sexe;

	private String telPersnl;

	private String telTravail;

	//bi-directional many-to-one association to Evaluation
	@OneToMany(mappedBy="user")
	private List<Evaluation> evaluations;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="user1")
	private List<Message> messages1;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="user2")
	private List<Message> messages2;

	//bi-directional many-to-one association to Microaction
	@OneToMany(mappedBy="user")
	private List<Microaction> microactions;

	//bi-directional many-to-one association to Projet
	@OneToMany(mappedBy="user")
	private List<Projet> projets;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="idProfile")
	private Profile profile;

	//bi-directional many-to-one association to Statutp
	@ManyToOne
	@JoinColumn(name="idStatut")
	private Statutp statutp;

	//bi-directional many-to-many association to User
	@ManyToMany
	@JoinTable(
		name="affectermu"
		, joinColumns={
			@JoinColumn(name="matriculeNv1")
			}
		, inverseJoinColumns={
			@JoinColumn(name="matriculeNv2")
			}
		)
	private List<User> users1;

	//bi-directional many-to-many association to User
	@ManyToMany(mappedBy="users1")
	private List<User> users2;

	//bi-directional many-to-many association to User
	@ManyToMany
	@JoinTable(
		name="affectermu"
		, joinColumns={
			@JoinColumn(name="matriculeNv2")
			}
		, inverseJoinColumns={
			@JoinColumn(name="matriculeNv1")
			}
		)
	private List<User> users3;

	//bi-directional many-to-many association to User
	@ManyToMany(mappedBy="users3")
	private List<User> users4;

	//bi-directional many-to-one association to Villeusr
	@ManyToOne
	@JoinColumn(name="idVilleusr")
	private Villeusr villeusr;

	public User() {
	}

	public Integer getMatricule() {
		return this.matricule;
	}

	public void setMatricule(Integer matricule) {
		this.matricule = matricule;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateNaiss() {
		return this.dateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomImage() {
		return this.nomImage;
	}

	public void setNomImage(String nomImage) {
		this.nomImage = nomImage;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getTelPersnl() {
		return this.telPersnl;
	}

	public void setTelPersnl(String telPersnl) {
		this.telPersnl = telPersnl;
	}

	public String getTelTravail() {
		return this.telTravail;
	}

	public void setTelTravail(String telTravail) {
		this.telTravail = telTravail;
	}

	public List<Evaluation> getEvaluations() {
		return this.evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public Evaluation addEvaluation(Evaluation evaluation) {
		getEvaluations().add(evaluation);
		evaluation.setUser(this);

		return evaluation;
	}

	public Evaluation removeEvaluation(Evaluation evaluation) {
		getEvaluations().remove(evaluation);
		evaluation.setUser(null);

		return evaluation;
	}

	public List<Message> getMessages1() {
		return this.messages1;
	}

	public void setMessages1(List<Message> messages1) {
		this.messages1 = messages1;
	}

	public Message addMessages1(Message messages1) {
		getMessages1().add(messages1);
		messages1.setUser1(this);

		return messages1;
	}

	public Message removeMessages1(Message messages1) {
		getMessages1().remove(messages1);
		messages1.setUser1(null);

		return messages1;
	}

	public List<Message> getMessages2() {
		return this.messages2;
	}

	public void setMessages2(List<Message> messages2) {
		this.messages2 = messages2;
	}

	public Message addMessages2(Message messages2) {
		getMessages2().add(messages2);
		messages2.setUser2(this);

		return messages2;
	}

	public Message removeMessages2(Message messages2) {
		getMessages2().remove(messages2);
		messages2.setUser2(null);

		return messages2;
	}

	public List<Microaction> getMicroactions() {
		return this.microactions;
	}

	public void setMicroactions(List<Microaction> microactions) {
		this.microactions = microactions;
	}

	public Microaction addMicroaction(Microaction microaction) {
		getMicroactions().add(microaction);
		microaction.setUser(this);

		return microaction;
	}

	public Microaction removeMicroaction(Microaction microaction) {
		getMicroactions().remove(microaction);
		microaction.setUser(null);

		return microaction;
	}

	public List<Projet> getProjets() {
		return this.projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

	public Projet addProjet(Projet projet) {
		getProjets().add(projet);
		projet.setUser(this);

		return projet;
	}

	public Projet removeProjet(Projet projet) {
		getProjets().remove(projet);
		projet.setUser(null);

		return projet;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Statutp getStatutp() {
		return this.statutp;
	}

	public void setStatutp(Statutp statutp) {
		this.statutp = statutp;
	}

	public List<User> getUsers1() {
		return this.users1;
	}

	public void setUsers1(List<User> users1) {
		this.users1 = users1;
	}

	public List<User> getUsers2() {
		return this.users2;
	}

	public void setUsers2(List<User> users2) {
		this.users2 = users2;
	}

	public List<User> getUsers3() {
		return this.users3;
	}

	public void setUsers3(List<User> users3) {
		this.users3 = users3;
	}

	public List<User> getUsers4() {
		return this.users4;
	}

	public void setUsers4(List<User> users4) {
		this.users4 = users4;
	}

	public Villeusr getVilleusr() {
		return this.villeusr;
	}

	public void setVilleusr(Villeusr villeusr) {
		this.villeusr = villeusr;
	}

}