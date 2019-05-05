package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.PeriodeDepartementControllers;
import ma.ensa.entities.PeriodeDepartement;
import ma.ensa.metiers.PeriodeDepartementMetier;

@RestController
@RequestMapping("/periodeDepartement")
public class PeriodeDepartementControllerImpl implements PeriodeDepartementControllers {
 
	@Autowired
	private PeriodeDepartementMetier periodeDepartementMetier;
	@Override
	@PostMapping("/getPeriodeDepartementById")
	public PeriodeDepartement getPeriodeDepartementById(@RequestBody Long id) {
		return periodeDepartementMetier.getPeriodeDepartementById(id);
	}

	@Override
	@PostMapping("/addPeriodeDepartement/{id}")
	public PeriodeDepartement addPeriodeDepartement(@RequestBody PeriodeDepartement periodeDepartement,@PathVariable Long id) {
		return periodeDepartementMetier.addPeriodeDepartement(periodeDepartement, id);
	}

	@Override
	@PostMapping("/updatePeriodeDepartement")
	public void updatePeriodeDepartement(@RequestBody PeriodeDepartement periodeDepartement) {
		periodeDepartementMetier.updatePeriodeDepartement(periodeDepartement);
	}

	@Override
	@GetMapping("/allPeriodeDepartement")
	public List<PeriodeDepartement> allPeriodeDepartements() {
		return periodeDepartementMetier.allPeriodeDepartements();
	}

	
}
