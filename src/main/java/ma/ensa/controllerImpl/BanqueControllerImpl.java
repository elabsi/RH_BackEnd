package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.BanqueController;
import ma.ensa.entities.Banque;
import ma.ensa.metiers.BanqueMetier;

@RestController
@RequestMapping("/banque")
public class BanqueControllerImpl implements BanqueController {
 
	@Autowired
	private BanqueMetier banqueMetier;
	@Override
	@PostMapping("/getBanqueById")
	public Banque getBanqueById(@RequestBody Long id) {
		return banqueMetier.getBanqueById(id);
	}

	@Override
	@PostMapping("/addBanque")
	public Banque addBanque(@RequestBody Banque banque) {
		return banqueMetier.addBanque(banque);
	}

	@Override
	@PostMapping("/updateBanque")
	public void updateBanque(@RequestBody Banque banque) {
		banqueMetier.updateBanque(banque);
	}

	@Override
	@GetMapping("/allBanques")
	public List<Banque> allBanques() {
		return banqueMetier.allBanques();
	}

	
}
