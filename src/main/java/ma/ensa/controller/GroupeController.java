package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Groupe;

public interface GroupeController{


	public Groupe addGroupe(Groupe groupe);
	public void updateGroupe(Groupe groupe);
	public Groupe getGroupeById(Long id);
	public List<Groupe> allGroupes();
}
