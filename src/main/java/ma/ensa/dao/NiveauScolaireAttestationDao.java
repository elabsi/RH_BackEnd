package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.NiveauScolaireAttestation;

public interface NiveauScolaireAttestationDao extends JpaRepository<NiveauScolaireAttestation, Long> {

}
