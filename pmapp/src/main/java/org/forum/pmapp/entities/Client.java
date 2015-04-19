package org.forum.pmapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idClt;

	private String activite;

	private String adresse;

	private String adresseWeb;

	private Double capital;

	private String email;

	private String fax;

	private String formeJuridique;

	@Lob
	private byte[] image;

	private String nom;

	private String nomImage;

	private String tel;

	private String type;

	private String ville;

	//bi-directional many-to-one association to Villeclt
	@ManyToOne
	@JoinColumn(name="idVille")
	private Villeclt villeclt;

	//bi-directional many-to-one association to Projet
	@OneToMany(mappedBy="client")
	private List<Projet> projets;

	public Client() {
	}

	public Integer getIdClt() {
		return this.idClt;
	}

	public void setIdClt(Integer idClt) {
		this.idClt = idClt;
	}

	public String getActivite() {
		return this.activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getAdresseWeb() {
		return this.adresseWeb;
	}

	public void setAdresseWeb(String adresseWeb) {
		this.adresseWeb = adresseWeb;
	}

	public Double getCapital() {
		return this.capital;
	}

	public void setCapital(Double capital) {
		this.capital = capital;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFormeJuridique() {
		return this.formeJuridique;
	}

	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
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

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Villeclt getVilleclt() {
		return this.villeclt;
	}

	public void setVilleclt(Villeclt villeclt) {
		this.villeclt = villeclt;
	}

	public List<Projet> getProjets() {
		return this.projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

	public Projet addProjet(Projet projet) {
		getProjets().add(projet);
		projet.setClient(this);

		return projet;
	}

	public Projet removeProjet(Projet projet) {
		getProjets().remove(projet);
		projet.setClient(null);

		return projet;
	}

}