package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.UtilisateurController;
import ma.ensa.entities.Utilisateur;
import ma.ensa.metiers.UtilisateurMetier;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurControllerImpl implements UtilisateurController {
	@Autowired
	private UtilisateurMetier utilisateurMetier;
	@Override
	@PostMapping("/getUtilisateurById")
	public Utilisateur getUtilisateurById(@RequestBody Long id) {
		return utilisateurMetier.getUtilisateurById(id);
	}

	@Override
	@PostMapping("/addUtilisateur")
	public Utilisateur addUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurMetier.addUtilisateur(utilisateur);
	}

	@Override
	@PostMapping("/updateUtilisateur")
	public void updateUtilisateur(@RequestBody Utilisateur utilisateur) {
		utilisateurMetier.updateUtilisateur(utilisateur);
	}

	@Override
	@GetMapping("/allUtilisateur")
	public List<Utilisateur> allUtilisateurs() {
		return utilisateurMetier.allUtilisateurs();
	}
}
