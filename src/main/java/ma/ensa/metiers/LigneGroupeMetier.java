package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.LigneGroupe;

public interface LigneGroupeMetier {


	public LigneGroupe addLigneGroupe(LigneGroupe ligneGroupe, Long id);
	public void updateLigneGroupe(LigneGroupe ligneGroupe);
	public LigneGroupe getLigneGroupeById(Long id);
	public List<LigneGroupe> allLigneGroupes();
}
