package ma.ensa.controller;


import java.util.List;

import ma.ensa.entities.Specialite;

public interface SpecialiteController {

	public Specialite addSpecialite(Specialite specialite);
	public void updateSpecialite(Specialite specialite);
	public Specialite getSpecialiteById(Long id);
	public List<Specialite> allSpecialites();
}
