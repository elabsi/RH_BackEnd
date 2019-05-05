package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.RolesDao;
import ma.ensa.entities.Roles;
import ma.ensa.metiers.RolesMetier;

@Service
public class RolesMetierImpl implements RolesMetier {
 
	@Autowired
	private RolesDao dao;
	@Override
	public Roles getRolesById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Roles addRoles(Roles roles) {
		return this.dao.save(roles);
	}

	@Override
	public void updateRoles(Roles roles) {
		this.dao.save(roles);
	}

	@Override
	public List<Roles> allRoles() {
		return this.dao.findAll();
	}

	
}
