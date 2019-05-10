package ma.ensa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TypeAttestation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;

	@OneToMany(mappedBy="typeAttestation")
	@JsonIgnore
	private List<DemandeAttestation> demandeAttestations = new ArrayList<DemandeAttestation>();
	@OneToMany(mappedBy="typeAttestation")
	@JsonIgnore
	private List<AttestationFormation> attestationFormations;
	
	
	public List<DemandeAttestation> getDemandeAttestations() {
		return demandeAttestations;
	}
	public void setDemandeAttestations(List<DemandeAttestation> demandeAttestations) {
		this.demandeAttestations = demandeAttestations;
	}
	public List<AttestationFormation> getAttestationFormations() {
		return attestationFormations;
	}
	public void setAttestationFormations(List<AttestationFormation> attestationFormations) {
		this.attestationFormations = attestationFormations;
	}
	public TypeAttestation() {
		super();
		// TODO Auto-generated constructor stub
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
