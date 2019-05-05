package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.VilleDao;
import ma.ensa.entities.Ville;
import ma.ensa.metiers.VilleMetier;

@Service
public class VilleMetierImpl implements VilleMetier {
 
	@Autowired
	private VilleDao dao;
	@Override
	public Ville getVilleById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Ville addVille(Ville ville) {
		return this.dao.save(ville);
	}

	@Override
	public void updateVille(Ville ville) {
		this.dao.save(ville);
	}

	@Override
	public List<Ville> allVilles() {
		return this.dao.findAll();
	}

	
}
