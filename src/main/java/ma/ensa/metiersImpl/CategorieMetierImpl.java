package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.CategorieDao;
import ma.ensa.entities.Categorie;
import ma.ensa.metiers.CategorieMetier;

@Service
public class CategorieMetierImpl implements CategorieMetier {
 
	@Autowired
	private CategorieDao dao;
	@Override
	public Categorie getCategorieById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Categorie addCategorie(Categorie cat) {
		return this.dao.save(cat);
	}

	@Override
	public void updateCategorie(Categorie cat) {
		this.dao.save(cat);
	}

	@Override
	public List<Categorie> allCategories() {
		return this.dao.findAll();
	}

	
}
