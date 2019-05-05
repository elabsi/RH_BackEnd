package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Domaine;

public interface DomaineDao extends JpaRepository<Domaine, Long>{

}
