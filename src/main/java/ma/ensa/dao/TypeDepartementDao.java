package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.TypeDepartement;

public interface TypeDepartementDao extends JpaRepository<TypeDepartement, Long> {

}
