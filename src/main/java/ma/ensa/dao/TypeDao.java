package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Type;

public interface TypeDao extends JpaRepository<Type, Long> {

}
