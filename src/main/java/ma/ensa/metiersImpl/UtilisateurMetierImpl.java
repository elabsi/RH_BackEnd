package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.UtilisateurDao;
import ma.ensa.entities.Utilisateur;
import ma.ensa.metiers.UtilisateurMetier;

@Service
public class UtilisateurMetierImpl implements UtilisateurMetier {
 
	@Autowired
	private UtilisateurDao dao;
	@Override
	public Utilisateur getUtilisateurById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Utilisateur addUtilisateur(Utilisateur u) {
		return this.dao.save(u);
	}

	@Override
	public void updateUtilisateur(Utilisateur u) {
		this.dao.save(u);
	}

	@Override
	public List<Utilisateur> allUtilisateurs() {
		return this.dao.findAll();
	}

	
}
