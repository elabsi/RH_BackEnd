package ma.ensa.metiersImpl;

import java.util.List ;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ma.ensa.dao.CollaborateurDao;
import ma.ensa.dao.RolesDao;
import ma.ensa.dao.UtilisateurDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.user.Role;
import ma.ensa.entities.user.RoleName;
import ma.ensa.entities.user.Utilisateur;
import ma.ensa.message.request.LoginForm;
import ma.ensa.metiers.UtilisateurMetier;

@Transactional
@Service
public class UtilisateurMetierImpl implements UtilisateurMetier {
 
	@Autowired
	PasswordEncoder encoder;
	@Autowired
	private UtilisateurDao dao;
	@Autowired 
	private CollaborateurDao cd;
	@Autowired 
	private RolesDao rd;
	@Override
	public Utilisateur getUserById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Utilisateur addUser(Utilisateur u) {
		return this.dao.save(u);
	}

	@Override
	public void updateUser(Utilisateur u) {
		this.dao.save(u);
	}

	@Override
	public List<Utilisateur> allUsers() {
		return this.dao.findAll();
	}

	@Override
	public Utilisateur getCurrentUser() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = "";
		if (principal instanceof UserDetails) {
		  username = ((UserDetails)principal).getUsername();
		} else {
		  username = principal.toString();
		}
		Optional<Utilisateur> users = this.dao.findByUsername(username);
		if(users.isPresent()) {
			return users.get();
		} else {
			return null;
		}
	}
	@Override
	public Utilisateur getUser(String username) {
		Optional<Utilisateur> users = this.dao.findByUsername(username);
		if(users.isPresent()) {
			return users.get();
		} else {
			return null;
		}
	}

	@Override
	public boolean updateMdp(LoginForm lf) {
		Utilisateur u = this.dao.findByUsername(lf.getUsername()).get();
		u.setPassword(encoder.encode(lf.getPassword()));
		dao.save(u);
		return true;
	}

	@Override
	public Utilisateur getUserByCollabId(Long id) {
		Collaborateur c = this.cd.findById(id).get();
		return c.getUtilisateur();
	}

	@Override
	public boolean addRole(String role, Long CollabId) {
		Role r = new Role();
		switch(role) {
		case "Administrateur":
			r = rd.findByName(RoleName.ROLE_ADMINISTRATEUR).get();
			break;
		case "Collaborateur":
			r = rd.findByName(RoleName.ROLE_EMPLOYE).get();
			break;
		case "Chef de service":
			r = rd.findByName(RoleName.ROLE_CHEF_SERVICE).get();
			break;
		case "Responsable RH":
			r = rd.findByName(RoleName.ROLE_RH).get();
			break;
		}
		Collaborateur c = this.cd.findById(CollabId).get();
		Set<Role> rs = c.getUtilisateur().getRoles();
		rs.add(r);
		c.getUtilisateur().setRoles(rs);
		return true;
	}

	
}
