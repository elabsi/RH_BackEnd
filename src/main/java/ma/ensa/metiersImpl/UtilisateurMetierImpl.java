package ma.ensa.metiersImpl;

import java.util.List ;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ma.ensa.dao.UtilisateurDao;
import ma.ensa.entities.user.Utilisateur;
import ma.ensa.message.request.LoginForm;
import ma.ensa.metiers.UtilisateurMetier;

@Service
public class UtilisateurMetierImpl implements UtilisateurMetier {
 
	@Autowired
	PasswordEncoder encoder;
	@Autowired
	private UtilisateurDao dao;
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

	
}
