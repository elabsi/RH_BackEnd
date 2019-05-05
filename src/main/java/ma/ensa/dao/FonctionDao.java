package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Fonction;

public interface FonctionDao extends JpaRepository<Fonction, Long>{

}
