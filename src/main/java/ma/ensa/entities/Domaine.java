package ma.ensa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Domaine {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String description;
	
	@OneToMany(mappedBy="domaine")
	@JsonIgnore
	private List<AttestationFormation> attestationFormations;
	@OneToMany(mappedBy="domaine")
	@JsonIgnore
	private List<Specialite> specialites;
	
	
	
	public List<AttestationFormation> getAttestationFormations() {
		return attestationFormations;
	}
	public void setAttestationFormations(List<AttestationFormation> attestationFormations) {
		this.attestationFormations = attestationFormations;
	}
	public List<Specialite> getSpecialites() {
		return specialites;
	}
	public void setSpecialites(List<Specialite> specialites) {
		this.specialites = specialites;
	}
	public Domaine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
