package ma.ensa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.DemandeAuTrav;

public interface DemandeTravailDao extends JpaRepository<DemandeAuTrav, Long>{

	public List<DemandeAuTrav> findByCollaborateur(Collaborateur c);
}
