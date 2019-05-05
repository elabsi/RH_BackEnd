package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.CoordonnesBancaires;

public interface CoordonnesBancairesDao extends JpaRepository<CoordonnesBancaires, Long> {

}
