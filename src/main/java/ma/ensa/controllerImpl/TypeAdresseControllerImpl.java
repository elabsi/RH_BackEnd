package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypeAdresseController;
import ma.ensa.entities.TypeAdresse;
import ma.ensa.metiers.TypeAdresseMetier;

@RestController
@RequestMapping("/typeAdresse")
public class TypeAdresseControllerImpl implements TypeAdresseController {
 
	@Autowired
	private TypeAdresseMetier typeAdresseMetier;
	@Override
	@PostMapping("/getTypeAdresseById")
	public TypeAdresse getTypeAdresseById(@RequestBody Long id) {
		return typeAdresseMetier.getTypeAdresseById(id);
	}

	@Override
	@RequestMapping("/addTypeAdresse")
	public TypeAdresse addTypeAdresse(@RequestBody TypeAdresse typeAdresse) {
		return typeAdresseMetier.addTypeAdresse(typeAdresse);
	}

	@Override
	@PostMapping("/updateTypeAdresse")
	public void updateTypeAdresse(@RequestBody TypeAdresse typeAdresse) {
		typeAdresseMetier.updateTypeAdresse(typeAdresse);
	}

	@Override
	@GetMapping("/allTypeAdresses")
	public List<TypeAdresse> allTypeAdresses() {
		return typeAdresseMetier.allTypeAdresses();
	}
}
