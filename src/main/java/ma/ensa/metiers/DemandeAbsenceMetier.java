package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.DemandeAbsence;


public interface DemandeAbsenceMetier{

	public DemandeAbsence addDemandeAbsence(DemandeAbsence departement);
	public void updateDemandeAbsence(DemandeAbsence departement);
	public DemandeAbsence getDemandeAbsenceById(Long id);
	public List<DemandeAbsence> allDemandeAbsences();

}
