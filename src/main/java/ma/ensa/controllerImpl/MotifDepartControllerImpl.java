package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.MotifDepartController;
import ma.ensa.entities.MotifDepart;
import ma.ensa.metiers.MotifDepartMetier;

@RestController
@RequestMapping("/motifDepart")
public class MotifDepartControllerImpl implements MotifDepartController {
 
	@Autowired
	private MotifDepartMetier categorieMetier;
	@Override
	@PostMapping("/getMotifDepartById")
	public MotifDepart getMotifDepartById(@RequestBody Long id) {
		return categorieMetier.getMotifDepartById(id);
	}

	@Override
	@PostMapping("/addMotifDepart")
	public MotifDepart addMotifDepart(@RequestBody MotifDepart categorie) {
		return categorieMetier.addMotifDepart(categorie);
	}

	@Override
	@PostMapping("/updateMotifDepart")
	public void updateMotifDepart(@RequestBody MotifDepart categorie) {
		categorieMetier.updateMotifDepart(categorie);
	}

	@Override
	@GetMapping("/allMotifDeparts")
	public List<MotifDepart> allMotifDeparts() {
		return categorieMetier.allMotifDeparts();
	}

	
}
