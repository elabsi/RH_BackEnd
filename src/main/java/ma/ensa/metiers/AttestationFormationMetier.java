package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.AttestationFormation;

public interface AttestationFormationMetier {
	

	public AttestationFormation addAttestationFormation(AttestationFormation attestationFormation, Long id);
	public void updateAttestationFormation(AttestationFormation attestationFormation);
	public AttestationFormation getAttestationFormationById(Long id);

	public List<AttestationFormation> allAttestationFormations();

}
