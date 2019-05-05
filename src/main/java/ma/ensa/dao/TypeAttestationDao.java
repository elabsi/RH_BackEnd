package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.TypeAttestation;

public interface TypeAttestationDao extends JpaRepository<TypeAttestation, Long> {

}
