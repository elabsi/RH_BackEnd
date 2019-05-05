package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.NiveauScolaireAttestationController;
import ma.ensa.entities.NiveauScolaireAttestation;
import ma.ensa.metiers.NiveauScolaireAttestationMetier;

@RestController
@RequestMapping("/niveauScolaireAttestation")
public class NiveauScolaireAttestationControllerImpl implements NiveauScolaireAttestationController {
 
	@Autowired
	private NiveauScolaireAttestationMetier niveauScolaireAttestationMetier;
	@Override
	@PostMapping("/getNiveauScolaireAttestationById")
	public NiveauScolaireAttestation getNiveauScolaireAttestationById(@RequestBody Long id) {
		return niveauScolaireAttestationMetier.getNiveauScolaireAttestationById(id);
	}

	@Override
	@PostMapping("/addNiveauScolaireAttestation")
	public NiveauScolaireAttestation addNiveauScolaireAttestation(@RequestBody NiveauScolaireAttestation niveauScolaireAttestation) {
		return niveauScolaireAttestationMetier.addNiveauScolaireAttestation(niveauScolaireAttestation);
	}

	@Override
	@PostMapping("/updateNiveauScolaireAttestation")
	public void updateNiveauScolaireAttestation(@RequestBody NiveauScolaireAttestation niveauScolaireAttestation) {
		niveauScolaireAttestationMetier.updateNiveauScolaireAttestation(niveauScolaireAttestation);
	}

	@Override
	@GetMapping("/allNiveauScolaireAttestations")
	public List<NiveauScolaireAttestation> allNiveauScolaireAttestations() {
		return niveauScolaireAttestationMetier.allNiveauScolaireAttestations();
	}
	
}
