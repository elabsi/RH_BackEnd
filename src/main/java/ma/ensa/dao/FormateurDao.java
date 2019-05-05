package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Formateur;

public interface FormateurDao extends JpaRepository<Formateur, Long> {

}
