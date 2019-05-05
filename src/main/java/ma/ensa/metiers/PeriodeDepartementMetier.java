package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.PeriodeDepartement;

public interface PeriodeDepartementMetier {

	public PeriodeDepartement addPeriodeDepartement(PeriodeDepartement periodeDepartement, Long id);
	public void updatePeriodeDepartement(PeriodeDepartement periodeDepartement);
	public PeriodeDepartement getPeriodeDepartementById(Long id);
	public List<PeriodeDepartement> allPeriodeDepartements();
}
