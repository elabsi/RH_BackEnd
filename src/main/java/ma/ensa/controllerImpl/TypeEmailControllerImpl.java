package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypeEmailController;
import ma.ensa.entities.TypeEmail;
import ma.ensa.metiers.TypeEmailMetier;

@RestController
@RequestMapping("/parametres/typeEmail")
public class TypeEmailControllerImpl implements TypeEmailController{
	@Autowired
	private TypeEmailMetier typeEmailMetier;
	@Override
	@PostMapping("/getTypeEmailById")
	public TypeEmail getTypeEmailById(@RequestBody Long id) {
		return typeEmailMetier.getTypeEmailById(id);
	}

	@Override
	@PostMapping("/addTypeEmail")
	public TypeEmail addTypeEmail(@RequestBody TypeEmail typeEmail) {
		return typeEmailMetier.addTypeEmail(typeEmail);
	}

	@Override
	@PostMapping("/updateTypeEmail")
	public void updateTypeEmail(@RequestBody TypeEmail typeEmail) {
		typeEmailMetier.updateTypeEmail(typeEmail);
	}

	@Override
	@GetMapping("/allTypeEmails")
	public List<TypeEmail> allTypeEmails() {
		return typeEmailMetier.allTypeEmails();
	}
}
