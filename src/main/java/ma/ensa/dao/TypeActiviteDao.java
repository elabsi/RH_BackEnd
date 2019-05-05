package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.TypeActivite;

public interface TypeActiviteDao extends JpaRepository<TypeActivite, Long> {

}
