package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Langue;

public interface LangueDao extends JpaRepository<Langue, Long> {

}
