package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.DemandeAbsence;

public interface DemandeAbsenceDao extends JpaRepository<DemandeAbsence	, Long>{

}
