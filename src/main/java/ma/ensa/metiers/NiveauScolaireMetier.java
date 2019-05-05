package ma.ensa.metiers;

import ma.ensa.entities.NiveauScolaire;

public interface NiveauScolaireMetier {

	public NiveauScolaire AddNiveauScolaire(NiveauScolaire niveauScolaire);
	public void UpdateNiveauScolaire(NiveauScolaire niveauScolaire);
	public NiveauScolaire getNiveauScolaireById(Long id);

}
