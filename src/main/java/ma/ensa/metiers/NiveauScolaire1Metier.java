package ma.ensa.metiers;

import ma.ensa.entities.NiveauScolaire1;

public interface NiveauScolaire1Metier {

	public NiveauScolaire1 AddNiveauScolaire1(NiveauScolaire1 niveauScolaire1);
	public void UpdateNiveauScolaire1(NiveauScolaire1 niveauScolaire1);
	public NiveauScolaire1 getNiveauScolaire1ById(Long id);

}
