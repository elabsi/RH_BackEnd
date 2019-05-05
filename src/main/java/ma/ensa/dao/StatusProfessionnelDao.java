package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.StatusProfessionnel;

public interface StatusProfessionnelDao extends JpaRepository<StatusProfessionnel, Long> {

}
