package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Prime;

public interface PrimeDao extends JpaRepository<Prime, Long>{

}
