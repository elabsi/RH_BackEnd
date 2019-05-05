package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypeSalaireController;
import ma.ensa.entities.TypeSalaire;
import ma.ensa.metiers.TypeSalaireMetier;

@RestController
@RequestMapping("/typeSalaire")
public class TypeSalaireControllerImpl implements TypeSalaireController {
	@Autowired
	private TypeSalaireMetier typeSalaireMetier;
	@Override
	@PostMapping("/getTypeSalaireById")
	public TypeSalaire getTypeSalaireById(@RequestBody Long id) {
		return typeSalaireMetier.getTypeSalaireById(id);
	}

	@Override
	@PostMapping("/addTypeSalaire")
	public TypeSalaire addTypeSalaire(@RequestBody TypeSalaire typeSalaire) {
		return typeSalaireMetier.addTypeSalaire(typeSalaire);
	}

	@Override
	@PostMapping("/updateTypeSalaire")
	public void updateTypeSalaire(@RequestBody TypeSalaire typeSalaire) {
		typeSalaireMetier.updateTypeSalaire(typeSalaire);
	}

	@Override
	@GetMapping("/allTypeSalaires")
	public List<TypeSalaire> allTypeSalaires() {
		return typeSalaireMetier.allTypeSalaires();
	}
	
}
