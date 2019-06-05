package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.CategorieController;
import ma.ensa.entities.Categorie;
import ma.ensa.metiers.CategorieMetier;

@RestController
@RequestMapping("/parametres/categorie")
public class CategorieControllerImpl implements CategorieController {
 
	@Autowired
	private CategorieMetier categorieMetier;
	@Override
	@PostMapping("/getCategorieById")
	public Categorie getCategorieById(@RequestBody Long id) {
		return categorieMetier.getCategorieById(id);
	}

	@Override
	@PostMapping("/addCategorie")
	public Categorie addCategorie(@RequestBody Categorie categorie) {
		return categorieMetier.addCategorie(categorie);
	}

	@Override
	@PostMapping("/updateCategorie")
	public void updateCategorie(@RequestBody Categorie categorie) {
		categorieMetier.updateCategorie(categorie);
	}

	@Override
	@GetMapping("/allCategories")
	public List<Categorie> allCategories() {
		return categorieMetier.allCategories();
	}

	
}
