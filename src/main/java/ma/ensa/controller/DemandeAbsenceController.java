package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.DemandeAbsence;


public interface DemandeAbsenceController{

	public DemandeAbsence addDemandeAbsence(DemandeAbsence departement);
	public void updateDemandeAbsence(DemandeAbsence departement);
	public DemandeAbsence getDemandeAbsenceById(Long id);
	public List<DemandeAbsence> allDemandeAbsences();

}
