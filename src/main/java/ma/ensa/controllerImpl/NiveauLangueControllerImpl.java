package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.NiveauLangueController;
import ma.ensa.entities.NiveauLangue;
import ma.ensa.metiers.NiveauLangueMetier;

@RestController
@RequestMapping("/parametres/niveauLangue")
public class NiveauLangueControllerImpl implements NiveauLangueController {
 
	@Autowired
	private NiveauLangueMetier niveauLangueMetier;
	@Override
	@PostMapping("/getNiveauLangueById")
	public NiveauLangue getNiveauLangueById(@RequestBody Long id) {
		return niveauLangueMetier.getNiveauLangueById(id);
	}

	@Override
	@PostMapping("/addNiveauLangue")
	public NiveauLangue addNiveauLangue(@RequestBody NiveauLangue niveauLangue) {
		return niveauLangueMetier.addNiveauLangue(niveauLangue);
	}

	@Override
	@PostMapping("/updateNiveauLangue")
	public void updateNiveauLangue(@RequestBody NiveauLangue niveauLangue) {
		niveauLangueMetier.updateNiveauLangue(niveauLangue);
	}

	@Override
	@GetMapping("/allNiveauLangues")
	public List<NiveauLangue> allNiveauLangues() {
		return niveauLangueMetier.allNiveauLangues();
	}
}
