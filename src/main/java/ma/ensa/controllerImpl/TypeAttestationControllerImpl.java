package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypeAttestationController;
import ma.ensa.entities.TypeAttestation;
import ma.ensa.metiers.TypeAttestationMetier;

@RestController
@RequestMapping("/parametres/typeAttestation")
public class TypeAttestationControllerImpl implements TypeAttestationController {
	@Autowired
	private TypeAttestationMetier typeAttestationMetier;
	@Override
	@PostMapping("/getTypeAttestationById")
	public TypeAttestation getTypeAttestationById(@RequestBody Long id) {
		return typeAttestationMetier.getTypeAttestationById(id);
	}

	@Override
	@PostMapping("/addTypeAttestation")
	public TypeAttestation addTypeAttestation(@RequestBody TypeAttestation typeAttestation) {
		return typeAttestationMetier.addTypeAttestation(typeAttestation);
	}

	@Override
	@PostMapping("/updateTypeAttestation")
	public void updateTypeAttestation(@RequestBody TypeAttestation typeAttestation) {
		typeAttestationMetier.updateTypeAttestation(typeAttestation);
	}

	@Override
	@GetMapping("/allTypeAttestations")
	public List<TypeAttestation> allTypeAttestations() {
		return typeAttestationMetier.allTypeAttestations();
	}
}
