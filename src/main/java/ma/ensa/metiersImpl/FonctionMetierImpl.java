package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.FonctionDao;
import ma.ensa.entities.Fonction;
import ma.ensa.metiers.FonctionMetier;

@Service
public class FonctionMetierImpl implements FonctionMetier {
 
	@Autowired
	private FonctionDao dao;
	@Override
	public Fonction getFonctionById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Fonction addFonction(Fonction fct) {
		return this.dao.save(fct);
	}

	@Override
	public void updateFonction(Fonction fct) {
		this.dao.save(fct);
	}

	@Override
	public List<Fonction> allFonctions() {
		return this.dao.findAll();
	}

	
}
