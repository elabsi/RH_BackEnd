package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.RumenirationController;
import ma.ensa.entities.Rumeniration;
import ma.ensa.metiers.RumenirationMetier;

@RestController
@RequestMapping("/rumeniration")
public class RumenirationControllerImpl implements RumenirationController {
 
	@Autowired
	private RumenirationMetier rumenirationMetier;
	@Override
	@PostMapping("/getRumenirationById")
	public Rumeniration getRumenirationById(@RequestBody Long id) {
		return rumenirationMetier.getRumenirationById(id);
	}

	@Override
	@PostMapping("/addRumeniration")
	public Rumeniration addRumeniration(@RequestBody Rumeniration rumeniration) {
		return rumenirationMetier.addRumeniration(rumeniration);
	}

	@Override
	@PostMapping("/updateRumeniration")
	public void updateRumeniration(@RequestBody Rumeniration rumeniration) {
		rumenirationMetier.updateRumeniration(rumeniration);
	}

	@Override
	@GetMapping("/allRumenirations")
	public List<Rumeniration> allRumenirations() {
		return rumenirationMetier.allRumenirations();
	}

}
