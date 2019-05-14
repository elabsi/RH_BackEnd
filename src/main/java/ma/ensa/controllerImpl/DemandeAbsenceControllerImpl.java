package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.DemandeAbsenceController;
import ma.ensa.entities.DemandeAbsence;
import ma.ensa.metiers.DemandeAbsenceMetier;

@RestController
@RequestMapping("/demandeAbsence")
public class DemandeAbsenceControllerImpl implements DemandeAbsenceController {
 
	@Autowired
	private DemandeAbsenceMetier demandeAbsenceMetier;
	@Override
	@PostMapping("/getDemandeAbsenceById")
	public DemandeAbsence getDemandeAbsenceById(@RequestBody Long id) {
		return demandeAbsenceMetier.getDemandeAbsenceById(id);
	}

	@Override
	@PostMapping("/addDemandeAbsence")
	public DemandeAbsence addDemandeAbsence(@RequestBody DemandeAbsence demandeAbsence) {
		return demandeAbsenceMetier.addDemandeAbsence(demandeAbsence);
	}

	@Override
	@PostMapping("/updateDemandeAbsence")
	public void updateDemandeAbsence(@RequestBody DemandeAbsence demandeAbsence) {
		demandeAbsenceMetier.updateDemandeAbsence(demandeAbsence);
	}

	@Override
	@GetMapping("/allDemandeAbsences")
	public List<DemandeAbsence> allDemandeAbsences() {
		return demandeAbsenceMetier.allDemandeAbsences();
	}
	
}
