package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypeTelephoneController;
import ma.ensa.entities.TypeTelephone;
import ma.ensa.metiers.TypeTelephoneMetier;

@RestController
@RequestMapping("/typeTelephone")
public class TypeTelephoneControllerImpl implements TypeTelephoneController {
 
	@Autowired
	private TypeTelephoneMetier typeTelephoneMetier;
	@Override
	@PostMapping("/getTypeTelephoneById")
	public TypeTelephone getTypeTelephoneById(@RequestBody Long id) {
		return typeTelephoneMetier.getTypeTelephoneById(id);
	}

	@Override
	@PostMapping("/addTypeTelephone")
	public TypeTelephone addTypeTelephone(@RequestBody TypeTelephone typeTelephone) {
		return typeTelephoneMetier.addTypeTelephone(typeTelephone);
	}

	@Override
	@PostMapping("/updateTypeTelephone")
	public void updateTypeTelephone(@RequestBody TypeTelephone typeTelephone) {
		typeTelephoneMetier.updateTypeTelephone(typeTelephone);
	}

	@Override
	@GetMapping("/allTypeTelephones")
	public List<TypeTelephone> allTypeTelephones() {
		return typeTelephoneMetier.allTypeTelephones();
	}
	
}
