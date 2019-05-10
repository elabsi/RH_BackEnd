package ma.ensa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RoleValidation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String abreviation;
	private String description;
	@OneToMany(mappedBy = "roleValidation")
	private List<Validation> validations = new ArrayList<Validation>();
	public List<Validation> getValidations() {
		return validations;
	}
	public void setValidations(List<Validation> validations) {
		this.validations = validations;
	}
	@OneToMany(mappedBy = "roleValidation")
	private List<ValidationOrdre> validationOrdres = new ArrayList<ValidationOrdre>();
	public List<ValidationOrdre> getValidationOrdres() {
		return validationOrdres;
	}
	public void setValidationOrdres(List<ValidationOrdre> validationOrdres) {
		this.validationOrdres = validationOrdres;
	}
	public RoleValidation() {
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
	public String getAbreviation() {
		return abreviation;
	}
	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
