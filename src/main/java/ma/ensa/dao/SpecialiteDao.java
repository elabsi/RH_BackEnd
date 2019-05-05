package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Specialite;

public interface SpecialiteDao extends JpaRepository<Specialite, Long> {

}
