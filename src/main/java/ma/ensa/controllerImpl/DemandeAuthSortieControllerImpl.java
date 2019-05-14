package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.DemandeAuthSortieController;
import ma.ensa.entities.DemandeAuthSortie;
import ma.ensa.metiers.DemandeAuthSortieMetier;

@RestController
@RequestMapping("/demandeAuthSortie")
public class DemandeAuthSortieControllerImpl implements DemandeAuthSortieController {
 
	@Autowired
	private DemandeAuthSortieMetier demandeAuthSortieMetier;
	@Override
	@PostMapping("/getDemandeAuthSortieById")
	public DemandeAuthSortie getDemandeAuthSortieById(@RequestBody Long id) {
		return demandeAuthSortieMetier.getDemandeAuthSortieById(id);
	}

	@Override
	@PostMapping("/addDemandeAuthSortie")
	public DemandeAuthSortie addDemandeAuthSortie(@RequestBody DemandeAuthSortie demandeAuthSortie) {
		return demandeAuthSortieMetier.addDemandeAuthSortie(demandeAuthSortie);
	}

	@Override
	@PostMapping("/updateDemandeAuthSortie")
	public void updateDemandeAuthSortie(@RequestBody DemandeAuthSortie demandeAuthSortie) {
		demandeAuthSortieMetier.updateDemandeAuthSortie(demandeAuthSortie);
	}

	@Override
	@GetMapping("/allDemandeAuthSorties")
	public List<DemandeAuthSortie> allDemandeAuthSorties() {
		return demandeAuthSortieMetier.allDemandeAuthSorties();
	}
	
}
