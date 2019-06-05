package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.MotifAbsenceController;
import ma.ensa.entities.MotifAbsence;
import ma.ensa.metiers.MotifAbsenceMetier;

@RestController
@RequestMapping("/parametres/motifAbsence")
public class MotifAbsenceControllerImpl implements MotifAbsenceController {
 
	@Autowired
	private MotifAbsenceMetier categorieMetier;
	@Override
	@PostMapping("/getMotifAbsenceById")
	public MotifAbsence getMotifAbsenceById(@RequestBody Long id) {
		return categorieMetier.getMotifAbsenceById(id);
	}

	@Override
	@PostMapping("/addMotifAbsence")
	public MotifAbsence addMotifAbsence(@RequestBody MotifAbsence categorie) {
		return categorieMetier.addMotifAbsence(categorie);
	}

	@Override
	@PostMapping("/updateMotifAbsence")
	public void updateMotifAbsence(@RequestBody MotifAbsence categorie) {
		categorieMetier.updateMotifAbsence(categorie);
	}

	@Override
	@GetMapping("/allMotifAbsences")
	public List<MotifAbsence> allMotifAbsences() {
		return categorieMetier.allMotifAbsences();
	}

	
}
