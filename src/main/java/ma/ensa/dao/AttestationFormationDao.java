package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.AttestationFormation;

public interface AttestationFormationDao extends JpaRepository<AttestationFormation, Long> {

}
