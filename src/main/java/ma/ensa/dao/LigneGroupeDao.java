package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.LigneGroupe;

public interface LigneGroupeDao extends JpaRepository<LigneGroupe, Long> {

}
