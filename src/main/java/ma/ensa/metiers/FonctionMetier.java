package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Fonction;

public interface FonctionMetier {


	public Fonction addFonction(Fonction fonction);
	public void updateFonction(Fonction fonction);
	public Fonction getFonctionById(Long id);
	public List<Fonction> allFonctions();
}
