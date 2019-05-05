package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Email;

public interface EmailDao extends JpaRepository<Email, Long> {

}
