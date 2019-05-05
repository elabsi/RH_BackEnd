package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.TypeAttestation;

public interface TypeAttestationController {

	public TypeAttestation addTypeAttestation(TypeAttestation typeAttestation);
	public void updateTypeAttestation(TypeAttestation typeAttestation);
	public TypeAttestation getTypeAttestationById(Long id);
	public List<TypeAttestation> allTypeAttestations();
}
