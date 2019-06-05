package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.FonctionController;
import ma.ensa.entities.Fonction;
import ma.ensa.metiers.FonctionMetier;

@RestController
@RequestMapping("/parametres/fonction")
public class FonctionControllerImpl implements FonctionController {
 
	@Autowired
	private FonctionMetier fonctionMetier;
	@Override
	@PostMapping("/getFonctionById")
	public Fonction getFonctionById(@RequestBody Long id) {
		return fonctionMetier.getFonctionById(id);
	}

	@Override
	@PostMapping("/addFonction")
	public Fonction addFonction(@RequestBody Fonction fonction) {
		return fonctionMetier.addFonction(fonction);
	}

	@Override
	@PostMapping("/updateFonction")
	public void updateFonction(@RequestBody Fonction fonction) {
		fonctionMetier.updateFonction(fonction);
	}

	@Override
	@GetMapping("/allFonctions")
	public List<Fonction> allFonctions() {
		return fonctionMetier.allFonctions();
	}
}
