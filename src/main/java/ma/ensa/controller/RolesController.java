package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Roles;

public interface RolesController {
	public Roles addRoles(Roles roles);
	public void updateRoles(Roles roles);
	public Roles getRolesById(Long id);
	public List<Roles> allRoles();
}
