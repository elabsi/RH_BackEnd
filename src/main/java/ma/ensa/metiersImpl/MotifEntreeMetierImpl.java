package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.MotifEntreeDao;
import ma.ensa.entities.MotifEntree;
import ma.ensa.metiers.MotifEntreeMetier;

@Service
public class MotifEntreeMetierImpl implements MotifEntreeMetier {
 
	@Autowired
	private MotifEntreeDao dao;
	@Override
	public MotifEntree getMotifEntreeById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public MotifEntree addMotifEntree(MotifEntree motifEntree) {
		return this.dao.save(motifEntree);
	}

	@Override
	public void updateMotifEntree(MotifEntree motifEntree) {
		this.dao.save(motifEntree);
	}

	@Override
	public List<MotifEntree> allMotifEntrees() {
		return this.dao.findAll();
	}

	
}
