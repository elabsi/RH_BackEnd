package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Fonction;

public interface FonctionController {


	public Fonction addFonction(Fonction fonction);
	public void updateFonction(Fonction fonction);
	public Fonction getFonctionById(Long id);
	public List<Fonction> allFonctions();
}
