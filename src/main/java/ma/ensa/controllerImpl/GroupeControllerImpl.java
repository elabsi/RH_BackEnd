package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.GroupeController;
import ma.ensa.entities.Groupe;
import ma.ensa.metiers.GroupeMetier;

@RestController 
@RequestMapping("/parametres/groupe")
public class GroupeControllerImpl implements GroupeController {
 
	@Autowired
	private GroupeMetier groupeMetier;
	@Override
	@PostMapping("/getGroupeById")
	public Groupe getGroupeById(@RequestBody Long id) {
		return groupeMetier.getGroupeById(id);
	}

	@Override
	@PostMapping("/addGroupe")
	public Groupe addGroupe(@RequestBody Groupe groupe) {
		return groupeMetier.addGroupe(groupe);
	}

	@Override
	@PostMapping("/updateGroupe")
	public void updateGroupe(@RequestBody Groupe groupe) {
		groupeMetier.updateGroupe(groupe);
	}

	@Override
	@GetMapping("/allGroupes")
	public List<Groupe> allGroupes() {
		return groupeMetier.allGroupes();
	}
}
