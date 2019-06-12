package ma.ensa.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.UtilisateurController;
import ma.ensa.entities.user.Utilisateur;
import ma.ensa.metiers.UtilisateurMetier;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurControllerImpl implements UtilisateurController{

	@Autowired
	private UtilisateurMetier utilisateurMetier ;

	@Override
	public void updateUser(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Utilisateur getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getCurrentUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping("/getUtilisateur")
	public Utilisateur getUser(@RequestBody String username) {
		return this.utilisateurMetier.getUser(username);
	}

	@Override
	public List<Utilisateur> allUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
