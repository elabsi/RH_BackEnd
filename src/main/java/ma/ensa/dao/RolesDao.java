package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Roles;

public interface RolesDao extends JpaRepository<Roles, Long> {

}
