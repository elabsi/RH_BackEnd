package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.SpecialiteController;
import ma.ensa.entities.Specialite;
import ma.ensa.metiers.SpecialiteMetier;

@RestController
@RequestMapping("/specialite")
public class SpecialiteControllerImpl implements SpecialiteController {
 
	@Autowired
	private SpecialiteMetier specialiteMetier;
	@Override
	@PostMapping("/getSpecialiteById")
	public Specialite getSpecialiteById(@RequestBody Long id) {
		return specialiteMetier.getSpecialiteById(id);
	}

	@Override
	@PostMapping("/addSpecialite")
	public Specialite addSpecialite(@RequestBody Specialite specialite) {
		return specialiteMetier.addSpecialite(specialite);
	}

	@Override
	@PostMapping("/updateSpecialite")
	public void updateSpecialite(@RequestBody Specialite specialite) {
		specialiteMetier.updateSpecialite(specialite);
	}

	@Override
	@GetMapping("/allSpecialites")
	public List<Specialite> allSpecialites() {
		return specialiteMetier.allSpecialites();
	}
}
