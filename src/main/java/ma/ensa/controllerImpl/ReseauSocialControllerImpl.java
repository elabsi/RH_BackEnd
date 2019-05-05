package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.ReseauSocialController;
import ma.ensa.entities.ReseauSocial;
import ma.ensa.metiers.ReseauSocialMetier;

@RestController
@RequestMapping("/reseauSocial")
public class ReseauSocialControllerImpl implements ReseauSocialController {
	@Autowired
	private ReseauSocialMetier reseauSocialMetier;
	@Override
	@PostMapping("/getReseauSocialById")
	public ReseauSocial getReseauSocialById(@RequestBody Long id) {
		return reseauSocialMetier.getReseauSocialById(id);
	}

	@Override
	@PostMapping("/addReseauSocial/{id}")
	public ReseauSocial addReseauSocial(@RequestBody ReseauSocial reseauSocial, @PathVariable Long id) {
		return reseauSocialMetier.addReseauSocial(reseauSocial, id);
	}

	@Override
	@PostMapping("/updateReseauSocial")
	public void updateReseauSocial(@RequestBody ReseauSocial reseauSocial) {
		reseauSocialMetier.updateReseauSocial(reseauSocial);
	}

	@Override
	@GetMapping("/allReseauSocials")
	public List<ReseauSocial> allReseauSocials() {
		return reseauSocialMetier.allReseauSocials();
	}
	
}
