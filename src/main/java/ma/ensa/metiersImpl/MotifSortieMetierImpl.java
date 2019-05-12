package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.MotifSortieDao;
import ma.ensa.entities.MotifSortie;
import ma.ensa.metiers.MotifSortieMetier;

@Service
public class MotifSortieMetierImpl implements MotifSortieMetier {
 
	@Autowired
	private MotifSortieDao dao;
	@Override
	public MotifSortie getMotifSortieById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public MotifSortie addMotifSortie(MotifSortie motifSortie) {
		return this.dao.save(motifSortie);
	}

	@Override
	public void updateMotifSortie(MotifSortie motifSortie) {
		this.dao.save(motifSortie);
	}

	@Override
	public List<MotifSortie> allMotifSorties() {
		return this.dao.findAll();
	}

	
}
