package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.DemandeAuthSortie;

public interface DemandeSortieDao extends JpaRepository<DemandeAuthSortie, Long>{

}
