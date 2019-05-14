package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.DemandeAuTrav;

public interface DemandeTravailDao extends JpaRepository<DemandeAuTrav, Long>{

}
