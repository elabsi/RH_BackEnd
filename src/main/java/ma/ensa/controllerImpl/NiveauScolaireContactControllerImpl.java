package ma.ensa.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.NiveauScolaireContactController;
import ma.ensa.entities.NiveauScolaireContact;
import ma.ensa.metiers.NiveauScolaireContactMetier;

@RestController
@RequestMapping("/parametres/niveauScolaireContact")
public class NiveauScolaireContactControllerImpl implements NiveauScolaireContactController{
 
	@Autowired
	private NiveauScolaireContactMetier niveauScolaireContactMetier;
	@Override
	@PostMapping("/getNiveauScolaireContactById")
	public NiveauScolaireContact getNiveauScolaireContactById(@RequestBody Long id) {
		return niveauScolaireContactMetier.getNiveauScolaireContactById(id);
	}

	@Override
	@PostMapping("/addNiveauScolaireContact")
	public NiveauScolaireContact addNiveauScolaireContact(@RequestBody NiveauScolaireContact niveauScolaireContact) {
		return niveauScolaireContactMetier.addNiveauScolaireContact(niveauScolaireContact);
	}

	@Override
	@PostMapping("/updateNiveauScolaireContact")
	public void updateNiveauScolaireContact(@RequestBody NiveauScolaireContact niveauScolaireContact) {
		niveauScolaireContactMetier.updateNiveauScolaireContact(niveauScolaireContact);
	}

	@Override
	@GetMapping("/allNiveauScolaireContacts")
	public List<NiveauScolaireContact> allNiveauScolaireContacts() {
		return niveauScolaireContactMetier.allNiveauScolaireContacts();
	}

	
}
