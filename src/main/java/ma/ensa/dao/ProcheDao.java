package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Proche;

public interface ProcheDao extends JpaRepository<Proche, Long> {

}
