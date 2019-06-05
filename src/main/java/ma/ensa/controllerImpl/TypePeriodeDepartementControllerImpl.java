package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypePeriodeDepartementController;
import ma.ensa.entities.TypePeriodeDepartement;
import ma.ensa.metiers.TypePeriodeDepartementMetier;

@RestController
@RequestMapping("/parametres/typePeriodeDepartement")
public class TypePeriodeDepartementControllerImpl implements TypePeriodeDepartementController {
 
	@Autowired
	private TypePeriodeDepartementMetier typePeriodeDepartementMetier;
	@Override
	@PostMapping("/getTypePeriodeDepartementById")
	public TypePeriodeDepartement getTypePeriodeDepartementById(@RequestBody Long id) {
		return typePeriodeDepartementMetier.getTypePeriodeDepartementById(id);
	}

	@Override
	@PostMapping("/addTypePeriodeDepartement")
	public TypePeriodeDepartement addTypePeriodeDepartement(@RequestBody TypePeriodeDepartement typePeriodeDepartement) {
		return typePeriodeDepartementMetier.addTypePeriodeDepartement(typePeriodeDepartement);
	}

	@Override
	@PostMapping("/updateTypePeriodeDepartement")
	public void updateTypePeriodeDepartement(@RequestBody TypePeriodeDepartement typePeriodeDepartement) {
		typePeriodeDepartementMetier.updateTypePeriodeDepartement(typePeriodeDepartement);
	}

	@Override
	@GetMapping("/allTypePeriodeDepartements")
	public List<TypePeriodeDepartement> allTypePeriodeDepartements() {
		return typePeriodeDepartementMetier.allTypePeriodeDepartements();
	}
}
