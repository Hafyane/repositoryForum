package org.forum.pmapp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@NamedQuery(name = "Villeclt.findAll", query = "SELECT v FROM Villeclt v")
public class Villeclt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVille;

	private String description;

	@Size(max = 50)
	@NotBlank
	private String nom;

	// bi-directional many-to-one association to Client
	@OneToMany(mappedBy = "villeclt")
	private List<Client> clients;

	public Villeclt() {
	}

	public Integer getIdVille() {
		return this.idVille;
	}

	public void setIdVille(Integer idVille) {
		this.idVille = idVille;
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

	public List<Client> getClients() {
		return this.clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Client addClient(Client client) {
		getClients().add(client);
		client.setVilleclt(this);

		return client;
	}

	public Client removeClient(Client client) {
		getClients().remove(client);
		client.setVilleclt(null);

		return client;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clients == null) ? 0 : clients.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((idVille == null) ? 0 : idVille.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Villeclt other = (Villeclt) obj;
		if (clients == null) {
			if (other.clients != null)
				return false;
		} else if (!clients.equals(other.clients))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (idVille == null) {
			if (other.idVille != null)
				return false;
		} else if (!idVille.equals(other.idVille))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Villeclt [idVille=" + idVille + ", description=" + description
				+ ", nom=" + nom + ", clients=" + clients + "]";
	}

}