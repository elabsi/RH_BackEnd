package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Telephone;

public interface TelephoneDao extends JpaRepository<Telephone, Long> {

}
