package ma.ensa.metiers;

import java.util.List ;

import ma.ensa.entities.user.Role;


public interface RolesMetier {
	public Role addRole(Role roles);
	public void updateRole(Role roles);
	public Role getRoleById(Long id);
	public List<Role> allRole();
}
