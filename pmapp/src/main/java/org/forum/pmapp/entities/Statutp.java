package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the statutp database table.
 * 
 */
@Entity
@NamedQuery(name="Statutp.findAll", query="SELECT s FROM Statutp s")
public class Statutp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idStatut;

	private String cause;

	private String descriptiont;

	private String statut;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="statutp")
	private List<User> users;

	public Statutp() {
	}

	public Integer getIdStatut() {
		return this.idStatut;
	}

	public void setIdStatut(Integer idStatut) {
		this.idStatut = idStatut;
	}

	public String getCause() {
		return this.cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getDescriptiont() {
		return this.descriptiont;
	}

	public void setDescriptiont(String descriptiont) {
		this.descriptiont = descriptiont;
	}

	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setStatutp(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setStatutp(null);

		return user;
	}

}