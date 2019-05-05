package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.DepartementController;
import ma.ensa.entities.Departement;
import ma.ensa.metiers.DepartementMetier;

@RestController
@RequestMapping("/departement")
public class DepartementControllerImpl implements DepartementController {
 
	@Autowired
	private DepartementMetier departementMetier;
	@Override
	@PostMapping("/getDepartementById")
	public Departement getDepartementById(@RequestBody Long id) {
		return departementMetier.getDepartementById(id);
	}

	@Override
	@PostMapping("/addDepartement")
	public Departement addDepartement(@RequestBody Departement departement) {
		return departementMetier.addDepartement(departement);
	}

	@Override
	@PostMapping("/updateDepartement")
	public void updateDepartement(@RequestBody Departement departement) {
		departementMetier.updateDepartement(departement);
	}

	@Override
	@GetMapping("/allDepartements")
	public List<Departement> allDepartements() {
		return departementMetier.allDepartements();
	}
	
}
