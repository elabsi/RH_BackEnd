package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.StatusProfessionnelController;
import ma.ensa.entities.StatusProfessionnel;
import ma.ensa.metiers.StatusProfessionnelMetier;

@RestController
@RequestMapping("parametres/statusProfessionnel")
public class StatusProfessionnelControllerImpl implements StatusProfessionnelController {
	@Autowired
	private StatusProfessionnelMetier statusProfessionnelMetier;
	@Override
	@PostMapping("/getStatusProfessionnelById")
	public StatusProfessionnel getStatusProfessionnelById(@RequestBody Long id) {
		return statusProfessionnelMetier.getStatusProfessionnelById(id);
	}

	@Override
	@PostMapping("/addStatusProfessionnel")
	public StatusProfessionnel addStatusProfessionnel(@RequestBody StatusProfessionnel statusProfessionnel) {
		return statusProfessionnelMetier.addStatusProfessionnel(statusProfessionnel);
	}

	@Override
	@PostMapping("/updateStatusProfessionnel")
	public void updateStatusProfessionnel(@RequestBody StatusProfessionnel statusProfessionnel) {
		statusProfessionnelMetier.updateStatusProfessionnel(statusProfessionnel);
	}

	@Override
	@GetMapping("/allStatusProfessionnels")
	public List<StatusProfessionnel> allStatusProfessionnels() {
		return statusProfessionnelMetier.allStatusProfessionnels();
	}
}
