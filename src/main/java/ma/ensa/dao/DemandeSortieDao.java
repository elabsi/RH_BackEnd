package ma.ensa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.DemandeAuthSortie;

public interface DemandeSortieDao extends JpaRepository<DemandeAuthSortie, Long>{

	public List<DemandeAuthSortie> findByCollaborateur(Collaborateur c);
}
