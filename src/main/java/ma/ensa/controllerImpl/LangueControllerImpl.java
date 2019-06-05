package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.LangueController;
import ma.ensa.entities.Langue;
import ma.ensa.metiers.LangueMetier;

@RestController
@RequestMapping("/parametres/langue")
public class LangueControllerImpl implements LangueController {
 
	@Autowired
	private LangueMetier langueMetier;
	@Override
	@PostMapping("/getLangueById")
	public Langue getLangueById(@RequestBody Long id) {
		return langueMetier.getLangueById(id);
	}

	@Override
	@PostMapping("/addLangue")
	public Langue addLangue(@RequestBody Langue langue) {
		return langueMetier.addLangue(langue);
	}

	@Override
	@PostMapping("/updateLangue")
	public void updateLangue(@RequestBody Langue langue) {
		langueMetier.updateLangue(langue);
	}

	@Override
	@GetMapping("/allLangues")
	public List<Langue> allLangues() {
		return langueMetier.allLangues();
	}
	
}
