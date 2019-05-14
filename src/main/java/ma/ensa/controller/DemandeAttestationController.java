package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.DemandeAttestation;

public interface DemandeAttestationController {

	public DemandeAttestation addDemandeAttestation(DemandeAttestation departement);
	public void updateDemandeAttestation(DemandeAttestation departement);
	public DemandeAttestation getDemandeAttestationById(Long id);
	public List<DemandeAttestation> allDemandeAttestations();

}
