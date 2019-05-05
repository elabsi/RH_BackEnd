package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypeContratController;
import ma.ensa.entities.TypeContrat;
import ma.ensa.metiers.TypeContratMetier;

@RestController
@RequestMapping("/typeContrat")
public class TypeContratControllerImpl implements TypeContratController {
 
	@Autowired
	private TypeContratMetier typeContratMetier;
	@Override
	@PostMapping("/getTypeContratById")
	public TypeContrat getTypeContratById(@RequestBody Long id) {
		return typeContratMetier.getTypeContratById(id);
	}

	@Override
	@PostMapping("/addTypeContrat")
	public TypeContrat addTypeContrat(@RequestBody TypeContrat typeContrat) {
		return typeContratMetier.addTypeContrat(typeContrat);
	}

	@Override
	@PostMapping("/updateTypeContrat")
	public void updateTypeContrat(@RequestBody TypeContrat typeContrat) {
		typeContratMetier.updateTypeContrat(typeContrat);
	}

	@Override
	@GetMapping("/allTypeContrats")
	public List<TypeContrat> allTypeContrats() {
		return typeContratMetier.allTypeContrats();
	}
}
