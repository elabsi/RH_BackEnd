package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.DemandeAttestation;

public interface DemandeAttestationDao extends JpaRepository<DemandeAttestation, Long>{

}
