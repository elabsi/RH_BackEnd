package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.CoordonnesBancairesController;
import ma.ensa.entities.CoordonnesBancaires;
import ma.ensa.metiers.CoordonnesBancairesMetier;

@RestController
@RequestMapping("/coordonnesBancaires")
public class CoordonnesBancairesControllerImpl implements CoordonnesBancairesController {
 
	@Autowired
	private CoordonnesBancairesMetier coordonnesBancairesMetier;
	@Override
	@PostMapping("/getCoordonnesBancairesById")
	public CoordonnesBancaires getCoordonnesBancairesById(@RequestBody Long id) {
		return coordonnesBancairesMetier.getCoordonnesBancairesById(id);
	}

	@Override
	@PostMapping("/addCoordonnesBancaires/{id}")
	public CoordonnesBancaires addCoordonnesBancaires(@RequestBody CoordonnesBancaires coordonnesBancaires, @PathVariable Long id) {
		return coordonnesBancairesMetier.addCoordonnesBancaires(coordonnesBancaires, id);
	}

	@Override
	@PostMapping("/updateCoordonnesBancaires")
	public void updateCoordonnesBancaires(@RequestBody CoordonnesBancaires coordonnesBancaires) {
		coordonnesBancairesMetier.updateCoordonnesBancaires(coordonnesBancaires);
	}

	@Override
	@GetMapping("/allCoordonnesBancaires")
	public List<CoordonnesBancaires> allCoordonnesBancaires() {
		return coordonnesBancairesMetier.allCoordonnesBancaires();
	}
}
