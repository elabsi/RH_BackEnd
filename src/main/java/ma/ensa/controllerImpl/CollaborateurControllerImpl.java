package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.CollaborateurController;
import ma.ensa.entities.Collaborateur;
import ma.ensa.metiers.CollaborateurMetier;

@RestController
@RequestMapping("/collaborateur")
public class CollaborateurControllerImpl implements CollaborateurController {
 
	@Autowired
	private CollaborateurMetier collaborateurMetier;
	@Override
	@RequestMapping("/collaborateur/{id}")
	public Collaborateur getCollaborateurById(@PathVariable Long id) {
		return collaborateurMetier.getCollaborateurById(id);
	}

	@Override
	@PostMapping("/addCollaborateur")
	public Collaborateur addCollaborateur(@RequestBody Collaborateur collaborateur) {
		return collaborateurMetier.addCollaborateur(collaborateur);
	}

	@Override
	@PostMapping("/updateCollaborateur")
	public void updateCollaborateur(@RequestBody Collaborateur collaborateur) {
		collaborateurMetier.updateCollaborateur(collaborateur);
	}

	@Override
	@GetMapping("/allCollaborateurs")
	public List<Collaborateur> allCollaborateurs() {
		return collaborateurMetier.allCollaborateurs();
	}

	@Override
	@RequestMapping("/search")
	public List<Collaborateur> search(
			@RequestParam(name = "q") String q,
			@RequestParam(name = "page") int page,
			@RequestParam(name = "size") int size ) {
		return this.collaborateurMetier.search(q, page, size);
	}

	@Override
	@RequestMapping("/countCollaborateur")
	public int countCollaborateur(@RequestParam(name = "q") String q) {
		return this.collaborateurMetier.countCollaborateur(q);
	}
	
}
