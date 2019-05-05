package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.ProcheController;
import ma.ensa.entities.Proche;
import ma.ensa.metiers.ProcheMetier;

@RestController
@RequestMapping("/proche")
public class ProcheControllerImpl implements ProcheController {
	@Autowired
	private ProcheMetier procheMetier;
	@Override
	@PostMapping("/getProcheById")
	public Proche getProcheById(@RequestBody Long id) {
		return procheMetier.getProcheById(id);
	}

	@Override
	@PostMapping("/addProche")
	public Proche addProche(@RequestBody Proche proche) {
		return procheMetier.addProche(proche);
	}

	@Override
	@PostMapping("/updateProche")
	public void updateProche(@RequestBody Proche proche) {
		procheMetier.updateProche(proche);
	}

	@Override
	@GetMapping("/allProche")
	public List<Proche> allProches() {
		return procheMetier.allProches();
	}
}
