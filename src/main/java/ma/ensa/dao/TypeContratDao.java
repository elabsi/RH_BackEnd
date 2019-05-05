package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.TypeContrat;

public interface TypeContratDao extends JpaRepository<TypeContrat, Long> {

}
