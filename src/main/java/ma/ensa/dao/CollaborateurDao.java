package ma.ensa.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Collaborateur;

public interface CollaborateurDao extends JpaRepository<Collaborateur, Long>{

	public List<Collaborateur> findByNomContainingOrPrenomContaining(String nom, String prenom, Pageable pageable);
	public List<Collaborateur> findByNomContainingOrPrenomContaining(String nom, String prenom);
}
