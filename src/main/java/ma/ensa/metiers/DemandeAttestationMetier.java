package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.DemandeAttestation;

public interface DemandeAttestationMetier {

	public DemandeAttestation addDemandeAttestation(DemandeAttestation departement);
	public void updateDemandeAttestation(DemandeAttestation departement);
	public DemandeAttestation getDemandeAttestationById(Long id);
	public List<DemandeAttestation> allDemandeAttestations();

}
