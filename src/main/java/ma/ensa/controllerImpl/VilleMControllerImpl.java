package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.VilleController;
import ma.ensa.entities.Ville;
import ma.ensa.metiers.VilleMetier;

@RestController
@RequestMapping("/ville")
public class VilleMControllerImpl implements VilleController {
 
	@Autowired
	private VilleMetier villeMetier;
	@Override
	@PostMapping("/getVilleById")
	public Ville getVilleById(@RequestBody Long id) {
		return villeMetier.getVilleById(id);
	}

	@Override
	@PostMapping("/addVille")
	public Ville addVille(@RequestBody Ville ville) {
		return villeMetier.addVille(ville);
	}

	@Override
	@PostMapping("/updateVille")
	public void updateVille(@RequestBody Ville ville) {
		villeMetier.updateVille(ville);
	}

	@Override
	@GetMapping("/allVilles")
	public List<Ville> allVilles() {
		return villeMetier.allVilles();
	}
	
}
