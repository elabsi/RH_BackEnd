package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.HistoriqueController;
import ma.ensa.entities.Historique;
import ma.ensa.metiers.HistoriqueMetier;

@RestController
@RequestMapping("/historique")
public class HistoriqueControllerImpl implements HistoriqueController {
 
	@Autowired
	private HistoriqueMetier historiqueMetier;
	@Override
	@PostMapping("/getHistoriqueById")
	public Historique getHistoriqueById(@RequestBody Long id) {
		return historiqueMetier.getHistoriqueById(id);
	}

	@Override
	@PostMapping("/addHistorique")
	public Historique addHistorique(@RequestBody Historique historique) {
		return historiqueMetier.addHistorique(historique);
	}

	@Override
	@PostMapping("/updateHistorique")
	public void updateHistorique(@RequestBody Historique historique) {
		historiqueMetier.updateHistorique(historique);
	}

	@Override
	@GetMapping("/allHistorique")
	public List<Historique> allHistoriques() {
		return historiqueMetier.allHistoriques();
	}
}
