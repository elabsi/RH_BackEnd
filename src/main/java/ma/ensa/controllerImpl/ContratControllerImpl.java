package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.ContratController;
import ma.ensa.entities.Contrat;
import ma.ensa.metiers.ContratMetier;

@RestController
@RequestMapping("/contrat")
public class ContratControllerImpl implements ContratController  {
 
	@Autowired
	private ContratMetier contratMetier;
	@Override
	@PostMapping("/getContratById")
	public Contrat getContratById(@RequestBody Long id) {
		return contratMetier.getContratById(id);
	}

	@Override
	@PostMapping("/addContrat/{id}")
	public Contrat addContrat(@RequestBody Contrat contrat, @PathVariable Long id) {
		return contratMetier.addContrat(contrat, id);
	}

	@Override
	@PostMapping("/updateContrat")
	public void updateContrat(@RequestBody Contrat contrat) {
		contratMetier.updateContrat(contrat);
	}

	@Override
	@GetMapping("/allContrat")
	public List<Contrat> allContrats() {
		return contratMetier.allContrats();
	}

	
}
