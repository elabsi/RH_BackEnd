package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.TypeAttestation;

public interface TypeAttestationMetier {

	public TypeAttestation addTypeAttestation(TypeAttestation typeAttestation);
	public void updateTypeAttestation(TypeAttestation typeAttestation);
	public TypeAttestation getTypeAttestationById(Long id);
	public List<TypeAttestation> allTypeAttestations();
}
