package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.DomaineController;
import ma.ensa.entities.Domaine;
import ma.ensa.metiers.DomaineMetier;

@RestController
@RequestMapping("/domaine")
public class DomaineControllerImpl implements DomaineController {
 
	@Autowired
	private DomaineMetier domaineMetier;
	@Override
	@PostMapping("/getDomaineById")
	public Domaine getDomaineById(@RequestBody Long id) {
		return domaineMetier.getDomaineById(id);
	}

	@Override
	@PostMapping("/addDomaine")
	public Domaine addDomaine(@RequestBody Domaine domaine) {
		return domaineMetier.addDomaine(domaine);
	}

	@Override
	@PostMapping("/updateDomaine")
	public void updateDomaine(@RequestBody Domaine domaine) {
		domaineMetier.updateDomaine(domaine);
	}

	@Override
	@GetMapping("/allDomaines")
	public List<Domaine> allDomaines() {
		return domaineMetier.allDomaines();
	}

	
}
