package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {

}
