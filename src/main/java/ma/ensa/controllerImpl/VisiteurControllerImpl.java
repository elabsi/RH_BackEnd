package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.VisiteurController;
import ma.ensa.entities.Visiteur;
import ma.ensa.metiers.VisiteurMetier;

@RestController
@RequestMapping("/visiteur")
public class VisiteurControllerImpl implements VisiteurController {
 
	@Autowired
	private VisiteurMetier visiteurMetier;
	@Override
	@PostMapping("/getVisiteurById")
	public Visiteur getVisiteurById(@RequestBody Long id) {
		return visiteurMetier.getVisiteurById(id);
	}

	@Override
	@PostMapping("/addVisiteur")
	public Visiteur addVisiteur(@RequestBody Visiteur visiteur) {
		return visiteurMetier.addVisiteur(visiteur);
	}

	@Override
	@PostMapping("/updateVisiteur")
	public void updateVisiteur(@RequestBody Visiteur visiteur) {
		visiteurMetier.updateVisiteur(visiteur);
	}

	@Override
	@GetMapping("/allVisiteur")
	public List<Visiteur> allVisiteurs() {
		return visiteurMetier.allVisiteurs();
	}
	
}
