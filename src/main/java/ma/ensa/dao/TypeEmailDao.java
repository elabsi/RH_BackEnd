package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.TypeEmail;

public interface TypeEmailDao extends JpaRepository<TypeEmail, Long> {

}
