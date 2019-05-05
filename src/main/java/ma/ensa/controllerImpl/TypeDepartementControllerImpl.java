package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypeDepartementController;
import ma.ensa.entities.TypeDepartement;
import ma.ensa.metiers.TypeDepartementMetier;

@RestController
@RequestMapping("/typeDepartement")
public class TypeDepartementControllerImpl implements TypeDepartementController {
 
	@Autowired
	private TypeDepartementMetier typeDepartementMetier;
	@Override
	@PostMapping("/getTypeDepartementById")
	public TypeDepartement getTypeDepartementById(@RequestBody Long id) {
		return typeDepartementMetier.getTypeDepartementById(id);
	}

	@Override
	@PostMapping("/addTypeDepartement")
	public TypeDepartement addTypeDepartement(@RequestBody TypeDepartement typeDepartement) {
		return typeDepartementMetier.addTypeDepartement(typeDepartement);
	}

	@Override
	@PostMapping("/updateTypeDepartement")
	public void updateTypeDepartement(@RequestBody TypeDepartement typeDepartement) {
		typeDepartementMetier.updateTypeDepartement(typeDepartement);
	}

	@Override
	@GetMapping("/allTypeDepartements")
	public List<TypeDepartement> allTypeDepartements() {
		return typeDepartementMetier.allTypeDepartements();
	}
	
}
