package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.DemandeAuTravController;
import ma.ensa.entities.DemandeAuTrav;
import ma.ensa.metiers.DemandeAuTravMetier;

@RestController
@RequestMapping("/demandeAuTrav")
public class DemandeAuTravControllerImpl implements DemandeAuTravController {
 
	@Autowired
	private DemandeAuTravMetier demandeAuTravMetier;
	@Override
	@PostMapping("/getDemandeAuTravById")
	public DemandeAuTrav getDemandeAuTravById(@RequestBody Long id) {
		return demandeAuTravMetier.getDemandeAuTravById(id);
	}

	@Override
	@PostMapping("/addDemandeAuTrav")
	public DemandeAuTrav addDemandeAuTrav(@RequestBody DemandeAuTrav demandeAuTrav) {
		return demandeAuTravMetier.addDemandeAuTrav(demandeAuTrav);
	}

	@Override
	@PostMapping("/updateDemandeAuTrav")
	public void updateDemandeAuTrav(@RequestBody DemandeAuTrav demandeAuTrav) {
		demandeAuTravMetier.updateDemandeAuTrav(demandeAuTrav);
	}

	@Override
	@GetMapping("/allDemandeAuTravs")
	public List<DemandeAuTrav> allDemandeAuTravs() {
		return demandeAuTravMetier.allDemandeAuTravs();
	}
	
}
