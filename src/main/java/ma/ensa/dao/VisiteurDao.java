package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Visiteur;

public interface VisiteurDao extends JpaRepository<Visiteur, Long> {

}
