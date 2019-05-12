package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.DemandeController;
import ma.ensa.entities.Demande;
import ma.ensa.metiers.DemandeMetier;

@RestController
@RequestMapping("/demande")
public class DemandeControllerImpl implements DemandeController {
 
	@Autowired
	private DemandeMetier demandeMetier;
	@Override
	@PostMapping("/getDemandeById")
	public Demande getDemandeById(@RequestBody Long id) {
		return demandeMetier.getDemandeById(id);
	}

	@Override
	@PostMapping("/addDemande")
	public Demande addDemande(@RequestBody Demande demande) {
		return demandeMetier.addDemande(demande);
	}

	@Override
	@PostMapping("/updateDemande")
	public void updateDemande(@RequestBody Demande demande) {
		demandeMetier.updateDemande(demande);
	}

	@Override
	@GetMapping("/allDemandes")
	public List<Demande> allDemandes() {
		return demandeMetier.allDemandes();
	}
	
}
