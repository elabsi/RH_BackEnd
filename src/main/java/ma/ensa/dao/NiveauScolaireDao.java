package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.NiveauScolaire;

public interface NiveauScolaireDao extends JpaRepository<NiveauScolaire, Long> {

}
