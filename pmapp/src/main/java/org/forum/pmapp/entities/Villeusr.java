package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the villeusr database table.
 * 
 */
@Entity
@NamedQuery(name="Villeusr.findAll", query="SELECT v FROM Villeusr v")
public class Villeusr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idVilleusr;

	private String description;

	private String nom;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="villeusr")
	private List<User> users;

	public Villeusr() {
	}

	public Integer getIdVilleusr() {
		return this.idVilleusr;
	}

	public void setIdVilleusr(Integer idVilleusr) {
		this.idVilleusr = idVilleusr;
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

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setVilleusr(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setVilleusr(null);

		return user;
	}

}