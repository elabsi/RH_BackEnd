package ma.ensa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class CircuitValidation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;
	@OneToMany(mappedBy = "circuitValidation")
	private List<ValidationOrdre> validationOrdres = new ArrayList<ValidationOrdre>();
	public List<ValidationOrdre> getValidationOrdres() {
		return validationOrdres;
	}
	public void setValidationOrdres(List<ValidationOrdre> validationOrdres) {
		this.validationOrdres = validationOrdres;
	}
	@OneToMany(mappedBy = "circuitValidation")
	private List<DetailProfilValidationDemande> detailProfilValidationDemandes = new ArrayList<DetailProfilValidationDemande>();
	public List<DetailProfilValidationDemande> getDetailProfilValidationDemandes() {
		return detailProfilValidationDemandes;
	}
	public void setDetailProfilValidationDemandes(List<DetailProfilValidationDemande> detailProfilValidationDemandes) {
		this.detailProfilValidationDemandes = detailProfilValidationDemandes;
	}
	public CircuitValidation() {
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
