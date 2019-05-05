package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Contrat;

public interface ContratDao extends JpaRepository<Contrat, Long> {

}
