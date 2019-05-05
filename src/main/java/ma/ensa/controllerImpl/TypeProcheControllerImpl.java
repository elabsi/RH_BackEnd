package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypeProcheController;
import ma.ensa.entities.TypeProche;
import ma.ensa.metiers.TypeProcheMetier;

@RestController
@RequestMapping("/typeProche")
public class TypeProcheControllerImpl implements TypeProcheController {
 
	@Autowired
	private TypeProcheMetier typeProcheMetier;
	@Override
	@PostMapping("/getTypeProcheById")
	public TypeProche getTypeProcheById(@RequestBody Long id) {
		return typeProcheMetier.getTypeProcheById(id);
	}

	@Override
	@PostMapping("/addTypeProche")
	public TypeProche addTypeProche(@RequestBody TypeProche typeProche) {
		return typeProcheMetier.addTypeProche(typeProche);
	}

	@Override
	@PostMapping("/updateTypeProche")
	public void updateTypeProche(@RequestBody TypeProche typeProche) {
		typeProcheMetier.updateTypeProche(typeProche);
	}

	@Override
	@GetMapping("/allTypeProches")
	public List<TypeProche> allTypeProches() {
		return typeProcheMetier.allTypeProches();
	}

	
}
