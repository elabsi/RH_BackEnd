package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Categorie;

public interface CategorieDao extends JpaRepository<Categorie, Long> {

}
