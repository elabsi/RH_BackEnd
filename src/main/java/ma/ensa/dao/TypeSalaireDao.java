package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.TypeSalaire;

public interface TypeSalaireDao extends JpaRepository<TypeSalaire, Long>{

}
