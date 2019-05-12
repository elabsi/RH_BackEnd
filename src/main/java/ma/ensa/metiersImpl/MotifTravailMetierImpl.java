package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.MotifTravailDao;
import ma.ensa.entities.MotifTravail;
import ma.ensa.metiers.MotifTravailMetier;

@Service
public class MotifTravailMetierImpl implements MotifTravailMetier {
 
	@Autowired
	private MotifTravailDao dao;
	@Override
	public MotifTravail getMotifTravailById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public MotifTravail addMotifTravail(MotifTravail motifTravail) {
		return this.dao.save(motifTravail);
	}

	@Override
	public void updateMotifTravail(MotifTravail motifTravail) {
		this.dao.save(motifTravail);
	}

	@Override
	public List<MotifTravail> allMotifTravails() {
		return this.dao.findAll();
	}

	
}
