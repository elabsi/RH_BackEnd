package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.AttestationFormationController;
import ma.ensa.entities.AttestationFormation;
import ma.ensa.metiers.AttestationFormationMetier;

@RestController
@RequestMapping("/attestationFormation")
public class AttestationFormationControllerImpl implements AttestationFormationController {
 
	@Autowired
	private AttestationFormationMetier attestationFormationMetier;
	@Override
	@PostMapping("/getAttestationFormationById")
	public AttestationFormation getAttestationFormationById(@RequestBody Long id) {
		return attestationFormationMetier.getAttestationFormationById(id);
	}

	@Override
	@PostMapping("/addAttestationFormation/{id}")
	public AttestationFormation addAttestationFormation(@RequestBody AttestationFormation att, @PathVariable Long id) {
		return attestationFormationMetier.addAttestationFormation(att,id);
	}

	@Override
	@PostMapping("/updateAttestationFormation")
	public void updateAttestationFormation(@RequestBody AttestationFormation att) {
		attestationFormationMetier.updateAttestationFormation(att);
	}

	@Override
	@GetMapping("/allAttestationFormation")
	public List<AttestationFormation> allAttestationFormations() {
		return attestationFormationMetier.allAttestationFormations();
	}

	
}
