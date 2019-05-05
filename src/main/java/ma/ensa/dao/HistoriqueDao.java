package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Historique;

public interface HistoriqueDao extends JpaRepository<Historique, Long> {

}
