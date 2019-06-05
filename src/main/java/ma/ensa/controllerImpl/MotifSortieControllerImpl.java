package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.MotifSortieController;
import ma.ensa.entities.MotifSortie;
import ma.ensa.metiers.MotifSortieMetier;

@RestController
@RequestMapping("/parametres/motifSortie")
public class MotifSortieControllerImpl implements MotifSortieController {
 
	@Autowired
	private MotifSortieMetier categorieMetier;
	@Override
	@PostMapping("/getMotifSortieById")
	public MotifSortie getMotifSortieById(@RequestBody Long id) {
		return categorieMetier.getMotifSortieById(id);
	}

	@Override
	@PostMapping("/addMotifSortie")
	public MotifSortie addMotifSortie(@RequestBody MotifSortie categorie) {
		return categorieMetier.addMotifSortie(categorie);
	}

	@Override
	@PostMapping("/updateMotifSortie")
	public void updateMotifSortie(@RequestBody MotifSortie categorie) {
		categorieMetier.updateMotifSortie(categorie);
	}

	@Override
	@GetMapping("/allMotifSorties")
	public List<MotifSortie> allMotifSorties() {
		return categorieMetier.allMotifSorties();
	}

	
}
