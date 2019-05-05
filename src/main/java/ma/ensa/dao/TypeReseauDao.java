package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.TypeReseauSocial;

public interface TypeReseauDao extends JpaRepository<TypeReseauSocial, Long> {

}
