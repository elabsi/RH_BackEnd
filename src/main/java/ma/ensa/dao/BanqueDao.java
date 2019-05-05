package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Banque;

public interface BanqueDao extends JpaRepository<Banque, Long> {

}
