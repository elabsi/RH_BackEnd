package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.VisiteurDao;
import ma.ensa.entities.Visiteur;
import ma.ensa.metiers.VisiteurMetier;

@Service
public class VisiteurMetierImpl implements VisiteurMetier {
 
	@Autowired
	private VisiteurDao dao;
	@Override
	public Visiteur getVisiteurById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Visiteur addVisiteur(Visiteur visiteur) {
		return this.dao.save(visiteur);
	}

	@Override
	public void updateVisiteur(Visiteur visiteur) {
		this.dao.save(visiteur);
	}

	@Override
	public List<Visiteur> allVisiteurs() {
		return this.dao.findAll();
	}

	
}
