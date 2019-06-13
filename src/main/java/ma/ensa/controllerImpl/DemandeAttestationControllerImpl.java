package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.DemandeAttestationController;
import ma.ensa.entities.DemandeAttestation;
import ma.ensa.metiers.DemandeAttestationMetier;

@RestController
@RequestMapping("/demandeAttestation")
public class DemandeAttestationControllerImpl implements DemandeAttestationController {
 
	@Autowired
	private DemandeAttestationMetier demandeAttestationMetier;
	@Override
	@PostMapping("/getDemandeAttestationById")
	public DemandeAttestation getDemandeAttestationById(@RequestBody Long id) {
		return demandeAttestationMetier.getDemandeAttestationById(id);
	}

	@Override
	@PostMapping("/addDemandeAttestation")
	public DemandeAttestation addDemandeAttestation(@RequestBody DemandeAttestation demandeAttestation) {
		return demandeAttestationMetier.addDemandeAttestation(demandeAttestation);
	}

	@Override
	@PostMapping("/updateDemandeAttestation")
	public void updateDemandeAttestation(@RequestBody DemandeAttestation demandeAttestation) {
		demandeAttestationMetier.updateDemandeAttestation(demandeAttestation);
	}

	@Override
	@GetMapping("/allDemandeAttestations")
	public List<DemandeAttestation> allDemandeAttestations() {
		return demandeAttestationMetier.allDemandeAttestations();
	}

	@Override
	@PostMapping("/employe/allDemandeAttestations")
	public List<DemandeAttestation> allDemandeAttestations(@RequestBody String username) {
		return demandeAttestationMetier.allDemandeAttestations(username);
	}
	
}
