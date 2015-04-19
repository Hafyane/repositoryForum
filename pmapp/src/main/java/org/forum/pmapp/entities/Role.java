package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idRole;

	private String description;

	private String nom;

	//bi-directional many-to-many association to Profile
	@ManyToMany(mappedBy="roles1")
	private List<Profile> profiles1;

	//bi-directional many-to-many association to Profile
	@ManyToMany
	@JoinTable(
		name="affecterpr"
		, joinColumns={
			@JoinColumn(name="idRole")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idProfile")
			}
		)
	private List<Profile> profiles2;

	public Role() {
	}

	public Integer getIdRole() {
		return this.idRole;
	}

	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
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

	public List<Profile> getProfiles1() {
		return this.profiles1;
	}

	public void setProfiles1(List<Profile> profiles1) {
		this.profiles1 = profiles1;
	}

	public List<Profile> getProfiles2() {
		return this.profiles2;
	}

	public void setProfiles2(List<Profile> profiles2) {
		this.profiles2 = profiles2;
	}

}