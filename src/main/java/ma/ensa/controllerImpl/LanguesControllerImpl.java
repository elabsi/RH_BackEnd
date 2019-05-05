package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.LanguesController;
import ma.ensa.entities.Langues;
import ma.ensa.metiers.LanguesMetier;

@RestController
@RequestMapping("/langues")
public class LanguesControllerImpl implements LanguesController {
 
	@Autowired
	private LanguesMetier languesMetier;
	@Override
	@PostMapping("/getLanguesById")
	public Langues getLanguesById(@RequestBody Long id) {
		return languesMetier.getLanguesById(id);
	}

	@Override
	@PostMapping("/addLangues/{id}")
	public Langues addLangues(@RequestBody Langues langues,@PathVariable Long id) {
		return languesMetier.addLangues(langues, id);
	}

	@Override
	@PostMapping("/updateLangues")
	public void updateLangues(@RequestBody Langues langues) {
		languesMetier.updateLangues(langues);
	}

	@Override
	@GetMapping("/allLanguess")
	public List<Langues> allLangues() {
		return languesMetier.allLangues();
	}

	
}
