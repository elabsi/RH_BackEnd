package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.LigneGroupeController;
import ma.ensa.entities.LigneGroupe;
import ma.ensa.metiers.LigneGroupeMetier;

@RestController
@RequestMapping("/ligneGroupe")
public class LigneGroupeControllerImpl implements LigneGroupeController {
 
	@Autowired
	private LigneGroupeMetier ligneGroupeMetier;
	@Override
	@PostMapping("/getLigneGroupeById")
	public LigneGroupe getLigneGroupeById(@RequestBody Long id) {
		return ligneGroupeMetier.getLigneGroupeById(id);
	}

	@Override
	@PostMapping("/addLigneGroupe/{id}")
	public LigneGroupe addLigneGroupe(@RequestBody LigneGroupe ligneGroupe, @PathVariable Long id) {
		return ligneGroupeMetier.addLigneGroupe(ligneGroupe, id);
	}

	@Override
	@PostMapping("/updateLigneGroupe")
	public void updateLigneGroupe(@RequestBody LigneGroupe ligneGroupe) {
		ligneGroupeMetier.updateLigneGroupe(ligneGroupe);
	}

	@Override
	@GetMapping("/allLigneGroupe")
	public List<LigneGroupe> allLigneGroupes() {
		return ligneGroupeMetier.allLigneGroupes();
	}
	
}
