package ma.ensa.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.AdresseController;
import ma.ensa.entities.Adresse;
import ma.ensa.metiers.AdresseMetier;

@RestController
@RequestMapping("/adresse")
public class AdresseControllerImpl implements AdresseController {
 
	@Autowired
	private AdresseMetier adresseMetier;
	@Override
	@PostMapping("/getAdresseById")
	public Adresse getAdresseById(@RequestBody Long id) {
		return adresseMetier.getAdresseById(id);
	}

	@Override
	@PostMapping("/addAdresse/{id}")
	public Adresse addAdresse(@RequestBody Adresse adresse, @PathVariable Long id) {
		return adresseMetier.addAdresse(adresse, id);
	}

	@Override
	@PostMapping("/updateAdresse")
	public void updateAdresse(@RequestBody Adresse adresse) {
		adresseMetier.updateAdresse(adresse);
	}

	@Override
	@GetMapping("/allAdresse")
	public List<Adresse> allAdresses() {
		return adresseMetier.allAdresses();
	}

	
}
