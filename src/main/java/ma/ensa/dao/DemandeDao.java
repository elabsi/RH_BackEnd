package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Demande;

public interface DemandeDao extends JpaRepository<Demande, Long>{

}
