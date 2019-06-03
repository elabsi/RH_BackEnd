package ma.ensa.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository ;

import ma.ensa.entities.user.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {

    Optional<Utilisateur> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

}
