package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.MotifAbsence;

public interface MotifAbsenceMetier {

	public MotifAbsence addMotifAbsence(MotifAbsence motifAbsence);
	public void updateMotifAbsence(MotifAbsence motifAbsence);
	public MotifAbsence getMotifAbsenceById(Long id);
	public List<MotifAbsence> allMotifAbsences();

}
