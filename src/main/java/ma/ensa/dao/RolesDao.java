package ma.ensa.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository ;


import ma.ensa.entities.user.Role;
import ma.ensa.entities.user.RoleName;


public interface RolesDao extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);

}
