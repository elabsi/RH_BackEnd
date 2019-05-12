package ma.ensa.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("demandeAttestation")
public class DemandeAttestation extends Demande{
	
	@ManyToOne
	private TypeAttestationEntreprise typeAttestationEntreprise ;

	public DemandeAttestation() {
		super();
	}

	public TypeAttestationEntreprise getTypeAttestationEntreprise() {
		return typeAttestationEntreprise;
	}

	public DemandeAttestation(Long id, Date dateDemande, String observation, int status, String motifRefus,
			Collaborateur collaborateur, TypeAttestationEntreprise typeAttestationEntreprise) {
		super(id, dateDemande, observation, status, motifRefus, collaborateur);
		this.typeAttestationEntreprise = typeAttestationEntreprise;
	}

	public void setTypeAttestationEntreprise(TypeAttestationEntreprise typeAttestationEntreprise) {
		this.typeAttestationEntreprise = typeAttestationEntreprise;
	}

}
