package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypeAttestationEntrepriseController;
import ma.ensa.entities.TypeAttestationEntreprise;
import ma.ensa.metiers.TypeAttestationEntrepriseMetier;

@RestController
@RequestMapping("/parametres/typeAttestationEntreprise")
public class TypeAttestationEntrepriseControllerImpl implements TypeAttestationEntrepriseController {

	@Autowired
	private TypeAttestationEntrepriseMetier typeAttestationEntrepriseMetier;
	@Override
	@PostMapping("/getTypeAttestationEntrepriseById")
	public TypeAttestationEntreprise getTypeAttestationEntrepriseById(@RequestBody Long id) {
		return typeAttestationEntrepriseMetier.getTypeAttestationEntrepriseById(id);
	}

	@Override
	@PostMapping("/addTypeAttestationEntreprise")
	public TypeAttestationEntreprise addTypeAttestationEntreprise(@RequestBody TypeAttestationEntreprise typeAttestationEntreprise) {
		return typeAttestationEntrepriseMetier.addTypeAttestationEntreprise(typeAttestationEntreprise);
	}

	@Override
	@PostMapping("/updateTypeAttestationEntreprise")
	public void updateTypeAttestationEntreprise(@RequestBody TypeAttestationEntreprise typeAttestationEntreprise) {
		typeAttestationEntrepriseMetier.updateTypeAttestationEntreprise(typeAttestationEntreprise);
	}

	@Override
	@GetMapping("/allTypeAttestationEntreprises")
	public List<TypeAttestationEntreprise> allTypeAttestationEntreprises() {
		return typeAttestationEntrepriseMetier.allTypeAttestationEntreprises();
	}
}
