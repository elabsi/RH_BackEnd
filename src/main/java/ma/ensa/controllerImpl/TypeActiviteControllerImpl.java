package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypeActiviteController;
import ma.ensa.entities.TypeActivite;
import ma.ensa.metiers.TypeActiviteMetier;

@RestController
@RequestMapping("/typeActivite")
public class TypeActiviteControllerImpl implements TypeActiviteController {
	@Autowired
	private TypeActiviteMetier typeActiviteMetier;
	@Override
	@PostMapping("/getTypeActiviteById")
	public TypeActivite getTypeActiviteById(@RequestBody Long id) {
		return typeActiviteMetier.getTypeActiviteById(id);
	}

	@Override
	@PostMapping("/addTypeActivite")
	public TypeActivite addTypeActivite(@RequestBody TypeActivite typeActivite) {
		return typeActiviteMetier.addTypeActivite(typeActivite);
	}

	@Override
	@PostMapping("/updateTypeActivite")
	public void updateTypeActivite(@RequestBody TypeActivite typeActivite) {
		typeActiviteMetier.updateTypeActivite(typeActivite);
	}

	@Override
	@GetMapping("/allTypeActivites")
	public List<TypeActivite> allTypeActivites() {
		return typeActiviteMetier.allTypeActivites();
	}

	
}
