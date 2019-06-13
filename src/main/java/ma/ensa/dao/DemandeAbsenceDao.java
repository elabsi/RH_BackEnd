package ma.ensa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.DemandeAbsence;

public interface DemandeAbsenceDao extends JpaRepository<DemandeAbsence	, Long>{

	public List<DemandeAbsence> findByCollaborateur(Collaborateur c);
}
