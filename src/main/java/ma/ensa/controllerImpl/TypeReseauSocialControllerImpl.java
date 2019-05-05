package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypeReseauSocialController;
import ma.ensa.entities.TypeReseauSocial;
import ma.ensa.metiers.TypeReseauSocialMetier;

@RestController
@RequestMapping("/typeReseauSocial")
public class TypeReseauSocialControllerImpl implements TypeReseauSocialController {
 
	@Autowired
	private TypeReseauSocialMetier typeReseauSocialMetier;
	@Override
	@PostMapping("/getTypeReseauSocialById")
	public TypeReseauSocial getTypeReseauSocialById(@RequestBody Long id) {
		return typeReseauSocialMetier.getTypeReseauSocialById(id);
	}

	@Override
	@PostMapping("/addTypeReseauSocial")
	public TypeReseauSocial addTypeReseauSocial(@RequestBody TypeReseauSocial typeReseauSocial) {
		return typeReseauSocialMetier.addTypeReseauSocial(typeReseauSocial);
	}

	@Override
	@PostMapping("/updateTypeReseauSocial")
	public void updateTypeReseauSocial(@RequestBody TypeReseauSocial typeReseauSocial) {
		typeReseauSocialMetier.updateTypeReseauSocial(typeReseauSocial);
	}

	@Override
	@GetMapping("/allTypeReseauSocials")
	public List<TypeReseauSocial> allTypeReseauSocials() {
		return typeReseauSocialMetier.allTypeReseauSocials();
	}
}
