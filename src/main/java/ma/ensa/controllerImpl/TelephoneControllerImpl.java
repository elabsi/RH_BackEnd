package ma.ensa.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TelephoneController;
import ma.ensa.entities.Telephone;
import ma.ensa.metiers.TelephoneMetier;

@RestController
@RequestMapping("/telephone")
public class TelephoneControllerImpl implements TelephoneController {
 
	@Autowired
	private TelephoneMetier telephoneMetier;
	@Override
	@PostMapping("/getTelephoneById")
	public Telephone getTelephoneById(@RequestBody Long id) {
		return telephoneMetier.getTelephoneById(id);
	}

	@Override
	@PostMapping("/addTelephone/{id}")
	public Telephone addTelephone(@RequestBody Telephone telephone, @PathVariable Long id) {
		return telephoneMetier.addTelephone(telephone, id);
	}

	@Override
	@PostMapping("/updateTelephone")
	public void updateTelephone(@RequestBody Telephone telephone) {
		telephoneMetier.updateTelephone(telephone);
	}

	@Override
	@GetMapping("/allTelephones")
	public List<Telephone> allTelephones() {
		return telephoneMetier.allTelephones();
	}

	
}
