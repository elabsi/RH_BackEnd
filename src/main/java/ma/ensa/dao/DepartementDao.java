package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Departement;

public interface DepartementDao extends JpaRepository<Departement, Long>{

}
