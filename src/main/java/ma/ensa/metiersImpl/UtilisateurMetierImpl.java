package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.UtilisateurDao;
import ma.ensa.entities.user.Utilisateur;
import ma.ensa.metiers.UtilisateurMetier;

@Service
public class UtilisateurMetierImpl implements UtilisateurMetier {
 
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

	
}
