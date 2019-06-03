package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.RolesDao;
import ma.ensa.entities.user.Role;
import ma.ensa.metiers.RolesMetier;


@Service
public class RolesMetierImpl implements RolesMetier {
 
	@Autowired
	private RolesDao dao;
	@Override
	public Role getRoleById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Role addRole(Role roles) {
		return this.dao.save(roles);
	}

	@Override
	public void updateRole(Role roles) {
		this.dao.save(roles);
	}

	@Override
	public List<Role> allRole() {
		return this.dao.findAll();

	}

}
