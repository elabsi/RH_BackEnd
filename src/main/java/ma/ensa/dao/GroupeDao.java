package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Groupe;

public interface GroupeDao extends JpaRepository<Groupe, Long>{

}
