package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.NiveauScolaireAttestation;

public interface NiveauScolaireAttestationController {

	public NiveauScolaireAttestation addNiveauScolaireAttestation(NiveauScolaireAttestation niveauScolaire);
	public void updateNiveauScolaireAttestation(NiveauScolaireAttestation niveauScolaire);
	public NiveauScolaireAttestation getNiveauScolaireAttestationById(Long id);
	public List<NiveauScolaireAttestation> allNiveauScolaireAttestations();
}
