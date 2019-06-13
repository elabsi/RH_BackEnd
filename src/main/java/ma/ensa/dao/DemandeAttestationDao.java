package ma.ensa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.DemandeAttestation;

public interface DemandeAttestationDao extends JpaRepository<DemandeAttestation, Long>{

	public List<DemandeAttestation> findByCollaborateur(Collaborateur c);
}
