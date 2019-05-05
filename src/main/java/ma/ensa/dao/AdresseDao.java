package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Adresse;

public interface AdresseDao extends JpaRepository<Adresse, Long> {

}
