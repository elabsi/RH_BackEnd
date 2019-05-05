package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.FormateurController;
import ma.ensa.entities.Formateur;
import ma.ensa.metiers.FormateurMetier;

@RestController
@RequestMapping("/formateur")
public class FormateurControllerImpl implements FormateurController {
 
	@Autowired
	private FormateurMetier formateurMetier;
	@Override
	@PostMapping("/getFormateurById")
	public Formateur getFormateurById(@RequestBody Long id) {
		return formateurMetier.getFormateurById(id);
	}

	@Override
	@PostMapping("/addFormateur")
	public Formateur addFormateur(@RequestBody Formateur formateur) {
		return formateurMetier.addFormateur(formateur);
	}

	@Override
	@PostMapping("/updateFormateur")
	public void updateFormateur(@RequestBody Formateur formateur) {
		formateurMetier.updateFormateur(formateur);
	}

	@Override
	@GetMapping("/allFormateur")
	public List<Formateur> allFormateurs() {
		return formateurMetier.allFormateurs();
	}
	
}
