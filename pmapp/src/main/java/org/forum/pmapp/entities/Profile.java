package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the profile database table.
 * 
 */
@Entity
@NamedQuery(name="Profile.findAll", query="SELECT p FROM Profile p")
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idProfile;

	private String description;

	private String nom;

	//bi-directional many-to-many association to Role
	@ManyToMany
	@JoinTable(
		name="affecterpr"
		, joinColumns={
			@JoinColumn(name="idProfile")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idRole")
			}
		)
	private List<Role> roles1;

	//bi-directional many-to-many association to Role
	@ManyToMany(mappedBy="profiles2")
	private List<Role> roles2;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="profile")
	private List<User> users;

	public Profile() {
	}

	public Integer getIdProfile() {
		return this.idProfile;
	}

	public void setIdProfile(Integer idProfile) {
		this.idProfile = idProfile;
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

	public List<Role> getRoles1() {
		return this.roles1;
	}

	public void setRoles1(List<Role> roles1) {
		this.roles1 = roles1;
	}

	public List<Role> getRoles2() {
		return this.roles2;
	}

	public void setRoles2(List<Role> roles2) {
		this.roles2 = roles2;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setProfile(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setProfile(null);

		return user;
	}

}