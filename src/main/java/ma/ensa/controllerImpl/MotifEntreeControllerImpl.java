package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.MotifEntreeController;
import ma.ensa.entities.MotifEntree;
import ma.ensa.metiers.MotifEntreeMetier;

@RestController
@RequestMapping("/parametres/motifEntree")
public class MotifEntreeControllerImpl implements MotifEntreeController {
 
	@Autowired
	private MotifEntreeMetier motifEntreeMetier;
	@Override
	@PostMapping("/getMotifEntreeById")
	public MotifEntree getMotifEntreeById(@RequestBody Long id) {
		return motifEntreeMetier.getMotifEntreeById(id);
	}

	@Override
	@PostMapping("/addMotifEntree")
	public MotifEntree addMotifEntree(@RequestBody MotifEntree motifEntree) {
		return motifEntreeMetier.addMotifEntree(motifEntree);
	}

	@Override
	@PostMapping("/updateMotifEntree")
	public void updateMotifEntree(@RequestBody MotifEntree motifEntree) {
		motifEntreeMetier.updateMotifEntree(motifEntree);
	}

	@Override
	@GetMapping("/allMotifEntrees")
	public List<MotifEntree> allMotifEntrees() {
		return motifEntreeMetier.allMotifEntrees();
	}

	
}
