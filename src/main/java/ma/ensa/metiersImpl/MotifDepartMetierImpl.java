package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.MotifDepartDao;
import ma.ensa.entities.MotifDepart;
import ma.ensa.metiers.MotifDepartMetier;

@Service
public class MotifDepartMetierImpl implements MotifDepartMetier {
 
	@Autowired
	private MotifDepartDao dao;
	@Override
	public MotifDepart getMotifDepartById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public MotifDepart addMotifDepart(MotifDepart motifDepart) {
		return this.dao.save(motifDepart);
	}

	@Override
	public void updateMotifDepart(MotifDepart motifDepart) {
		this.dao.save(motifDepart);
	}

	@Override
	public List<MotifDepart> allMotifDeparts() {
		return this.dao.findAll();
	}

	
}
