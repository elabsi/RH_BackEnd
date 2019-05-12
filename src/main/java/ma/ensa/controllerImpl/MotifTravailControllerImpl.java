package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.MotifTravailController;
import ma.ensa.entities.MotifTravail;
import ma.ensa.metiers.MotifTravailMetier;

@RestController
@RequestMapping("/motifTravail")
public class MotifTravailControllerImpl implements MotifTravailController {
 
	@Autowired
	private MotifTravailMetier categorieMetier;
	@Override
	@PostMapping("/getMotifTravailById")
	public MotifTravail getMotifTravailById(@RequestBody Long id) {
		return categorieMetier.getMotifTravailById(id);
	}

	@Override
	@PostMapping("/addMotifTravail")
	public MotifTravail addMotifTravail(@RequestBody MotifTravail categorie) {
		return categorieMetier.addMotifTravail(categorie);
	}

	@Override
	@PostMapping("/updateMotifTravail")
	public void updateMotifTravail(@RequestBody MotifTravail categorie) {
		categorieMetier.updateMotifTravail(categorie);
	}

	@Override
	@GetMapping("/allMotifTravails")
	public List<MotifTravail> allMotifTravails() {
		return categorieMetier.allMotifTravails();
	}

	
}
