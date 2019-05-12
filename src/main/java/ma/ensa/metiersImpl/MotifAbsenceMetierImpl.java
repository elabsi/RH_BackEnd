package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.MotifAbsenceDao;
import ma.ensa.entities.MotifAbsence;
import ma.ensa.metiers.MotifAbsenceMetier;

@Service
public class MotifAbsenceMetierImpl implements MotifAbsenceMetier {
 
	@Autowired
	private MotifAbsenceDao dao;
	@Override
	public MotifAbsence getMotifAbsenceById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public MotifAbsence addMotifAbsence(MotifAbsence motifAbsence) {
		return this.dao.save(motifAbsence);
	}

	@Override
	public void updateMotifAbsence(MotifAbsence motifAbsence) {
		this.dao.save(motifAbsence);
	}

	@Override
	public List<MotifAbsence> allMotifAbsences() {
		return this.dao.findAll();
	}

	
}
