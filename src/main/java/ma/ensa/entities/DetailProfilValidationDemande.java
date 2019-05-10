package ma.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DetailProfilValidationDemande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne
	private ProfilValidationDemande profilValidationDemande;
	@ManyToOne
	private CircuitValidation circuitValidation;
	public DetailProfilValidationDemande() {
		super();
	}
	public ProfilValidationDemande getProfilValidationDemande() {
		return profilValidationDemande;
	}
	public void setProfilValidationDemande(ProfilValidationDemande profilValidationDemande) {
		this.profilValidationDemande = profilValidationDemande;
	}
	public CircuitValidation getCircuitValidation() {
		return circuitValidation;
	}
	public void setCircuitValidation(CircuitValidation circuitValidation) {
		this.circuitValidation = circuitValidation;
	}
	
}
