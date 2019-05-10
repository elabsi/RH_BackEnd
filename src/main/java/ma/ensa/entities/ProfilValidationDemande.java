package ma.ensa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class ProfilValidationDemande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;
	@OneToMany(mappedBy="profilValidationDemande")
	private List<Collaborateur> collaborateur = new  ArrayList<Collaborateur>();
	public List<Collaborateur> getCollaborateur() {
		return collaborateur;
	}
	public void setCollaborateur(List<Collaborateur> collaborateur) {
		this.collaborateur = collaborateur;
	}
	@OneToMany(mappedBy="profilValidationDemande")
	private List<DetailProfilValidationDemande> detailProfilValidationDemandes = new ArrayList<DetailProfilValidationDemande>();
	public List<DetailProfilValidationDemande> getDetailProfilValidationDemandes() {
		return detailProfilValidationDemandes;
	}
	public void setDetailProfilValidationDemandes(List<DetailProfilValidationDemande> detailProfilValidationDemandes) {
		this.detailProfilValidationDemandes = detailProfilValidationDemandes;
	}
	public ProfilValidationDemande() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
